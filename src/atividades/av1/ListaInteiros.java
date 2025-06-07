package atividades.av1;

public class ListaInteiros {
	
	private Celula primeiro;
	private Celula ultimo;
	private Celula atual;
	
	public void adicionar(int numero) {
		Celula celula = new Celula();
		celula.setValor(numero);
		if(primeiro == null && ultimo == null) {
			primeiro = ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
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
            System.out.println("Lista vazia");
            return;
        }
        System.out.print("Lista: | ");
        while(temProximo()) {
            System.out.print(atual.getValor()+" | ");
        }
        System.out.println();
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
	
	public int quantidade() {
		int qtd = 0;
		if (primeiro == null) return qtd;
		while(temProximo()) {
			qtd++;
		}
		return qtd;
	}

}
