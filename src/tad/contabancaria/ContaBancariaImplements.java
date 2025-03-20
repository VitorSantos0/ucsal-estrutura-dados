package tad.contabancaria;

public class ContaBancariaImplements implements ContaBancariaInterface {

	@Override
	public void visualizarSaldo(ContaBancaria conta) {
		conta.toString();
	}

	@Override
	public void sacar(ContaBancaria conta, double valor) {
		if(conta.getSaldo() >= valor)		
			conta.setSaldo(conta.getSaldo() - valor);
		this.visualizarSaldo(conta);
	}

	@Override
	public void atualizar(ContaBancaria conta, double novoValor) {
		conta.setSaldo(novoValor);
		this.visualizarSaldo(conta);
	}

}
