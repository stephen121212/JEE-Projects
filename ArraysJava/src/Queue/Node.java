package Queue;

public class Node {
	private int value;
	private Node next;
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
	
	public int getValue() {
		return value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		this.next = n;
	}
}
