package com.cs635.assignment3.bst;

public class BinarySearchTree implements PostfixBST {

	public Node root;
	Ordering strategy;
	
	public BinarySearchTree(Ordering strategy){
		root = new EmptyNode();
		this.strategy = strategy;
	}
	
	public void insert(String data) {
		root = insertRec(root, data);
	}
	
	Node insertRec(Node root, String data) {
		if(strategy.compare(root, data) == Integer.MIN_VALUE){
			root = new BinaryNode(data);
		}else if(strategy.compare(root, data) <= 0) {
			root.setLeft(insertRec(root.getLeft(), data));
		}else if(strategy.compare(root, data) > 0) {
			root.setRight(insertRec(root.getRight(), data));
		}
		
		return root;
	}
	
	@Override
	public String accept(PostfixVisitor visitor) {
		return visitor.visit(this);
	}
}
