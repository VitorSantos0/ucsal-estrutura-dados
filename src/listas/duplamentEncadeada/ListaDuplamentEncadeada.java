package listas.duplamentEncadeada;

public class ListaDuplamentEncadeada<T> {
	private Celula<T> primeiro;
	private Celula<T> ultimo;
	private Celula<T> atual;

	public Celula<T> getAtual() {
		return atual;
	}
	
	public boolean isEmpty() {
		return this.primeiro == null && this.ultimo == null;
	}
	
	public void inserirEsquerda(T value) {
		Celula<T> cell = new Celula<T>();
		cell.setValor(value);
		if(this.isEmpty()) {
			this.primeiro = this.ultimo = cell;
			cell.setAnterior(null);
		} else {
			primeiro.setAnterior(cell);
			cell.setProximo(primeiro);
			this.primeiro = cell;
		}
	}
	
	public void removerEsquerda() throws ListaVaziaException {
		if(this.isEmpty()) {
			throw new ListaVaziaException("the list is empty");
		} else {
			Celula<T> aux = primeiro.getProximo();
			aux.setAnterior(null);
			ultimo.setProximo(null);
			this.primeiro = aux;
		}
	}
	
	public void inserirDireita(T value) {
		Celula<T> cell = new Celula<T>();
		cell.setValor(value);
		if(this.isEmpty()) {
			this.primeiro = this.ultimo = cell;
			cell.setProximo(null);
		} else {
			ultimo.setProximo(cell);
			cell.setAnterior(ultimo);
			this.ultimo = cell;
		}
	}
	
	public void removerDireita() throws ListaVaziaException {
		if(this.isEmpty()) {
			throw new ListaVaziaException("the list is empty");
		} else {
			Celula<T> aux = ultimo.getAnterior();
			aux.setProximo(null);
			ultimo.setAnterior(null);
			ultimo = aux;
		}
	}
	
	public boolean temProximo() {
		if(this.primeiro == null) {
			return false;
		} else if (this.atual == null) {
			atual = primeiro;
			return true;
		} else {
			boolean next = atual.getProximo() != null;
			atual = atual.getProximo();
			return next;
		}
	}
	
	public void imprimir() throws ListaVaziaException {
		if(this.isEmpty()) {
			throw new ListaVaziaException("the list is empty");
		}
		atual = primeiro;
		while(atual != null) {
			System.out.println(atual.getValor());
			atual = atual.getProximo();
		}
		System.out.println();
	}
	
 }



