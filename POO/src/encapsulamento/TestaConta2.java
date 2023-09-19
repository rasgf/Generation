package encapsulamento;

import contaBancaria.ContaBancaria;

public class TestaConta2 {
	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setNumero(032);
		conta1.setAgencia(22);
		conta1.setTipo("Conta corrente");
		conta1.setTitular("Nelson");
		conta1.setSaldo(9998657);
		
		System.out.println("Número da conta " + conta1.getNumero());
		System.out.println("Número da conta " + conta1.getAgencia());
		System.out.println("Número da conta " + conta1.getTipo());
		System.out.println("Número da conta " + conta1.getTitular());
		System.out.println("Número da conta " + conta1.getSaldo());

	}

}
