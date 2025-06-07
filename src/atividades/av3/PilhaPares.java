package atividades.av3;

import java.util.Iterator;
import java.util.Stack;

public class PilhaPares {
	Stack<Integer> pilha = new Stack<Integer>();
	
	public void inserir(int valor) {
		pilha.push(valor);
	}
	
	public void remover() {
		pilha.pop();
	}
	
	public void imprimir() {
		if(pilha.empty()) System.out.println("A pilha esta vazia");
		Iterator<Integer> iterator = pilha.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
