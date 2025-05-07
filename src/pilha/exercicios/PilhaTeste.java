package pilha.exercicios;

import java.util.Scanner;

public class PilhaTeste {

	public static void main(String[] args) {
		
		palindromo();
		
	}
	
	// Questão 4
	public static <T> Pilha<T> inicializarPilha() {
	    return new Pilha<T>();
	}
	
	// Aborda Questão 1 e Questão 4
	public static void pilhaLivros() {
		
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		
		Pilha<String> pilha = inicializarPilha();
		
		do {
			
			System.out.println("=============== QUESTÃO 1 - LIVROS NA PILHA ===============");
			System.out.println("(1) Inserir livro");
            System.out.println("(2) Consultar livro");
            System.out.println("(3) Remover livro");
            System.out.println("(4) Esvaziar pilha");
            System.out.println("(5) Sair");
            System.out.print("Escolha uma opção: ");
            
            try {            	
            	opcao = Integer.parseInt(ler.nextLine());
            } catch (Exception e) {
            	opcao = 0;
			}
            
            if(opcao < 1 || opcao > 5) {
            	System.err.println("\tOpção inválida");
            } else {
            	System.out.println("------------------------------------------");
            	String livro = null;
            	switch (opcao) {
            	case 1: 
            		System.out.print("\tDigite o nome do livro: ");
            		livro = ler.nextLine();
            		pilha.inserir(livro);
            		System.out.println("\tLivro inserido com sucesso");
            		break;
            	case 2:
            		System.out.print("\tDigite o nome do livro que deseja consultar: ");
            		livro = ler.nextLine();
            		String livroConsulta = pilha.consultar(livro);
            		if(livroConsulta != null)
            			System.out.println("\tAqui esta o seu livro => "+livroConsulta);
            		else 
            			System.out.println("\tLivro não encontrado na pilha");
            		break;
            	case 3:
            		String livroRemovido = pilha.remover();
            		if(livroRemovido != null)
            			System.out.println("\tLivro => "+livroRemovido+" removido da pilha");
            		else 
            			System.out.println("\tLivro não encontrado na pilha");
            		break;
            	case 4:
            		pilha.esvaziar();
            		System.out.println("\tA pilha esta vazia");
            		break;
            	case 5:
            		System.out.println("\tEncerrando...");
            		break;
            	}
            	System.out.println("------------------------------------------");
            	
            }
            
		} while(opcao != 5);

		ler.close();
		
	}
	
	// Aborda Questão 2 e Questão 4
	public static void palindromo() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite uma frase e verifique se é um palíndromo: ");
        String frase = ler.nextLine();
        
        frase = frase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        Pilha<Character> pilha = inicializarPilha();
        
        for (int i = 0; i < frase.length(); i++) {
            pilha.inserir(frase.charAt(i));
        }
        
        boolean palindromo = true;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != pilha.remover()) {
            	palindromo = false;
                break;
            }
        }
        
        if(palindromo)
        	System.out.println("É um palíndromo!");
        else 
        	System.out.println("Não é um palíndromo.");
        
        ler.close();
        
	}
	
	// Aborda Questão 3 e Questão 5
	public static void pilhaTarefas() {
		
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		
		Pilha<String> pilha = inicializarPilha();
		
		do {
			
			System.out.println("=============== QUESTÃO 3 - TAREFAS NA PILHA ===============");
			System.out.println("(1) Inserir tarefa");
            System.out.println("(2) Obter próxima tarefa");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            
            try {            	
            	opcao = Integer.parseInt(ler.nextLine());
            } catch (Exception e) {
            	opcao = 0;
			}
            
            if(opcao < 1 || opcao > 3) {
            	System.err.println("\tOpção inválida");
            } else {
            	System.out.println("------------------------------------------");
            	switch (opcao) {
            	case 1: 
            		System.out.print("\tDigite a descrição da tarefa: ");
            		String tarefa = ler.nextLine();
            		pilha.inserir(tarefa);
            		System.out.println("\tTarefa inserida com sucesso");
            		break;
            	case 2:
            		pilha.remover();
            		if(pilha.topo() != null)
            			System.out.println("\tProxima Tarefa => "+pilha.topo());
            		else 
            			System.out.println("\tTarefas concluídas");
            		break;
            	case 3:
            		System.out.println("\tEncerrando...");
            		break;
            	}
            	System.out.println("------------------------------------------");
            	
            }
            
		} while(opcao != 3);

		ler.close();
		
	}
		

}
