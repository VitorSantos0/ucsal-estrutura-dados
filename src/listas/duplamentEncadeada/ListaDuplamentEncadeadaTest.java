package listas.duplamentEncadeada;

import java.util.Random;

import listas.encadeada.ListaEncadeadaGenerica;

public class ListaDuplamentEncadeadaTest {

	public static void main(String[] args) {
		
		
		
	}
	
	// questão 1
	public static void inclusaoNumerosInteiros() {
		ListaDuplamentEncadeada<Integer> list = new ListaDuplamentEncadeada<Integer>();
		try {
			list.inserirEsquerda(10);
			list.inserirEsquerda(15);
			list.inserirDireita(13);
			list.inserirDireita(21);
			list.imprimir();
			
			list.removerEsquerda();
			list.imprimir();
			
			list.removerDireita();
			list.imprimir();
			
		} catch (ListaVaziaException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	// questão 2
	public static void criandoTerceiraListaApartirDeOutrasListas() {
		ListaEncadeadaGenerica<String> listaPessoa1 = new ListaEncadeadaGenerica<String>();
		listaPessoa1.adicionar("Fabio");
		listaPessoa1.adicionar("Grazy");
		listaPessoa1.adicionar("Pedro");
		listaPessoa1.listar();
		
		ListaEncadeadaGenerica<String> listaPessoa2 = new ListaEncadeadaGenerica<String>();
		listaPessoa2.adicionar("João");
		listaPessoa2.adicionar("Paula");
		listaPessoa2.adicionar("Fabio");
		listaPessoa2.listar();
		
		ListaEncadeadaGenerica<String> listaPessoa3 = new ListaEncadeadaGenerica<String>();
		
		while(listaPessoa1.temProximo()) {
			while(listaPessoa2.temProximo()) {				
				if(listaPessoa2.getAtual().getValor() == listaPessoa1.getAtual().getValor()) { 
					listaPessoa3.adicionar(listaPessoa2.getAtual().getValor());
				}
			}
		}
		
		listaPessoa3.listar();
	}
	
	// questão 3
	public static void imprimirListaAlunos(ListaDuplamentEncadeada<Aluno> listaAluno) {
		while(listaAluno.temProximo()) {
			System.out.println("Aluno: "+listaAluno.getAtual().getValor().getNome()+" / Idade: "+listaAluno.getAtual().getValor().getIdade());
		}
	}
	
	public static void incluirInicioFimAluno(ListaDuplamentEncadeada<Aluno> listaAluno) {
		listaAluno.inserirEsquerda(new Aluno("Alice", 9));
		listaAluno.inserirDireita(new Aluno("Beto", 10));
		System.out.println();
	}
	
	public static void listaAlunos() {
		Aluno aluno1 = new Aluno("Marco", 14);
		Aluno aluno2 = new Aluno("Pablo", 12);
		Aluno aluno3 = new Aluno("Daniel", 15);
		Aluno aluno4 = new Aluno("Ana", 11);
		Aluno aluno5 = new Aluno("Livia", 13);
		
		ListaDuplamentEncadeada<Aluno> listaAluno = new ListaDuplamentEncadeada<Aluno>();
		listaAluno.inserirEsquerda(aluno1);
		listaAluno.inserirEsquerda(aluno2);
		listaAluno.inserirEsquerda(aluno3);
		listaAluno.inserirEsquerda(aluno4);
		listaAluno.inserirEsquerda(aluno5);
		
		imprimirListaAlunos(listaAluno);
		
		incluirInicioFimAluno(listaAluno);
		
		imprimirListaAlunos(listaAluno);
	}
	
	// questão 4
	public static void listaImpares() {
		ListaDuplamentEncadeada<Integer> lista = new ListaDuplamentEncadeada<Integer>();
		
		int i = 0, num = 0;
		Random random = new Random();		
		
		while(i < 15) {
			num = random.nextInt(100);
			if(num % 2 == 1) {
				lista.inserirDireita(num);
				i++;
			}
		}
		
		try {
			lista.imprimir();
		} catch (ListaVaziaException e) {
			System.out.println(e.getMessage());
		}
	}

}
