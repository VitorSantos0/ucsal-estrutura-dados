package listas.revisao;

public class ListaDuplamenteEncadeadaProfessor {
	private CelulaProfessor primeiro;
	private CelulaProfessor ultimo;
	private CelulaProfessor atual;
	
	public void inserirInicio(Professor prof) {
		CelulaProfessor celula = new CelulaProfessor();
		celula.setValor(prof);
		if(primeiro == null) {
			primeiro = ultimo = celula;
			celula.setAnterior(null);
		} else {
			primeiro.setAnterior(celula);
			celula.setProximo(primeiro);
			primeiro = celula;
		}
	}
	
	public void inserirFinal(Professor prof) {
		CelulaProfessor celula = new CelulaProfessor();
		celula.setValor(prof);
		if(primeiro == null) {
			primeiro = ultimo = celula;
			celula.setAnterior(null);
		} else {
			ultimo.setProximo(celula);
			celula.setAnterior(ultimo);
			ultimo = celula;
		}
	}
	
	public void removerInicio() {
		if(primeiro != null) {
			CelulaProfessor segundo = primeiro.getProximo();
			segundo.setAnterior(null);
			ultimo.setProximo(null);
			primeiro = segundo;
		}
	}
	
	public void removerFinal() {
		CelulaProfessor penultimo = ultimo.getAnterior();
		if(ultimo != null) {
			penultimo.setProximo(null);
			ultimo.setAnterior(null);
			ultimo = penultimo;
		}
	}
	
	public void imprimir() {
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
