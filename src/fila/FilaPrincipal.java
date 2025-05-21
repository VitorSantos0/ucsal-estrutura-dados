package fila;

import java.util.Scanner;

public class FilaPrincipal {

	public static void main(String[] args) {
		
		filaPacientes();
		
	}
	
	// Questão 1
	public static void playlistMusica() {
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		
		Fila<String> fila = new Fila<String>();
		
		do {
			
			System.out.println("=============== QUESTÃO 1 - PLAYLIST DE MÚSICAS ===============");
			System.out.println("(1) Inserir musica");
            System.out.println("(2) Consultar música");
            System.out.println("(3) Remover música");
            System.out.println("(4) Sair");
            System.out.print("Escolha uma opção: ");
            
            try {            	
            	opcao = Integer.parseInt(ler.nextLine());
            } catch (Exception e) {
            	opcao = 0;
			}
            
            if(opcao < 1 || opcao > 4) {
            	System.err.println("\tOpção inválida");
            } else { 
            	System.out.println("------------------------------------------");
            	String musica;
            	switch (opcao) {
	            	case 1: 
	            		System.out.print("\tEscolha uma nova música: ");
	            		musica = ler.nextLine(); 
	            		fila.inserir(musica);
	            		System.out.println("\tMúsica inserida na playlist");
	            		break;
	            	case 2:
	            		System.out.print("\tDigite o nome da música que deseja consultar: ");
	            		musica = ler.nextLine();
	            		String musicaConsulta = fila.consultar(musica);
	            		if(musicaConsulta != null)
	            			System.out.println("\tMúsica => "+musicaConsulta);
	            		else 
	            			System.out.println("\tMúsica não encontrado na playlist");
	            		break;
	            	case 3:
	            		String musicaRemovida = fila.remover();
	            		if(musicaRemovida != null)
	            			System.out.println("\tMúsica <"+musicaRemovida+"> removida da playlist");
	            		else 
	            			System.out.println("\tA playlist esta vazia");
	            		break;
	            	case 4:
	            		System.out.println("\tEncerrando...");
	            		break;
            	}
            	System.out.println("------------------------------------------");
            }
			
		} while(opcao != 4);
		
		ler.close();
	}
	
