package selectionSort;

import java.util.Random;

public class RandomSelectionSort {

	private int[] numeros;
	private int tamanho;
	
	public RandomSelectionSort(int tamanho) {
		this.tamanho = tamanho;
		this.numeros = new int[tamanho];
		Random r = new Random();
		for(int i = 0; i < tamanho; i ++) {
			numeros[i] = r.nextInt(100);
		}
	}
	
	public void ordenar() {
		for(int i = 0; i < tamanho - 1; i++) {
			int menorIndice = i;
			for(int j = i+1; j < tamanho; j++) {
				if (numeros[j] < numeros[menorIndice]) {
					menorIndice = j; 
                }	
			}
			int aux = numeros[menorIndice];
			numeros[menorIndice] = numeros[i];
			numeros[i] = aux;
		}
	}
	
	public void imprimir() {
		for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
	}
	
}
