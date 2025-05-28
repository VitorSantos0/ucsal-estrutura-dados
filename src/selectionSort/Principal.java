package selectionSort;

public class Principal {

	public static void main(String[] args) {
		
		RandomSelectionSort numeros = new RandomSelectionSort(6);
		
		System.out.print("Numeros: ");
		numeros.imprimir();

		numeros.ordenar();

        System.out.print("Numeros Selection Sort: ");
        numeros.imprimir();

	}

}
