package listas.revisao;

public interface RedeSocialTADInterface<T> {
	T adicionar();
	T atualizar();
	boolean remover();
	void listar();
}
