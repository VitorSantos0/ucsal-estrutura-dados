package atividades.av2;

public class NoArvore {
	String valor;
	NoArvore esquerda, direira;

	NoArvore(String value) {
        this.valor = value;
        this.esquerda = null;
        this.direira = null;
    }

    boolean ehOperador() {
        return valor.equals("+") || valor.equals("-") || valor.equals("*") || valor.equals("/");
    }
}
