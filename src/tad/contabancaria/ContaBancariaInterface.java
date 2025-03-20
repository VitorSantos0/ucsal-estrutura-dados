package tad.contabancaria;

public interface ContaBancariaInterface {
	void visualizarSaldo(ContaBancaria conta);
	void sacar(ContaBancaria conta, double valor);
	void atualizar(ContaBancaria conta, double novoValor);
}
