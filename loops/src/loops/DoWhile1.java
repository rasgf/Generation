package loops;

import java.util.Scanner;

public class DoWhile1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int soma = 0;
		int num;

		do {
			System.out.println("Digite um número:");
			num = leia.nextInt();

			if (num > 0) {
            soma += num;
			}
		} while (num != 0);{

		System.out.println("A soma de todos os números positivos digitados é: " + soma);
		}
	}
}