	// Questão 2
	public static void contatosCallcenter() {
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		
		Fila<Contato> filaContatos = new Fila<Contato>();
		
		do {
			
			System.out.println("=============== QUESTÃO 2 - CONTATOS CALLCENTER ===============");
			System.out.println("(1) Inserir contato");
            System.out.println("(2) Próximo contato");
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
	            		Contato contato = new Contato();
	            		System.out.print("\tInforme o nome do novo contato: ");
	            		contato.setNome(ler.nextLine());
	            		System.out.print("\tInforme o telefone do novo contato: ");
	            		contato.setTelefone(ler.nextLine());
	            		filaContatos.inserir(contato);
	            		System.out.println("\tContato inserido com sucesso");
	            		break;
	            	case 2:
	            		Contato contatoRemovido = filaContatos.remover();
	            		if(contatoRemovido != null)
	            			System.out.println("\tDados do contato => Nome: "+contatoRemovido.getNome()+" | Telefone: "+contatoRemovido.getTelefone());
	            		else 
	            			System.out.println("\tNenhum contato encontrado");
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

	// Questão 3
	public static void filaMercado() {
		Scanner ler = new Scanner(System.in);
		int opcao = 0, contador = 1;
		
		Fila<String> fila = new Fila<String>();
		
		do {
			
			System.out.println("=============== QUESTÃO 3 - FILA SUPERMERCADO ===============");
			System.out.println("(1) Inserir cliente");
            System.out.println("(2) Remover cliente");
            System.out.println("(3) Quantos clientes na fila?");
            System.out.println("(4) Sair");
            System.out.print("Escolha uma opção: ");
			
            try {            	
            	opcao = Integer.parseInt(ler.nextLine());
            } catch (Exception e) {
            	opcao = 0;
			}
            
            if(opcao < 1 || opcao > 4) {
            	System.err.println("\tOpção inválida");
            } else { 
            	System.out.println("------------------------------------------");
            	switch (opcao) {
	            	case 1: 
	            		String cliente = "CLIENTE "+contador;
	            		fila.inserir(cliente);
	            		System.out.println("\t"+cliente+" entrou na fila");
	            		contador++;
	            		break;
	            	case 2:
	            		String clienteRemovido = fila.remover();
	            		if(clienteRemovido != null)
	            			System.out.println("\t"+clienteRemovido+" saiu da fila");
	            		else 
	            			System.out.println("\tA fila do mercado esta vazia");
	            		break;
	            	case 3:
	            		System.out.println("\t"+fila.tamanho()+" clientes na fila");
	            		break;
	            	case 4:
	            		System.out.println("\tEncerrando...");
	            		break;
            	}
            	System.out.println("------------------------------------------");
            }
            
		} while(opcao != 4);
		
		ler.close();
	}

	// Questão 4
	public static void alunosOrdenadoIdade() {
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		
		Fila<Aluno> filaAluno = new Fila<Aluno>();
		
		do {
            System.out.println("=============== QUESTÃO 4 - ALUNOS ORDERNADOS POR IDADE ===============");
            System.out.println("(1) Inserir aluno");
            System.out.println("(2) Consultar alunos");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            
            try {            	
            	opcao = Integer.parseInt(ler.nextLine());
            } catch (Exception e) {
            	opcao = 0;
			}
            
            if(opcao < 1 || opcao > 4) {
            	System.err.println("\tOpção inválida");
            } else {       
            	System.out.println("------------------------------------------");
            	switch (opcao) {
	            	case 1:
	            		Aluno aluno = new Aluno();
	            		System.out.print("\tInforme o nome do aluno: ");
	                    aluno.setNome(ler.nextLine());
	                    System.out.print("\tInforme a idade do aluno: ");
	                    int idade;
	                    try {
	                    	idade = Integer.parseInt(ler.nextLine());
	                    } catch (Exception e) {
	                    	System.err.println("\tValor inserido para idade inválido");
	                    	aluno = null;
	                    	break;
	        			}
	                    aluno.setIdade(idade);	                  

	                    int posicao = 0;
	                    while (posicao < filaAluno.tamanho() && filaAluno.pegar(posicao).getIdade() <= idade) {
	                        posicao++;
	                    }
	                    filaAluno.inserirIndice(posicao, aluno);

	                    System.out.println("\tAluno inserido com sucesso");
	            		break;
	            	case 2:
	            		if (filaAluno.vazia())
	                        System.out.println("\tA fila está vazia.");
	                    else
	                        filaAluno.listar();
	            		break;
	            	case 3:
	            		System.out.println("\tEncerrando...");
	            		break;
            	}
            	System.out.println("------------------------------------------");
            }


        } while (opcao != 3);

        ler.close();
	}
	
	// Questão 5
	public static void filaPacientes() {
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		
		Fila<Contato> filaPaciente = new Fila<Contato>();
		
		do {
			
			System.out.println("=============== QUESTÃO 5 - FILA PACIENTES ===============");
			System.out.println("(1) Inserir paciente");
            System.out.println("(2) Atender paciente");
            System.out.println("(3) Existe paciente na fila?");
            System.out.println("(4) Próximo paciente a ser atentido");
            System.out.println("(5) Quantos pacientes aguardam?");
            System.out.println("(6) Sair");
            System.out.print("Escolha uma opção: ");
            
            try {            	
            	opcao = Integer.parseInt(ler.nextLine());
            } catch (Exception e) {
            	opcao = 0;
			}
            
            if(opcao < 1 || opcao > 6) {
            	System.err.println("\tOpção inválida");
            } else {
            	System.out.println("------------------------------------------");
            	switch (opcao) {
	            	case 1: 
	            		Contato contato = new Contato();
	            		System.out.print("\tInforme o nome do paciente: ");
	            		contato.setNome(ler.nextLine());
	            		System.out.print("\tInforme o telefone do paciente: ");
	            		contato.setTelefone(ler.nextLine());
	            		filaPaciente.inserir(contato);
	            		System.out.println("\tPaciente inserido com sucesso");
	            		break;
	            	case 2:
	            		Contato pacienteAtendido = filaPaciente.remover();
	            		if(pacienteAtendido != null)
	            			System.out.println("\tPeciente <"+pacienteAtendido.getNome()+"> foi atendido");
	            		else 
	            			System.out.println("\tNenhum paciente na fila");
	            		break;
	            	case 3:
	            		String existePaciente = filaPaciente.vazia() ? "Não" : "Sim";
	            		System.out.println("\t"+ existePaciente);
	            		break;
	            	case 4:
	            		if(filaPaciente.primeiro() != null) 
	            			System.out.println("\tPróximo paciente: "+filaPaciente.primeiro().getNome());
	            		else 
	            			System.out.println("\tNenhum paciente na fila");
	            		break;
	            	case 5:
	            		if(filaPaciente.vazia())
	            			System.out.println("\tNenhum paciente aguardando");
	            		else 
	            			System.out.println(filaPaciente.tamanho()+" paciente(s) aguardando");
	            		break;
	            	case 6:
	            		System.out.println("\tEncerrando...");
	            		break;
	        	}
            	System.out.println("------------------------------------------");
            }
            
		} while(opcao != 6);
		
		ler.close();
	}
	
}
