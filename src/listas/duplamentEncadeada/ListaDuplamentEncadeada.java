package listas.duplamentEncadeada;

public class ListaDuplamentEncadeada<T> {
	private Celula<T> primeiro;
	private Celula<T> ultimo;
	private Celula<T> atual;

	public Celula<T> getAtual() {
		return atual;
	}

	public void setAtual(Celula<T> current) {
		this.atual = current;
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
			cell.setProximo(primeiro);
			cell.setAnterior(null);
			this.primeiro = cell;
		}
		this.setAtual(cell);
	}
	
	public Celula<T> removerEsquerda() throws ListaVaziaException {
		Celula<T> aux = ultimo;
		Celula<T> pre = ultimo;
		Celula<T> cell = new Celula<T>();
		if(this.isEmpty()) {
			throw new ListaVaziaException("the list is empty");
		} else {
			cell = aux;
			this.setAtual(aux.getProximo());
			if(this.atual == null) {
				this.primeiro = this.ultimo = null;
			} else {
				pre = aux.getProximo();
				primeiro = pre;
				pre.setAnterior(null);
			}
		}
		return cell;
	}
	
	public void inserirDireita(T value) {
		Celula<T> cell = new Celula<T>();
		cell.setValor(value);
		if(this.isEmpty()) {
			this.primeiro = this.ultimo = cell;
			cell.setProximo(null);
		} else {
			cell.setAnterior(null);
			cell.setProximo(primeiro);
			this.primeiro = cell;
		}
		this.setAtual(cell);
	}
	
	public Celula<T> removerDireita() throws ListaVaziaException {
		Celula<T> aux = ultimo;
		Celula<T> pre = ultimo;
		Celula<T> cell = new Celula<T>();
		if(this.isEmpty()) {
			throw new ListaVaziaException("the list is empty");
		} else {
			cell = aux;
			this.setAtual(aux.getAnterior());
			if(this.atual == null) {
				this.primeiro = this.ultimo = null;
			} else {
				pre = aux.getAnterior();
				ultimo = pre;
				pre.setProximo(null);
			}
		}
		return cell;
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
		while(this.temProximo()) {
			System.out.println(atual.getValor());
		}
	}
	
 }



