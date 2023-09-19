package poo;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmacia novaFarmacia = new Farmacia();
		
		novaFarmacia.setPreço(18);
		novaFarmacia.setLaboratorio("Médley");
		novaFarmacia.setNome("Rivotril");
		novaFarmacia.setPeso(10);
		novaFarmacia.setValidade(2025);
	
		
		System.out.println("Nome: " + novaFarmacia.getNome());
		System.out.println("Preço: R$ "+ novaFarmacia.getPreço() + ",00");
	}

}
