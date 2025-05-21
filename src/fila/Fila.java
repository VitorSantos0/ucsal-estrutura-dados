package fila;

import java.util.Iterator;
import java.util.LinkedList;

public class Fila<T> {
	
	LinkedList<T> fila = new LinkedList<T>();
	
	public void inserir(T valor) {
		fila.add(valor);
	}
	
	public void inserirIndice(int indice, T valor) {
		fila.add(indice, valor);
	}
	
	public T consultar(T valor) {
		if(fila.isEmpty()) {
	        return null;
	    } 
	    Iterator<T> iterator = fila.iterator();
	    while (iterator.hasNext()) {
	        T elemento = iterator.next();
	        if (elemento.equals(valor)) {
	            return elemento;
	        }
	    }
	    return null;
	}
	
	public T remover() {
		if(fila.isEmpty()) return null;
		return fila.remove();
	}
	
	public int tamanho() {
		return fila.size();
	}
	
	public T pegar(int posicao) {
		return fila.get(posicao);
	}
	
	public boolean vazia() {
		return fila.isEmpty();
	}
	
	public void listar() {
		Iterator<T> iterator = fila.iterator();
	    while (iterator.hasNext()) {
	        T elemento = iterator.next();
	        System.out.println("\t"+elemento.toString());
	    }
	}
	
	public T primeiro() {
		if(fila.isEmpty()) return null;
		return fila.peek();
	}
	
}
