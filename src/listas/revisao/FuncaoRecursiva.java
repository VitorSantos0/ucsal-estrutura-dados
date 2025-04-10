package listas.revisao;

public class FuncaoRecursiva {

	public static void main(String[] args) {
		
		System.out.println(potenciaRecursiva(5, 2));

	}
	
	public static int potencia (int x, int y) {
		if(y < 0) {
			return x/x;
		}
		int num = x;
		while(y > 1) {
			x *= num;
			y--;
		}
		return x;
	}
	
	public static int potenciaRecursiva(int x, int y) {
		return y > 0 ? x * potenciaRecursiva(x, y-1) : x/x;
	}

}
