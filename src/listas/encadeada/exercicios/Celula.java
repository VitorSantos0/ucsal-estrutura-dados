package listas.encadeada.exercicios;

public class Celula<T> {
	private T valor;
	private Celula<T> proximo;
	
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
	
}
