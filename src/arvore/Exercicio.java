package arvore;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 0, num = 0;
		
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		do {
			
			System.out.println("(1) Inserir número na arvore");
            System.out.println("(2) sair");
            System.out.print("Escolha uma opção: ");
            
            try {            	
            	opcao = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
            	opcao = 0;
			}
            
            if(opcao < 1 || opcao > 2) {
            	
            	System.err.println("Opção inválida");
            	
            } else {
            	
            	if(opcao == 1) {
            		
            		do {
                		System.out.print("Informe um número para inserir na arvore: ");
                		try {            	
                			num = Integer.parseInt(sc.nextLine());
                		} catch (Exception e) {
                			System.err.println("Informe um número válido");
                			opcao = 0;
                		}
                		if(arvore.busca(num) != null) System.err.println("Número já inserido na arvore");
                	} while(opcao == 0);
                	
            		arvore.inserir(num);
            		
            	}
            	
            }
			
		} while(opcao != 2);
		
		arvore.exibePreOrdem();
		System.out.println();
		arvore.exibeCentral();
		System.out.println();
		arvore.exibePosOrdem();
		
		sc.close();
	}
}
