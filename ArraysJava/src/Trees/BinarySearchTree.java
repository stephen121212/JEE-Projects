package Trees;

public class BinarySearchTree {
	private static TreeNode root;
	
	BinarySearchTree(){
		root = null;
	}
	
	public static void main(String args[]) {
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(9);
		tree.insert(4);
		tree.insert(6);
		tree.insert(4);
		tree.insert(10);
		if(tree.lookup(10)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}
	
	public BinarySearchTree insert(int value) {
		TreeNode newNode = new TreeNode(value);
		if(root == null) {
			System.out.println("Adding value" + value);
			root = newNode;
		} else {
			TreeNode currentNode = root;
			while(true) {
				if(value<currentNode.getValue()) {
					if(currentNode.getLeft() == null) {
						System.out.println("Adding value" + value);
						currentNode.setLeft(newNode);
						return this;
					}
					currentNode = currentNode.getLeft();
				} else {
					if(currentNode.getRight() == null) {
						System.out.println("Adding value" + value);
						currentNode.setRight(newNode);
						return this;
					}
					currentNode = currentNode.getRight();
				}
			}
		}
		return null;
	}
	
	public boolean lookup(int value) {
		if(root == null) {
			return false;
		}
		TreeNode currentNode = root;
		while(currentNode != null) {
			if(value<currentNode.getValue()) {
				currentNode = currentNode.getLeft();
			} else if(value>currentNode.getValue()) {
				currentNode = currentNode.getRight();
			} else if(currentNode.getValue() == value) {
				return true;
			}
		}
		return false;
	}
}
