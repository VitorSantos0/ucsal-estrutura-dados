package atividades.av3;

import java.util.Iterator;
import java.util.LinkedList;

public class FilaImpares {
	LinkedList<Integer> fila = new LinkedList<Integer>();
	
	public void inserir(int valor) {
		fila.add(valor);
	}
	
	public int remover() {
		if(fila.isEmpty()) return 0;
		return fila.remove();
	}
	
	public void imprimir() {
		if(fila.isEmpty()) System.out.println("A fila esta vazia");
		Iterator<Integer> iterator = fila.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" - ");
		}
	}
}
