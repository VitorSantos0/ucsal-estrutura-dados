package pilha;

public class CafeComEstrutura {

	public static void main(String[] args) {
		
		PilhaString pilha = new PilhaString();
		
		System.out.println("Pilha vazia? "+pilha.vazia()+"\n");
		
		pilha.inserir("Amanda Oliveira");
		pilha.inserir("Anderson dos Santos");
		pilha.inserir("Angela Peixoto");
		pilha.inserir("Arthur Gabriel");
		pilha.imprimir();
		
		System.out.println("Pilha vazia? "+pilha.vazia()+"\n");

		pilha.remover();
		pilha.imprimir();
		
	}
	
}
