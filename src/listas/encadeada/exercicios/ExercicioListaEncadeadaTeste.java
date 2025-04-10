package listas.encadeada.exercicios;

public class ExercicioListaEncadeadaTeste {

	public static void main(String[] args) {
		Aluno alu1 = new Aluno("Enzo");
		Aluno alu2 = new Aluno("João");
		Aluno alu3 = new Aluno("Iza");
		Aluno alu4 = new Aluno("Ana");
		ListaEncadeada<Aluno> lista = new ListaEncadeada<Aluno>();
		try {	
			lista.adicionar(alu1);
			lista.adicionar(alu2);
			lista.adicionar(alu4);
			lista.adicionar(alu3);			
			lista.imprimir();
			lista.remover();			
			lista.imprimir();
			System.out.println(lista.pesquisar(alu3));				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void primeiraQuestao() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
		try {			
			lista.adicionar(13);
			lista.adicionar(27);
			lista.adicionar(32);
			lista.adicionar(48);			
			lista.imprimir();
			System.out.println("Tamanho da lista: "+lista.tamanho());
			lista.remover();
			lista.imprimir();
			System.out.println("Tamanho da lista: "+lista.tamanho());
			lista.limpar();
			lista.imprimir();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
