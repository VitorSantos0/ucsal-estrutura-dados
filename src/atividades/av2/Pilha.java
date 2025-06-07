package atividades.av2;

import java.util.Stack;

public class Pilha {
	Stack<String> pilha = new Stack<String>();
	
	public void inserir(String valor) {
		pilha.push(valor);
	}
	
	public void remover() {
		pilha.pop();
	}
}
