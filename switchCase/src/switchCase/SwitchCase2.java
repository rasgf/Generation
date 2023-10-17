package switchCase;

import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int codigoCargo;
		String nomeColab, cargo;
		float salario;
			
		System.out.println("Digite o código do colaborador: ");
		codigoCargo = input.nextInt();

        switch(codigoCargo) {
		case 1:
			System.out.println("Digite o nome do colaborador");
			nomeColab = input.next();
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
            cargo = "Gerente";
            salario += (0.10 * salario);
            System.out.println("Nome do colaborador: " + nomeColab);
            System.out.println("Cargo: " + cargo);
            System.out.printf("Salário: R$ %.2f", salario);
            break;
            
		case 2:		 
			System.out.println("Digite o nome do colaborador");
			nomeColab = input.next();
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
            cargo = "Pessoa vendedora";
            salario += (0.07 * salario);
            System.out.println("Nome do colaborador: " + nomeColab);
            System.out.println("Cargo: " + cargo);
            System.out.printf("Salário: R$ %.2f", salario);
            break;
		case 3:		 
			System.out.println("Digite o nome do colaborador");
			nomeColab = input.next();
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
            cargo = "Pessoa supervisora";
            salario += (0.09 * salario);
            System.out.println("Nome do colaborador: " + nomeColab);
            System.out.println("Cargo: " + cargo);
            System.out.printf("Salário: R$ %.2f", salario);
            break;
		case 4:		 
			System.out.println("Digite o nome do colaborador");
			nomeColab = input.next();
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
            cargo = "Motorista";
            salario += (0.06 * salario);
            System.out.println("Nome do colaborador: " + nomeColab);
            System.out.println("Cargo: " + cargo);
            System.out.printf("Salário: R$ %.2f", salario);
            break;
		case 5:		 
			System.out.println("Digite o nome do colaborador");
			nomeColab = input.next();
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
            cargo = "Estoquista";
            salario += (0.05 * salario);
            System.out.println("Nome do colaborador: "+ nomeColab);
            System.out.println("Cargo: " + cargo);
            System.out.printf("Salário: R$ %.2f", salario);
            break;
		case 6:		 
			System.out.println("Digite o nome do colaborador");
			nomeColab = input.next();
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
            cargo = "Pessoa técnica de TI";
            salario += (0.08 * salario);
            System.out.println("Nome do colaborador: " + nomeColab);
            System.out.println("Cargo: " + cargo);
            System.out.printf("Salário: R$ %.2f", salario);
            break;
            
        default:
            System.out.println("Cargo não localizado.");
		}

}
}
