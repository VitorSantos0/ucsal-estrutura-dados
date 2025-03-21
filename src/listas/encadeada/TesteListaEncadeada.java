package listas.encadeada;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		
		TesteListaEncadeada testeListaEncadeada = new TesteListaEncadeada();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		testeListaEncadeada.adicionarProfessor(listaEncadeada);
		
		listaEncadeada.listar();
		
		System.out.println("\nRemovendo ultimo...\n");
		
		listaEncadeada.remover();
		
		listaEncadeada.listar();
		
		System.out.println("\nRemovendo ultimo...\n");
		
		listaEncadeada.remover();
		
		listaEncadeada.listar();
		
		System.out.println("\nRemovendo ultimo...\n");
		
		listaEncadeada.remover();
		
		listaEncadeada.listar();

	}
	
	public void adicionarProfessor(ListaEncadeada lista) {
		Professor prof1 = new Professor(1, "Angela", "Estrutura de Dados");
		Professor prof2 = new Professor(2, "Glaucya", "Engenharia de Requisitos");
		Professor prof3 = new Professor(3, "Ronilson", "Programação Front End");
		lista.adicionar(prof1);
		lista.adicionar(prof2);
		lista.adicionar(prof3);
	}

}
