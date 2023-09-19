package contaBancaria;

public class testaBancaria {

	public static void main(String[] args) {

		ContaBancaria novaConta = new ContaBancaria();
		
		novaConta.setNumero(32);
		novaConta.setAgencia(453);
		novaConta.setTipo("asasf");
		novaConta.setTitular("Nelson");
		novaConta.setSaldo(9998657);
		
		System.out.println("Número da conta " + novaConta.getNumero());
		System.out.println("Número da conta " + novaConta.getAgencia());
		System.out.println("Número da conta " + novaConta.getTipo());
		System.out.println("Número da conta " + novaConta.getTitular());
		System.out.println("Número da conta " + novaConta.getSaldo());


	}

}
