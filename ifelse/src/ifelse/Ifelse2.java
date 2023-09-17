package ifelse;

import java.util.Scanner;

public class Ifelse2 {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		String saida;
		
		System.out.println("Digite o número: ");
		numero = scanner.nextInt();
		
        saida = "O número " + numero;
        
        if (numero % 2 == 0){ 
           System.out.println(saida += " é par ");
        }else { 
            saida += " é ímpar ";
        }
        if (numero > 0) { 
           System.out.println(saida += "e positivo");
        }else if(numero == 0) {
            System.out.println(saida += "e nulo");
        }else { 
            System.out.println(saida += "e negativo");
        
        }		
			}
		
	}


