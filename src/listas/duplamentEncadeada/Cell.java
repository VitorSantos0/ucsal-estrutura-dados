package listas.duplamentEncadeada;

public class Cell<T> {
	private T value;
	private Cell<T> next;
	private Cell<T> previous;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public Cell<T> getNext() {
		return next;
	}
	
	public void setNext(Cell<T> next) {
		this.next = next;
	}
	
	public Cell<T> getPrevious() {
		return previous;
	}
	
	public void setPrevious(Cell<T> previous) {
		this.previous = previous;
	}
	
}
