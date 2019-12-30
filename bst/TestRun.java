package com.cs635.assignment3.bst;

public class TestRun {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(new ReverseLexOrder());
		tree.insert("ab"); 
        tree.insert("aa"); 
        tree.insert("bc"); 
        tree.insert("db"); 
        
        PostfixVisitor visitor = new PostfixVisitorImpl();
        String postfix = tree.accept(visitor);
        System.out.println(postfix);
	}
}
