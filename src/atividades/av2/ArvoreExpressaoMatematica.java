package atividades.av2;

public class ArvoreExpressaoMatematica {

	public static void main(String[] args) {
		
		NoArvore raiz = new NoArvore("-");
		raiz.esquerda = new NoArvore("+");
		raiz.esquerda.esquerda = new NoArvore("6");
		raiz.esquerda.direira = new NoArvore("2");
		raiz.direira = new NoArvore("/");
		raiz.direira.esquerda = new NoArvore("12");
		raiz.direira.direira = new NoArvore("+");
		raiz.direira.direira.esquerda = new NoArvore("1");
		raiz.direira.direira.direira = new NoArvore("3");

        System.out.println("Expressão Matemática: "+gerarExpressao(raiz));
        System.out.println("Resultado: "+analisarArvore(raiz));
	
	}
	
	public static double analisarArvore(NoArvore no) {
        if (no == null) return 0;
        if (!no.ehOperador()) return Double.parseDouble(no.valor);
        double valorEsquerda = analisarArvore(no.esquerda);
        double valorDireita = analisarArvore(no.direira);
        switch (no.valor) {
            case "+": return valorEsquerda + valorDireita;
            case "-": return valorEsquerda - valorDireita;
            case "*": return valorEsquerda * valorDireita;
            case "/": return valorEsquerda / valorDireita;
            default: throw new IllegalArgumentException("Operador inválido");
        }
    }
	
	public static String gerarExpressao(NoArvore no) {
        if (no == null) return "";
        if (!no.ehOperador()) return no.valor;
        return "(" + gerarExpressao(no.esquerda) + " " + no.valor + " " + gerarExpressao(no.direira) + ")";
    }
	
}
