package listas.encadeada;

import listas.duplamentEncadeada.Celula;

public class ListaEncadeadaGenerica<T> {
	
	private Celula<T> primeiro;
	private Celula<T> ultimo;
	private Celula<T> atual;
	
	public void adicionar(T valor) {
		Celula<T> cell = new Celula<T>();
		cell.setValor(valor);
		if(this.primeiro == null && this.primeiro == null) {
			this.primeiro = this.ultimo = cell;
		} else {
			ultimo.setProximo(cell);
			ultimo = cell;
		}
	}
	
	public void remover() {
		if(primeiro == null) {
			return;
		}else if(primeiro.getProximo() == null) {
			primeiro = ultimo = null;
			return;
		} else {			
			while(temProximo()) {
				if(atual.getProximo().getProximo() == null) {
					atual.setProximo(null);
					ultimo = atual;
				}
			}
		}
	}
	
	public boolean temProximo() {
		if(primeiro == null) {
			return false;
		} else if (atual == null) {
			atual = primeiro;
			return true;
		} else {
			boolean proximo = atual.getProximo() != null;
			atual = atual.getProximo();
			return proximo;
		}
	}
	
	public void listar() {
        if (primeiro == null) {
            throw new RuntimeException("Lista vazia");
        }
        while(temProximo()) {
            System.out.println(atual.getValor());
        }
        System.out.println();
    }

	public Celula<T> getAtual() {
		return atual;
	}
	
}
