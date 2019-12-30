package com.cs635.assignment3.bst;

public class PostfixVisitorImpl implements PostfixVisitor {

	@Override
	public String visit(BinarySearchTree tree) {
		String output = "";
		return postfix(tree.root, output);
	}
	
	String postfix(Node root, String output) {
		if(!root.isNull()) {
			return output + "(" + root.getKey() + 
			postfix(root.getLeft(), output) + 
			postfix(root.getRight(), output) + ")";
		}else {
			return output + "()";
		}
	}
}
