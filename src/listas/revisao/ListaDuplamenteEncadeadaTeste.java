package listas.revisao;

public class ListaDuplamenteEncadeadaTeste {

	public static void main(String[] args) {
	
		Professor prof1 = new Professor("Daisy");
		Professor prof2 = new Professor("Vitor");
		Professor prof3 = new Professor("Sophia");
		Professor prof4 = new Professor("Lucas");
		Professor prof5 = new Professor("Julia");
		
		ListaDuplamenteEncadeadaProfessor lista = new ListaDuplamenteEncadeadaProfessor();
		
		lista.inserirInicio(prof1);
		
		lista.inserirInicio(prof2);
		
		lista.imprimir();
		
		lista.inserirFinal(prof3);
		
		lista.inserirFinal(prof4);
		
		lista.imprimir();
		
		lista.inserirInicio(prof5);
		
		lista.imprimir();
		
		lista.removerInicio();
		
		lista.removerFinal();
		
		lista.imprimir();

	}

}
