package switchCase;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int codigo, quantidade;
		double valorTotal;
		String produto;
		boolean ketchup;
		
		System.out.println("digite o código do produto: ");
		codigo = input.nextInt();
		
		
		switch(codigo) {
		case 1:
			System.out.println("Digite a quantidade: ");
			quantidade = input.nextInt();
			System.out.println("Vai querer ketchup?");
			ketchup = input.nextBoolean();
			produto = "Cachorro Quente";
			valorTotal = quantidade * 10.0;
			System.out.printf("Valor total: R$ %.2f ", valorTotal);
			break;
				
		case 2:
			System.out.println("Digite a quantidade: ");
			quantidade = input.nextInt();
			System.out.println("Vai querer ketchup?");
			ketchup = input.nextBoolean();
			produto = "X-Salada";
			valorTotal = quantidade * 15.0;
			System.out.printf("Valor total: R$ %.2f ", valorTotal);
			break;
			
		case 3:
			System.out.println("Digite a quantidade: ");
			quantidade = input.nextInt();
			System.out.println("Vai querer ketchup?");
			ketchup = input.nextBoolean();
			produto = "X-Bacon";
			valorTotal = quantidade * 18.0;
			System.out.printf("Valor total: R$ %.2f ", valorTotal);
			break;
		case 4:
			System.out.println("Digite a quantidade: ");
			quantidade = input.nextInt();
			System.out.println("Vai querer ketchup?");
			ketchup = input.nextBoolean();
			produto = "Bauru";
			valorTotal = quantidade * 12.0;
			System.out.printf("Valor total: R$ %.2f ", valorTotal);
			break;
		case 5:
			System.out.println("Digite a quantidade: ");
			quantidade = input.nextInt();
			System.out.println("Vai querer ketchup?");
			ketchup = input.nextBoolean();
			produto = "Refrigerante";
			valorTotal = quantidade * 8.0;
			System.out.printf("Valor total: R$ %.2f ", valorTotal);
			break;
		case 6:
			System.out.println("Digite a quantidade: ");
			quantidade = input.nextInt();
			System.out.println("Vai querer ketchup?");
			ketchup = input.nextBoolean();
			produto = "Suco de Laranja";
			valorTotal = quantidade * 13.0;
			System.out.printf("Valor total: R$ %.2f ", valorTotal);
			break;
			
			default:
				System.out.println("Produto não localizado");

				}
		}
		
		
		
		
	}

