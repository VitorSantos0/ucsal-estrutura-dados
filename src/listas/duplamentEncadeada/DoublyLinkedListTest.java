package listas.duplamentEncadeada;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		list.insertLeft(10);
		try {
			list.print();
		} catch (EmpryListException e) {
			System.out.println(e.getMessage());
		}
	}

}
