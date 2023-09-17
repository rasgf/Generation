package loops;
import java.util.Scanner;
public class For1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o Segundo número, sendo este maior que o primeiro: ");
		num2 = leia.nextInt();
		
		if(num1 > num2){
			System.out.println("Inválido! Digite o primeiro número menor que o segundo");
		}
		
		for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " É múltiplo de 3 e 5");
            }
		}
	}
}
