package exemplo;
import java.util.Scanner;
public class ArrayExercicio1 {
	public static void main(String[] args) {
		int vet[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		Scanner leia = new Scanner(System.in);
		
		for(int indice = 0; indice < 10; indice++) {
			System.out.println( "Insira o número: ");
			vet[indice] = leia.nextInt();
		}
		System.out.println("os numeros digitados foram: ");
		for(int indice = 0; indice < 10; indice++) {
            System.out.println((indice + 1) + "º número: " + vet[indice] + "\n");
		}
		
	}
	}


