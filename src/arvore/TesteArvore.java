package arvore;

public class TesteArvore {

	public static void main(String[] args) {
		
		ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
		arvoreBinaria.inserirRaiz(12);
		
		arvoreBinaria.inserirEsquerda(12, 10);
		arvoreBinaria.inserirDireita(12, 14);
		
		arvoreBinaria.inserirEsquerda(10, 8);
		arvoreBinaria.inserirDireita(10, 6);
		
		arvoreBinaria.inserirEsquerda(14, 2);
		arvoreBinaria.inserirDireita(14, 6);
		
		arvoreBinaria.inserirEsquerda(8, 5);
		arvoreBinaria.inserirDireita(8, 4);
		
//		System.out.println("Vamos ver se imprime");
		arvoreBinaria.exibePreOrdem();
		
		
        
	}

	public static void imprimeArvore() {
		int altura = 5;
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= altura - 1; i++) {
            System.out.print(" ");
        }
	}
}
