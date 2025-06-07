package atividades.av2;

import java.util.Scanner;

import pilha.exercicios.Pilha;

public class PilhaServicos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		
		Pilha<String> pilhaServico = new Pilha<String>();
		
		do {
			System.out.println("=============== PILHA DE SERVIÇOS ===============");
			System.out.println("(1) Inserir o serviço na pilha");
            System.out.println("(2) Obter o próximo serviço da pilha");
            System.out.println("(3) Sair");
       
            System.out.print("Escolha uma opção: ");
            try {            	
            	opcao = Integer.parseInt(ler.nextLine());
            } catch (Exception e) {
            	opcao = 0;
			}
            
            if(opcao < 1 || opcao > 3) {
            	System.err.println("Opção inválida");
            } else {
            	switch (opcao) {
            		case 1:
            			System.out.print("Descreva o serviço: ");
            			pilhaServico.inserir(ler.nextLine());
            			System.out.println("Serviço registrado com sucesso");
            			break;
            		case 2:
            			System.out.println(pilhaServico.remover());
            			break;
            		case 3:
            			System.out.println("Programa encerrado");
	            		break;
            	}
            }
            
		} while(opcao != 3);
		
		
		ler.close();

	}

}
