package listas.duplamentEncadeada;

public class DoublyLinkedList<T> {
	private Cell<T> first;
	private Cell<T> end;
	private Cell<T> current;

	public Cell<T> getCurrent() {
		return current;
	}

	public void setCurrent(Cell<T> current) {
		this.current = current;
	}
	
	public boolean isEmpty() {
		return this.first == null && this.end == null;
	}
	
	public void insertLeft(T value) {
		Cell<T> cell = new Cell<T>();
		cell.setValue(value);
		if(this.isEmpty()) {
			this.first = this.end = cell;
			cell.setPrevious(null);
		} else {
			cell.setNext(first);
			cell.setPrevious(null);
			this.first = cell;
		}
		this.setCurrent(cell);
	}
	
	public Cell<T> removeLeft() throws EmpryListException {
		Cell<T> aux = end;
		Cell<T> pre = end;
		Cell<T> cell = new Cell<T>();
		if(this.isEmpty()) {
			throw new EmpryListException("the list is empty");
		} else {
			cell = aux;
			this.setCurrent(aux.getNext());
			if(this.current == null) {
				this.first = this.end = null;
			} else {
				pre = aux.getNext();
				first = pre;
				pre.setPrevious(null);
			}
		}
		return cell;
	}
	
	public void insertRight(T value) {
		Cell<T> cell = new Cell<T>();
		cell.setValue(value);
		if(this.isEmpty()) {
			this.first = this.end = cell;
			cell.setNext(null);
		} else {
			cell.setPrevious(null);
			cell.setNext(first);
			this.first = cell;
		}
		this.setCurrent(cell);
	}
	
	public Cell<T> removeRight() throws EmpryListException {
		Cell<T> aux = end;
		Cell<T> pre = end;
		Cell<T> cell = new Cell<T>();
		if(this.isEmpty()) {
			throw new EmpryListException("the list is empty");
		} else {
			cell = aux;
			this.setCurrent(aux.getPrevious());
			if(this.current == null) {
				this.first = this.end = null;
			} else {
				pre = aux.getPrevious();
				end = pre;
				pre.setNext(null);
			}
		}
		return cell;
	}
	
	public boolean isNext() {
		if(this.first == null) {
			return false;
		} else if (this.current == null) {
			current = first;
			return true;
		} else {
			boolean next = current.getNext() != null;
			current = current.getNext();
			return next;
		}
	}
	
	public void print() throws EmpryListException {
		if(this.isEmpty()) {
			throw new EmpryListException("the list is empty");
		}
		while(this.isNext()) {
			System.out.println(current.getValue());
		}
	}
	
 }



