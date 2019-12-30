package com.cs635.assignment3.bst;

public class LexicographicOrder implements Ordering {

	@Override
	public int compare(Node root, String data) {
		return root.compare(root.getKey(), data);
	}

}
