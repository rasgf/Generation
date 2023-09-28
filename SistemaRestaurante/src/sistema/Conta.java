package sistema;
public class Conta {
    private double total;

    public void adicionarPrato(Pratos prato) {
        total += prato.getPreco();
    }

    public void adicionarGorjeta() {
        total += total * 0.13;
    }

    public double getTotal() {
        return total;
    }
}