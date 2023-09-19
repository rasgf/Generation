package estruturaDeDados;

public class Fila {
	private int tamanhoMaximo;
	private int[] fila;
	private int inicio;
	private int fim;
	private int total;
	
	public Fila(int s) {
		tamanhoMaximo = s;
		fila = new int[s];
		inicio = 0;
		fim = -1;
		total = 0;
	}
	
	public int pegarInicio() {
		return fila[inicio];
	}
	public int pegarFim() {
		return fila[fim];
	}
	public boolean checarCheio() {
		return total == tamanhoMaximo;
	}
	public boolean checarVazio() {
		return total == 0;
	}
	
	public void enqueue(int item) {
		if(checarCheio()) {
			System.out.println("A fila já está cheia, não consigo colocar mais nada aqui");
		}else {
			fim++;
			fila[fim] = item;
			total++;
		}
	}
	public void dequeue(){
		if(checarVazio()) {
			System.out.println("A fila está vazia, não há nada para remover");
		}else {
			System.out.println("Item removido da fila: " + fila[inicio]);
			inicio++;
			total--;
		}
	}
}
