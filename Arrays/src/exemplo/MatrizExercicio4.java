package exemplo;
import java.util.Scanner;

public class MatrizExercicio4 {
    public static void main(String[] args) {
        double[][] notas = new double[10][4];
        double[] medias = new double[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira as 4 notas do participante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("A média do participante " + (i + 1) + " é: " + medias[i]);
        }
    }
}