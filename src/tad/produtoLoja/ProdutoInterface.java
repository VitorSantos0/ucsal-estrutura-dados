package tad.produtoLoja;

public interface ProdutoInterface {
	void save(String nome, long codigo, long quantidade_estoque, double preco_unitario);
}
