package sistema;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuInicial {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        boolean loop = true;

        Mesa novaMesa = new Mesa();
        Conta conta = new Conta();
        Cardapio menu = new Cardapio();

        JOptionPane.showMessageDialog(null,"Seja bem vinde ao Restaurante do Ricardo!!!11!!ONZE (ノº益º)ノ彡┻━┻");
        do {
            try {
                System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
                System.out.println("Seja bem vinde ao Restaurante de Lámen do Ricardo (ノಠ益ಠ)ノ彡┻━┻");
                System.out.println("* * * * * * * * * * * * * * * * *");

                System.out.println("A mesa possui reserva?");
                boolean reserva = dados.nextBoolean();
                dados.nextLine(); // consome a nova linha

                if (!reserva) {
                    System.out.println("Vai ter que esperar na fila!\n");
                }

                System.out.print("Digite o número da mesa: ");
                int numeroDaMesa = dados.nextInt();
                dados.nextLine(); // consome a nova linha

                novaMesa.setnumMesa(numeroDaMesa);

                System.out.print("\nNúmero de pessoas:  ");
                int pessoas = dados.nextInt();
                dados.nextLine(); // consome a nova linha

                novaMesa.setPessoas(pessoas);
                novaMesa.setReserva(reserva);

                // Exibe o menu e permite que o usuário escolha um lámen
                menu.exibirMenu();
                System.out.print("Escolha um lámen: ");
                int escolha = dados.nextInt() - 1; // subtrai 1 porque a lista começa em 0
                dados.nextLine(); // consome a nova linha

                // Adiciona o lámen escolhido à conta
                Pratos lamenEscolhido = menu.getPrato(escolha);
                conta.adicionarPrato(lamenEscolhido);
                
                System.out.println("Encerrar conta?");
                boolean encerrarConta = dados.nextBoolean();
                if(encerrarConta == true) {
                	loop = false;
                }
            } catch (InputMismatchException e) {
                System.err.println("\nInválido(s).");                
                System.out.println("Insira os dados corretos!");
                dados.nextLine();
            } finally {
                System.out.println("\n");
            }
        } while(loop);

        // Adiciona a gorjeta à conta
        conta.adicionarGorjeta();

        // Exibe o total da conta
        System.out.println("Total da conta: R$" + conta.getTotal());

        
    }
}


