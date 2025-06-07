package atividades.av2;

import java.util.LinkedList;

public class Fila {
	LinkedList<Contato> fila = new LinkedList<Contato>();
	
	public void inserir(Contato contato) {
		fila.add(contato);
	}
	
	public Contato remover() {
		if(fila.isEmpty()) return null;
		return fila.remove();
	}
	
}
