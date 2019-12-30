package com.cs635.assignment3.bst;

public class ReverseLexOrder implements Ordering {

	@Override
	public int compare(Node root, String data) {
		String reverse1 = (new StringBuilder(root.getKey()).reverse()).toString();
		String reverse2 = (new StringBuilder(data).reverse()).toString();
		return root.compare(reverse1, reverse2);
	}

}
