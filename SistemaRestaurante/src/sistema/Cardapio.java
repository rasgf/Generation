package sistema;
import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Pratos> pratos;

    public Cardapio() {
        pratos = new ArrayList<>();
        pratos.add(new Lamen("Lámen do Narotos", 31.00));
        pratos.add(new Lamen("Lámen de porco", 28.00));
        pratos.add(new Lamen("Lámen vegano", 26.00));
    }

    public void exibirMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < pratos.size(); i++) {
            Pratos prato = pratos.get(i);
            System.out.println((i+1) + ". " + prato.getNome() + " - R$" + prato.getPreco());
        }
    }

    public Pratos getPrato(int indice) {
        return pratos.get(indice);
    }
}