package listas.duplamentEncadeada;

public class Celula<T> {
	private T valor;
	private Celula<T> proximo;
	private Celula<T> anterior;
	
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public Celula<T> getProximo() {
		return proximo;
	}
	
	public void setProximo(Celula<T> proximo) {
		this.proximo = proximo;
	}
	
	public Celula<T> getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Celula<T> anterior) {
		this.anterior = anterior;
	}
	
}
