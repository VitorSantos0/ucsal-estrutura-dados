package arvore;

public class ArvoreBinaria {
	private No raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public boolean inserirRaiz(int valor) {
		if(this.raiz != null) return false;
		No novoNo = new No();
		novoNo.setConteudo(valor);
		novoNo.setEsquerda(null);
		novoNo.setDireita(null);
		raiz = novoNo;
		return true;
	}
	
	public boolean vazia() {
		return this.raiz == null;
	}
	
	private No busca(No T, int valor) {
		if(T == null) return null;
		if(T.getConteudo() == valor) return T;
		No aux = busca(T.getEsquerda(), valor);
		if(aux == null) aux = busca(T.getDireita(), valor);
		return aux;
	}
	
	public No busca(int valor) {
		if(vazia()) return null;
		return busca(raiz, valor);
	}
	
	public boolean inserirEsquerda(int vPai, int vFilho) {
		No filho = busca(vFilho);
		if(filho != null) return false;
		No pai = busca(vPai);
		if(pai == null) return false;
		if(pai.getEsquerda() != null) return false;
		No novoNo = new No();
		novoNo.setConteudo(vFilho);
		novoNo.setEsquerda(null);
		novoNo.setDireita(null);
		pai.setEsquerda(novoNo);
		return true;
	}
	
	public boolean inserirDireita(int vPai, int vFilho) {
		No filho = busca(vFilho);
		if(filho != null) return false;
		No pai = busca(vPai);
		if(pai == null) return false;
		if(pai.getDireita() != null) return false;
		No novoNo = new No();
		novoNo.setConteudo(vFilho);
		novoNo.setEsquerda(null);
		novoNo.setDireita(null);
		pai.setDireita(novoNo);
		return true;
	}
	
	private void exibePreOrdem(No T) {
		if(T == null) return;
		System.out.print(T.getConteudo()+" ");
		if(T.getEsquerda() != null) exibePreOrdem(T.getEsquerda());
		if(T.getDireita() != null) exibePreOrdem(T.getDireita());
	}
	
	private void exibeCentral(No T) {
		if(T == null) return;
		if(T.getEsquerda() != null) exibePreOrdem(T.getEsquerda());
		System.out.println(T.getConteudo());
		if(T.getDireita() != null) exibePreOrdem(T.getDireita());
	}
	
	private void exibePosOrdem(No T) {
		if(T == null) return;
		if(T.getEsquerda() != null) exibePreOrdem(T.getEsquerda());
		if(T.getDireita() != null) exibePreOrdem(T.getDireita());
		System.out.println(T.getConteudo());
	}
	
	public void exibePreOrdem() {
		if(vazia()) System.out.println("Arvore não possui elementos");
		else exibePreOrdem(raiz);
	}
	
	public void exibeCentral() {
		if(vazia()) System.out.println("Arvore não possui elementos");
		else exibeCentral(raiz);
	}
	
	public void exibePosOrdem() {
		if(vazia()) System.out.println("Arvore não possui elementos");
		else exibePosOrdem(raiz);
	}
	
}
