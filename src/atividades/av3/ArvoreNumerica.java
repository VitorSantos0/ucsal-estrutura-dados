package atividades.av3;

public class ArvoreNumerica {
	No raiz;
	No atual;
	PilhaPares pilha;
	FilaImpares fila;
	
	public ArvoreNumerica() {
		raiz = null;
		pilha = new PilhaPares();
		fila = new FilaImpares();
	}
	
	public boolean inserirRaiz(int valor) {
		if(this.raiz != null) return false;
		No novoNo = new No();
		novoNo.valor = valor;
		novoNo.esquerda = novoNo.direita = null;
		raiz = novoNo;
		return true;
	}
	
	public void inserir(int valor) {
		No novoNo = new No();
		novoNo.valor = valor;
		if(raiz == null) {
			inserirRaiz(valor);
			return;
		}
		if(atual == null) atual = raiz;
		if(novoNo.valor < atual.valor) {
			if(atual.esquerda == null) {
				atual.esquerda = novoNo;
				return;
			}
			atual = atual.esquerda;
		} else {
			if(atual.direita == null) {
				atual.direita = novoNo;
				return;
			}
			atual = atual.direita;
		}
		inserir(valor);
		atual = raiz;
	}
	
	private void exibePreOrdem(No no) {
		if(no == null) return;
		System.out.print(no.valor+" ");
		if(no.valor % 2 == 0) pilha.inserir(no.valor);
		else fila.inserir(no.valor);
		if(no.esquerda != null) exibePreOrdem(no.esquerda);
		if(no.direita != null) exibePreOrdem(no.direita);
	}
	
	public void exibePreOrdem() {
		if(raiz == null) System.out.println("Arvore não possui elementos");
		else exibePreOrdem(raiz);
	}
	
	private No buscar(No no, int valor) {
		if(no == null) return null;
		if(no.valor == valor) return no;
		No noAux = buscar(no.esquerda, valor);
		if(noAux == null) noAux = buscar(no.direita, valor);
		return noAux;
	}
	
	public No buscar(int valor) {
		if(raiz == null) return null;
		return buscar(raiz, valor);
	}
	
	
}
