package ifelse;
import java.util.Scanner;
public class Ifelse {

public static void main(String[] args) {
		int na, nb, nc;
		Scanner leia = new Scanner(System.in);

	System.out.println("Digite a primeira nota (A): ");
	na = leia.nextInt();
	
	System.out.println("Digite a segunda nota (B): ");
	nb = leia.nextInt();
	
	System.out.println("Digite a terceira nota (C): ");
	nc = leia.nextInt();
	
	int soma = na + nb;
	
	if(soma > nc) {
        System.out.println(na + " + " + nb + " = " + soma + " > " + nc);
        System.out.println("A Soma de A + B é Maior do que C");
    }
    else if (soma == nc) {
        System.out.println(na + " + " + nb + " = " + soma + " = " + nc);
        System.out.println("A Soma de A + B é Igual a C");    
    }
    else {
        System.out.println(na + " + " + nb + " = " + soma + " < " + nc);
        System.out.println("A Soma de A + B é Menor do que C");
    }
	
}
}
