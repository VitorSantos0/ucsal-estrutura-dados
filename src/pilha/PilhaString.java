package pilha;

import java.util.Iterator;
import java.util.Stack;

public class PilhaString {
	
	Stack<String> pilha = new Stack<String>();
	
	public void inserir(String valor) {
		pilha.push(valor);
	}
	
	public void remover() {
		pilha.pop();
	}

	public boolean vazia() {
		return pilha.empty();
	}
	
	public int tamanho() {
		return pilha.size();
	}
	
	public String topo() {
		return pilha.peek();
	}
	
	public void imprimir() {
		if(vazia()) throw new RuntimeException("A pilha esta vazia");
		for(int i = tamanho()-1; i>=0; i--) {
			System.out.println(i+"-"+pilha.get(i));
		}
		System.out.println();
	}
	
	public void listar() {
		Iterator<String> it = pilha.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}
	
}
