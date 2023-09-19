package estruturaDeDados;

public class testePilha {
	public static void main(String[] args) {
		Pilha pilha = new Pilha(3);
		
		pilha.push(10);
		System.out.println("Elemento adicionado ao topo da pilha " + pilha.peek());
		 
		pilha.push(20);
		System.out.println("Elemento adicionado ao topo da pilha " + pilha.peek());
		
		pilha.push(30);
		System.out.println("Elemento adicionado ao topo da pilha " + pilha.peek());
		
		pilha.push(40);
		
		pilha.pop();
	}

}
