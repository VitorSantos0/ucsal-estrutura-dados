package atividades.av3;

import java.util.Random;

public class ArvoreMestre {

	public static void main(String[] args) {
		
		ArvoreNumerica arvore = new ArvoreNumerica();
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			arvore.inserir(random.nextInt(1,100));
		}
		
		System.out.println("Numeros na arvore:");
		arvore.exibePreOrdem();
		
		System.out.println();
		
		PilhaPares pilhaNaArvore = arvore.pilha;
		System.out.println("Pilha Pares:");
		pilhaNaArvore.imprimir();
		
		FilaImpares filaNaArvore = arvore.fila;
		System.out.println("Fila Impares:");
		filaNaArvore.imprimir();
		                    
	}
}
