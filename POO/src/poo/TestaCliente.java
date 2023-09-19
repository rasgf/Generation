package poo;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente novoCliente = new Cliente();
		
		novoCliente.setAltura(175);
		novoCliente.setIdade(35);
		novoCliente.setNome("Juju");
		novoCliente.setSobrenome("Do Pix");
		novoCliente.setPeso(300);
	
		
		System.out.println("Nome: " + novoCliente.getNome() +" "+ novoCliente.getSobrenome());
	}

}
