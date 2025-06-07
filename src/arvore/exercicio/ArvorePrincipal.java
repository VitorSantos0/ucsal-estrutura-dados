package arvore.exercicio;

public class ArvorePrincipal {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		arvore.inserir(5);
		arvore.inserir(3);
		arvore.inserir(4);
		arvore.inserir(9);
		arvore.inserir(7);
		arvore.inserir(11);
		
		System.out.print("central a esquerda: ");
		arvore.exibeCentral();
		System.out.println();
		
		System.out.print("pré-fixado a direita: ");
		arvore.exibePreOrdem();
		System.out.println();
		
		System.out.print("pós-fixado a esquerda: ");
		arvore.exibePosOrdem();
		System.out.println();
		
		System.out.print("todos os nós folhas: ");
		arvore.exibeFolhas();
		System.out.println();
		
		System.out.print("pai(raiz) e seus Filhos: ");
		arvore.exibeNivel1();
	}
	
}
