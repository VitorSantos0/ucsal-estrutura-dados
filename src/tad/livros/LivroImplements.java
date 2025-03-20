package tad.livros;

public class LivroImplements implements LivroInterface {

	@Override
	public Livro save(String titulo, String editora, String anoPublicacao) {
		return new Livro(titulo, editora, anoPublicacao);
	}

}
