package listas.revisao;

public class CelulaProfessor {
	private Professor valor;
	private CelulaProfessor proximo;
	private CelulaProfessor anterior;
	
	public Professor getValor() {
		return valor;
	}
	
	public void setValor(Professor valor) {
		this.valor = valor;
	}
	
	public CelulaProfessor getProximo() {
		return proximo;
	}
	
	public void setProximo(CelulaProfessor proximo) {
		this.proximo = proximo;
	}

	public CelulaProfessor getAnterior() {
		return anterior;
	}

	public void setAnterior(CelulaProfessor anterior) {
		this.anterior = anterior;
	}
	
}
