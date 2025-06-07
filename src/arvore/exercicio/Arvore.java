package arvore.exercicio;

public class Arvore {
	NoArvore raiz;
	NoArvore atual;
	
	public Arvore() {
		raiz = null;
	}
	
	public boolean inserirRaiz(int valor) {
		if(this.raiz != null) return false;
		NoArvore novoNo = new NoArvore();
		novoNo.valor = valor;
		novoNo.esquerda = novoNo.direita = null;
		raiz = novoNo;
		return true;
	}
	
	public void inserir(int valor) {
		NoArvore novoNo = new NoArvore();
		novoNo.valor = valor;
		if(raiz == null) {
			inserirRaiz(valor);
			return;
		}
		if(atual == null) atual = raiz;
		if(novoNo.valor < atual.valor) {
			if(atual.esquerda == null) {
				atual.esquerda = novoNo;
				return;
			}
			atual = atual.esquerda;
		} else {
			if(atual.direita == null) {
				atual.direita = novoNo;
				return;
			}
			atual = atual.direita;
		}
		inserir(valor);
		atual = raiz;
	}
	
	private void exibePreOrdem(NoArvore no) {
		if(no == null) return;
		System.out.print(no.valor+" ");
		if(no.direita != null) exibePreOrdem(no.direita);
		if(no.esquerda != null) exibePreOrdem(no.esquerda);
	}
	
	public void exibePreOrdem() {
		if(raiz == null) System.out.println("Arvore não possui elementos");
		else exibePreOrdem(raiz);
	}
	
	private void exibeCentral(NoArvore no) {
		if(no == null) return;
		if(no.esquerda != null) exibeCentral(no.esquerda);
		System.out.print(no.valor+" ");
		if(no.direita != null) exibeCentral(no.direita);
	}
	
	public void exibeCentral() {
		if(raiz == null) System.out.println("Arvore não possui elementos");
		else exibeCentral(raiz);
	}
	
	private void exibePosOrdem(NoArvore no) {
		if(no == null) return;
		if(no.esquerda != null) exibePosOrdem(no.esquerda);
		if(no.direita != null) exibePosOrdem(no.direita);
		System.out.print(no.valor+" ");
	}
	
	public void exibePosOrdem() {
		if(raiz == null) System.out.println("Arvore não possui elementos");
		else exibePosOrdem(raiz);
	}
	
	private void exibeFolhas(NoArvore no) {
		if (no == null) return;
		if (no.esquerda == null && no.direita == null) System.out.print(no.valor + " ");
		if (no.esquerda != null) exibeFolhas(no.esquerda);
		if (no.direita != null) exibeFolhas(no.direita);
	}
	
	public void exibeFolhas() {
		if (raiz == null) System.out.println("Arvore não possui elementos");
		else exibeFolhas(raiz);
	}
	
	public void exibeNivel1() {
		if (raiz == null) {
			System.out.println("A árvore está vazia.");
			return;
		}
		System.out.print(raiz.valor+" => ");
		if (raiz.esquerda != null) {			
			System.out.print(raiz.esquerda.valor+" ");
		} else {			
			System.out.println("vazio ");
		}
		if (raiz.direita != null) {			
			System.out.print(raiz.direita.valor+" ");
		} else {			
			System.out.print("vazio ");
		}
	}
	
}
