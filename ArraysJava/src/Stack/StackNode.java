package Stack;

public class StackNode {
	private int value;
	private StackNode next;
	
	public StackNode(int value) {
		this.value = value;
		this.next = null;
	}
	
	public void setNext(StackNode n) {
		this.next = n;
	}
	
	public StackNode getNext() {
		return next;
	}
	
	public int getValue() {
		return value;
	}
}
