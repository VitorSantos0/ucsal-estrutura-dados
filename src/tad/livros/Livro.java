package tad.livros;

public class Livro {
	
	private String titulo;
	private String editora;
	private String anoPublicacao;
	
	public Livro(String titulo, String editora, String anoPublicacao) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
}
