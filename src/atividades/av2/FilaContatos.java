package atividades.av2;

import java.util.Scanner;

public class FilaContatos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		
		Fila filaContatos = new Fila();
		
		do {
			
			System.out.println("=============== CANDIDATOS PARA ENTREVISTA ===============");
			System.out.println("(1) Inserir Entrevistado");
            System.out.println("(2) Próximo Entrevistado");
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
            			Contato novoContato = new Contato();
            			System.out.print("Informe o nome do candidato: ");
            			novoContato.setNome(ler.nextLine());
            			System.out.print("Informe o telefone do candidato: ");
            			novoContato.setTelefone(ler.nextLine());
            			filaContatos.inserir(novoContato);
            			System.out.println("Candidato registrado com sucesso");
            			break;
            		case 2:
            			Contato entrevistado = filaContatos.remover();
            			System.out.println("Candidato "+entrevistado.getNome().toUpperCase()+" foi entrevistado");
            			break;
            		case 3:
            			System.out.println("Entrevista finalizada");
	            		break;
            	}
            }
            
		} while(opcao != 3);
		
		ler.close();

	}

}
