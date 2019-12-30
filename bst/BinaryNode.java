package com.cs635.assignment3.bst;

public class BinaryNode implements Node {

	String key;
	Node left, right;
	
	public BinaryNode(String key) {
		this.key = key;
		left = new EmptyNode();
		right = new EmptyNode();
	}
	
	@Override
	public String getKey() {
		return key;
	}
	
	@Override
	public Node getLeft() {
		return left;
	}
	
	@Override
	public Node getRight() {
		return right;
	}
	
	@Override
	public void setLeft(Node left) {
		this.left = left;
	}
	
	@Override
	public void setRight(Node right) {
		this.right = right;
	}
	
	@Override
	public boolean isNull() {
		return false;
	}
	
	@Override
	public int compare(String root, String data) {
		if(data.compareTo(root) > 0) {
			return 1;
		}else if(data.compareTo(root) < 0) {
			return -1;
		}else {
			return 0;
		}
	}
}
