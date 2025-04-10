package listas.duplamentEncadeada;

public class ListaDuplamentEncadeadaTest {

	public static void main(String[] args) {
		
		ListaDuplamentEncadeada<Integer> list = new ListaDuplamentEncadeada<Integer>();
		list.inserirEsquerda(10);
		try {
			list.imprimir();
		} catch (ListaVaziaException e) {
			System.out.println(e.getMessage());
		}
	}

}
