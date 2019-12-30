package com.cs635.assignment3.bst;

public interface Node {

	public boolean isNull();
	public String getKey();
	public Node getLeft();
	public Node getRight();
	public void setLeft(Node left);
	public void setRight(Node right);
	public int compare(String root, String data);
}
