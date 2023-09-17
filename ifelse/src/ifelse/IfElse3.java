package ifelse;

import java.util.Scanner;

public class IfElse3 {
	public static void main(String[] args) {
		int idade;
		boolean carteira;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual sua idade?");
		idade = leia.nextInt();
		
		System.out.println("você tem carteira de motorista?");
		carteira = leia.nextBoolean();
		
		if(idade > 18 && carteira == true) {
			System.out.println("Você pode dirigir");
		}else {
			System.out.println("Não pode dirigir");
		}
	}
	

}
