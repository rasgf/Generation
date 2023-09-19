package poo;

public class Cliente {
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	private int idade, altura;
	private String nome, sobrenome;
	private float peso;
	
	static void falar() {
		System.out.println("AU AU");
		
	}
	static void Dormir() {
		System.out.println("ZZzzzz");
		
	}
	public static void comer() {
		System.out.println("croc croc croc");
		
	}

}
