package recursividade;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(CalculaMMCRecursivo(12, 18, Math.max(12, 18)));
		
	}

	// questão 1
	public static int CalculaMDCRecursivo(int m, int n) {
		if (n == 0) return m;
	    return CalculaMDCRecursivo(n, m % n);
	}
	
	// questão 2
	public static int fatorial(int n) {
		return n != 0 ? n * fatorial(n-1) : 1;
	}
	
	// questão 3
	public static String conversaoDecimalBinario(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return conversaoDecimalBinario(n / 2) + (n % 2);
    }
	
	// questão 4
	public static int somaNumeros(int n) {
        if (n == 0) return 0;
        return (n % 10) + somaNumeros(n / 10);
    }
	
	// questão 5
	public static void imprimirNumerosInteiros(int atual, int n) {
        if (atual > n) return;
        System.out.print(atual + " ");
        imprimirNumerosInteiros(atual + 1, n);
    }
	
	// questão 6
	public static void contagemRegressiva(int n) {
        if (n == 0) return;
        System.out.println(n);
        contagemRegressiva(n - 1);
    }
	
	// questão 7
	public static boolean palindromo(String s, int inicio, int fim) {
        if (inicio >= fim) return true;
        if (s.charAt(inicio) != s.charAt(fim)) return false; 
        return palindromo(s, inicio + 1, fim - 1);
    }
	
	// questão 8
	public static int somaPrimeirosNaturais(int n) {
        if (n == 0) return 0;
        return n + somaPrimeirosNaturais(n - 1);
    }
	
	// questão 9
	public static int potenciaRecursiva(int num, int pot) {
		return pot > 0 ? num * potenciaRecursiva(num, pot-1) : num/num;
	}
	
	// questão 10
	public static int fibonnaciRecursivo(int limite) {
		return limite == 0 ? limite : limite != 1 ? fibonnaciRecursivo(limite-1) + fibonnaciRecursivo(limite-2) : limite;
	} 
    
	// questão 11
	public static String inverteString(String s) {
        if (s.isEmpty()) return s;
        return inverteString(s.substring(1)) + s.charAt(0);
    }
	
	// questão 12
	public static int somaElemtnosArray(int[] array, int index) {
        if (index == array.length) return 0;
        return array[index] + somaElemtnosArray(array, index + 1);
    }
	
	// questão 13
	public static int contaCaractere(String s, char c, int index) {
        if (index == s.length()) return 0;
        int count = (s.charAt(index) == c) ? 1 : 0;
        return count + contaCaractere(s, c, index + 1); 
    }
	
	// questão 14
	public static int encontraMaiorElementoArray(int[] array, int index, int maior) {
        if (index == array.length)return maior;
        if (array[index] > maior) maior = array[index];
        return encontraMaiorElementoArray(array, index + 1, maior);  
    }
	
	// questão 15
	public static int CalculaMMCRecursivo(int a, int b, int incremento) {
        if (a == 0 || b == 0) return 0;
        if (incremento % a == 0 && incremento % b == 0) return incremento;
        return CalculaMMCRecursivo(a, b, incremento + 1);
    }
	
	// o desafio não deu tempo :/
	
}
