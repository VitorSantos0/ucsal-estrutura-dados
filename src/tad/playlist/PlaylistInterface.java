package tad.playlist;

public interface PlaylistInterface {
	void adicionar(String titulo, String artista, long duracao);
	void remover(String titulo);
	void listarMusicas();
}
