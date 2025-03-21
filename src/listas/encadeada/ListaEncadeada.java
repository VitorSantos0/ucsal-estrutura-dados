package listas.encadeada;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula atual;
	
	public void adicionar(Professor valor) {
		Celula celula = new Celula();
		celula.setValor(valor);
		if(primeiro == null && ultimo == null) {
			primeiro = ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
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
            System.out.println("Lista vazia.");
            return;
        }
        while(temProximo()) {
            System.out.println(atual.getValor().getNome());
        }
    }
}
