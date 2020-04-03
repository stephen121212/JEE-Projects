package Queue;

public class Queue {
	private Node first;
	private Node last; 
	private int length;
	
	public Queue(){
		this.first = null;
		this.last = null;
		this.length = 0;
	}
	
	public Queue enqueue(int value) {
		Node newNode = new Node(value);
		if(this.length == 0) {
			System.out.println("Adding value " + value);
			this.first = newNode;
			this.last = newNode;
		} else {
			System.out.println("Adding value " + value);
			this.last.setNext(newNode);
			this.last = newNode;
		}
		this.length++;
		return this;
	}
	
	public Queue dequeue() {
		if(this.first == null) {
			return null;
		}
		
		if(this.first == this.last) {
			this.last = null;
		}
		
		System.out.println("Removing value " + first.getValue());
		this.first = this.first.getNext();
		this.length--;
		return this;
	}
	
	public Node peek() {
		return this.first;
	}
	
	public int getSize() {
		return this.length;
	}
	
	public boolean isEmpty() {
		if(first != null) {
			return false;
		} 
		return true;
	}
	
	public static void main(String args[]) {
		Queue myQueue = new Queue();
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(5);
		myQueue.enqueue(3);
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		
		System.out.println("Queue size " + myQueue.getSize());
		if(myQueue.isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("Queue is Not Empty");
		}
	}
}
