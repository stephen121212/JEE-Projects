package Trees;

public class TreeNode {
	private int value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public TreeNode(int value, TreeNode left, TreeNode right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public void setLeft(TreeNode n) {
		this.left = n;
	}
	
	public void setRight(TreeNode n) {
		this.right = n;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public int getValue() {
		return value;
	}
}
