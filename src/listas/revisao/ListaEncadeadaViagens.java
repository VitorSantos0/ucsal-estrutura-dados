package listas.revisao;

public class ListaEncadeadaViagens {
	private CelulaViagem primeiro;
	private CelulaViagem ultimo;
	private CelulaViagem atual;
	
	public void adicionar(Viagem viagem) {
		CelulaViagem celula = new CelulaViagem();
		celula.setValor(viagem);
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
		} else if(primeiro.getProximo() == null) {
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
	
	public void remover2() {
		if(primeiro.getProximo() != null) {
			CelulaViagem celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
	}
	
	public boolean temProximo() {
		if(primeiro == null) {
			return false;
		} else if(atual == null) {
			atual = primeiro;
			return true;
		} else {
			boolean temProximo = atual.getProximo() != null;
			atual = atual.getProximo();
			return temProximo;
		}
	}
	
	public CelulaViagem recuperarPenultimo(CelulaViagem celula) {
		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}
	
	public void listar() {
		if(primeiro != null) {
			while(temProximo()) {
				System.out.println(atual.getValor().getNome());
			}
			System.out.println();
		}
	}
	
	public void listar2() {
		if(primeiro != null) {
			atual = primeiro;
			while(atual != null) {
				System.out.println(atual.getValor().getNome());
				atual = atual.getProximo();
			}
		}
		System.out.println();
	}
	
}
