package arvore;

public class ArvoreBinaria {
	private No raiz;
	private No atual;
	
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
	
	private No busca(No no, int valor) {
		if(no == null) return null;
		if(no.getConteudo() == valor) return no;
		No aux = busca(no.getEsquerda(), valor);
		if(aux == null) aux = busca(no.getDireita(), valor);
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
	
	public void inserir(int valor) {
		No T = new No();
		T.setConteudo(valor);
		if(vazia()) {
			inserirRaiz(T.getConteudo());
			return;
		}
		if(this.atual == null) this.atual = this.raiz;
		if(T.getConteudo() < this.atual.getConteudo()) {
			if(this.atual.getEsquerda() == null) {				
				this.atual.setEsquerda(T);
				return;
			}
			this.atual = this.atual.getEsquerda();
		} else {
			if(this.atual.getDireita() == null) {				
				this.atual.setDireita(T);
				return;
			}
			this.atual = this.atual.getDireita();
		}
		inserir(valor);
		this.atual = this.raiz;
	}
	
	private void exibePreOrdem(No no) {
		if(no == null) return;
		System.out.print(no.getConteudo()+" ");
		if(no.getEsquerda() != null) exibePreOrdem(no.getEsquerda());
		if(no.getDireita() != null) exibePreOrdem(no.getDireita());
	}
	
	private void exibeCentral(No no) {
		if(no == null) return;
		if(no.getEsquerda() != null) exibePreOrdem(no.getEsquerda());
		System.out.print(no.getConteudo()+" ");
		if(no.getDireita() != null) exibePreOrdem(no.getDireita());
	}
	
	private void exibePosOrdem(No no) {
		if(no == null) return;
		if(no.getEsquerda() != null) exibePreOrdem(no.getEsquerda());
		if(no.getDireita() != null) exibePreOrdem(no.getDireita());
		System.out.println(no.getConteudo());
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
