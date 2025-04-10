package listas.encadeada.exercicios;

import javax.management.RuntimeErrorException;

public class ListaEncadeada<T> {
	private Celula<T> primeiro;
	private Celula<T> ultimo;
	private Celula<T> atual;

	public void adicionar(T valor) {
		Celula<T> cel = new Celula<T>();
		cel.setValor(valor);
		if(primeiro == null && ultimo == null) {
			primeiro = ultimo = cel;
		} else {
			ultimo.setProximo(cel);
			ultimo = cel;
		}
	}
	
	public void remover() {
		if(vazia()) {
			return;
		} else if (primeiro.getProximo() == null) {
			limpar();
		} else {
			while(temProximo()) {
				if(atual.getProximo().getProximo() == null) {
					atual.setProximo(null);
					ultimo = atual;
				}
			}
		}
	}
	
	public int tamanho() {
		int contador = 0;
		while(!vazia() && temProximo()) {
			contador++;
		}
		return contador;
	}
	
	public boolean vazia() {
		return primeiro == null;
	}
	
	public void limpar() {
		primeiro = ultimo = null;
	}
	
	public void imprimir() {
		if (vazia()) {
            throw new RuntimeErrorException(null, "Lista Vazia");
        }
        while(temProximo()) {
            System.out.print(atual.getValor()+" | ");
        }
        System.out.println();
	}
	
	public boolean temProximo() {
		if(vazia()) {
			return false;
		} else if(atual == null) {
			atual = primeiro;
			return true;
		} else {
			boolean proximo = atual.getProximo() != null;
			atual = atual.getProximo();
			return proximo;
		}		
	}
	
	public T pesquisar(T valor) {
		while(temProximo()) {
			if(valor == atual.getValor()) {
				return atual.getValor();
			}
		}
		throw new RuntimeErrorException(null, "Não encontrado");
	}
	
}
