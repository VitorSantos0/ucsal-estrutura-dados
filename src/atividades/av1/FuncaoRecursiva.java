package atividades.av1;

public class FuncaoRecursiva {

	public static void main(String[] args) {
		System.out.println(somaNaturais(2));
	}

	public static int somaNaturais(int n) {
		if(n < 1) return 0;
        if (n == 1) return 1;
        return n + somaNaturais(n - 1);
    }
}
