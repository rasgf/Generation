package loja;

public abstract class Funcionario {
	
	protected int pis;
	protected String nome;
	protected int idade;
	protected String email;
	protected String telefone;
	
	public Funcionario() {}	
	
	public Funcionario(int pis, String nome, int idade, String email, String telefone) {
		this.pis = pis;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
	}

	public int getPis() {
		return pis;
	}

	public void setPis(int pis) {
		this.pis = pis;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void visualizarFuncionario() {
		System.out.println(this.pis);
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.email);
		System.out.println(this.telefone);
	}
}