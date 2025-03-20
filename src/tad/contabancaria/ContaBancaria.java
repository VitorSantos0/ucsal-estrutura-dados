package tad.contabancaria;

public class ContaBancaria {

	private String banco;
	private double saldo;
	
	public ContaBancaria(String banco, double saldo) {
		super();
		this.banco = banco;
		this.saldo = saldo;
	}

	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [banco=" + banco + ", saldo=" + saldo + "]";
	}
	
}
