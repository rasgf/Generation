package sistema;

public abstract class Pratos {
    private String nome;
    private double preco;

    public Pratos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
