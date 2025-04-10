package listas.revisao;

public class ListaEncadeadaTeste {

	public static void main(String[] args) {
		
		Viagem viagem1 = new Viagem("Capão");
		Viagem viagem2 = new Viagem("Itaitu");
		Viagem viagem3 = new Viagem("Santo Antonio");
		
		ListaEncadeadaViagens lista = new ListaEncadeadaViagens();
		
		lista.adicionar(viagem1);
		lista.adicionar(viagem2);
		lista.adicionar(viagem3);
		
		lista.listar();
		
		lista.remover();
		
		lista.listar();

	}

}
