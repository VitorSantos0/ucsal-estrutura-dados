package pilha.exercicios;

import java.util.Iterator;
import java.util.Stack;

public class Pilha <T>{
	
	Stack<T> pilha = new Stack<T>();
	
	public void inserir(T valor) {
		pilha.push(valor);
	}
	
	public T consultar(T valor) {
		if(pilha.empty()) {
	        return null;
	    } 
	    Iterator<T> iterator = pilha.iterator();
	    while (iterator.hasNext()) {
	        T elemento = iterator.next();
	        if (elemento.equals(valor)) {
	            return elemento;
	        }
	    }
	    return null;
	}
	
	public T remover() {
		if(!pilha.empty()) return pilha.pop();
		return null;
	}
	
	public void esvaziar() {
		pilha.clear();
	}
	
	public T topo() {
		if(!pilha.empty()) return pilha.peek();
		return null;
	}
	
}
