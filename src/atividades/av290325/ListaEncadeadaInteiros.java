package atividades.av290325;

import java.util.Scanner;

public class ListaEncadeadaInteiros {

	public static void main(String[] args) {
		
		ListaInteiros listaInteiro = new ListaInteiros();
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int inteiros = 3;
		for(int i = 1; i <= inteiros; i++) {
			System.out.print("Informe o "+i+"º numero inteiro positivo: ");
			numero = sc.nextInt();
			if(numero % 2 == 0) {
				listaInteiro.adicionar(numero);
			}
		}
		
		listaInteiro.listar();
		
		int resposta = 0;
		do {
			System.out.print("Remover último número da lista? 1 - Sim 2 - Não ");
			resposta = sc.nextInt();
			if(resposta < 1 || resposta > 2) {
				System.out.println("Resposta inválida!");
			} else {
				if(resposta == 1) listaInteiro.remover();
			}
		} while(resposta != 2 && listaInteiro.quantidade() > 0);
		
		sc.close();
		listaInteiro.listar();
		
	}

}
