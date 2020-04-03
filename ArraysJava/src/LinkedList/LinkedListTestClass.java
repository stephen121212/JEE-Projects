package LinkedList;

public class LinkedListTestClass {
	public static void main(String[]args) {
		LinkedListClass crunchifyList = new LinkedListClass();
		
		crunchifyList.insert(1);
		crunchifyList.insert(2);
		crunchifyList.insert(5);
		crunchifyList.insert(4);
		crunchifyList.insertAtStart(3);
		crunchifyList.insertAt(3, 55);
		crunchifyList.deleteAt(3);
		crunchifyList.show();
		
		LinkedListClass testList = new LinkedListClass();
		testList = crunchifyList.reverse();
		testList.show();
	}
}
