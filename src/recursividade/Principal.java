package recursividade;

public class Principal {

	public static void main(String[] args) {
		
//		System.out.println(fatorial(4));
//		fibonnaci(55);
		
//		int limite = 0;
//		while(limite < 10) {
//			System.out.println(fibonnaciRecursivo(limite));
//			limite++;
//		}
		
		System.out.println(potenciaRecursiva(8,2));
		
	}
	
	public static int fatorial(int n) {
		return n != 0 ? n * fatorial(n-1) : 1;
	}
	
	public static void fibonnaci(int limite) {
		int seq = 0;
		int prox = 1;
		int aux = 0;
		while(prox < limite) {
			System.out.println(seq);
			aux = seq;
			seq += prox; 
			prox = aux; 
		}
	}
	
	public static int fibonnaciRecursivo(int limite) {
		return limite == 0 ? limite : limite != 1 ? fibonnaciRecursivo(limite-1) + fibonnaciRecursivo(limite-2) : limite;
	} 
	
	public static int potenciaRecursiva(int num, int pot) {
		return pot > 0 ? num * potenciaRecursiva(num, pot-1) : num/num;
	}

}
