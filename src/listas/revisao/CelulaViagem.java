package listas.revisao;

public class CelulaViagem {
	private Viagem valor;
	private CelulaViagem proximo;
	
	public Viagem getValor() {
		return valor;
	}

	public void setValor(Viagem valor) {
		this.valor = valor;
	}

	public CelulaViagem getProximo() {
		return proximo;
	}
	
	public void setProximo(CelulaViagem proximo) {
		this.proximo = proximo;
	}
	
}
