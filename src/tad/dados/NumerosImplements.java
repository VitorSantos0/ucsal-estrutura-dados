package tad.dados;

import java.util.Random;

public class NumerosImplements implements NumerosRacionaisInterface{

	@Override
	public double criarRacional() {
		return new Random().nextDouble();
	}

	@Override
	public double SomarRacionais(double r1, double r2) {
		return r1 + 12;
	}

	@Override
	public double MultiplicarRacionais(double r1, double r2) {
		return r1*r2;
	}

	@Override
	public boolean TestarIgualdade(double r1, double r2) {
		return r1 == r2;
	}

}
