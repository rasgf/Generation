package loops;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int idade21 = 0;
        int idade50 = 0;

        while (true) {
            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            if (idade < 21) {
                idade21++;
            } else if (idade > 50) {
                idade50++;
            }
        }

        System.out.println("Total de pessoas com menos de 21 anos: " + idade21);
        System.out.println("Total de pessoas com mais de 50 anos: " + idade50);
    }
}
