package com.cs635.assignment3.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.cs635.assignment3.bst.BinarySearchTree;
import com.cs635.assignment3.bst.LexicographicOrder;
import com.cs635.assignment3.bst.PostfixVisitor;
import com.cs635.assignment3.bst.PostfixVisitorImpl;
import com.cs635.assignment3.bst.ReverseLexOrder;

public class BstTest {

	private static BinarySearchTree lexTree;
	private static BinarySearchTree revTree;
	private static PostfixVisitor visitor;
	
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	@BeforeClass
	public static void setUp()
	{
		lexTree = new BinarySearchTree(new LexicographicOrder());
		revTree = new BinarySearchTree(new ReverseLexOrder());
		visitor = new PostfixVisitorImpl();
		
		lexTree.insert("ab");
		lexTree.insert("aa");
		lexTree.insert("bc");
		lexTree.insert("db");
		revTree.insert("ab");
		revTree.insert("aa");
		revTree.insert("bc");
		revTree.insert("db");
	}
	
	@Test
	public void testTraversal()
	{
		Assert.assertEquals("(ab(aa()())(bc()(db()())))", lexTree.accept(visitor));
	}
	
	@Test
	public void testReverseTraversal()
	{
		Assert.assertEquals("(ab(aa()())(bc(db()())()))", revTree.accept(visitor));
	}
	
	@Test
	public void testAddElement()
	{
		Assert.assertEquals("ab", lexTree.root.getKey());
		Assert.assertEquals("aa", lexTree.root.getLeft().getKey());
		Assert.assertEquals("bc", lexTree.root.getRight().getKey());
		Assert.assertEquals("db", lexTree.root.getRight().getRight().getKey());
	}
	
	@Test
	public void testAddReverseElement()
	{
		Assert.assertEquals("ab", revTree.root.getKey());
		Assert.assertEquals("aa", revTree.root.getLeft().getKey());
		Assert.assertEquals("bc", revTree.root.getRight().getKey());
		Assert.assertEquals("db", revTree.root.getRight().getLeft().getKey());
	}
}
