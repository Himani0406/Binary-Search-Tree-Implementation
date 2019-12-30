package com.cs635.assignment3.bst;

public class EmptyNode implements Node {

	@Override
	public String getKey() {
		return "()";
	}
	
	@Override
	public int compare(String root, String data) {
		return Integer.MIN_VALUE;
	}

	@Override
	public Node getLeft() {
		return null;
	}
	
	@Override
	public Node getRight() {
		return null;
	}

	@Override
	public void setLeft(Node left) {
	}
	
	@Override
	public void setRight(Node right) {
	}
	
	@Override
	public boolean isNull() {
		return true;
	}
}
