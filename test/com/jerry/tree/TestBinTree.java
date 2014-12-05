package com.jerry.tree;

import org.junit.Before;
import org.junit.Test;

/**
 * 二叉树测试
 * @author Jerry Wang
 *
 */
public class TestBinTree {
	BinTree<String> parent = null;
	@Before
	public void init() {
		BinTree<String> g = new BinTree<String>("G");
		BinTree<String> d = new BinTree<String>("D", null, g);
		BinTree<String> e = new BinTree<String>("E");
		BinTree<String> i = new BinTree<String>("I");
		BinTree<String> h = new BinTree<String>("H");
		BinTree<String> f = new BinTree<String>("F", h, i);
		BinTree<String> c = new BinTree<String>("C", f, null);
		BinTree<String> b = new BinTree<String>("B", d, e);
		parent = new BinTree<String>("A", b, c);
	}
	
	@Test
	public void preOrderTest() {
		parent.preOrder(parent);
	}
	
//	System.out.println("前序遍历二叉树结果: ");
//	tree.preOrder(tree);
//	System.out.println();
//	System.out.println("中序遍历二叉树结果: ");
//	tree.inOrder(tree);
//	System.out.println();
//	System.out.println("后序遍历二叉树结果: ");
//	tree.postOrder(tree);
//	System.out.println();
//	System.out.println("层次遍历二叉树结果: ");
//	tree.LayerOrder(tree);
//	System.out.println();
//	System.out.println("F所在的层次: " + tree.level("F"));
//	System.out.println("这棵二叉树的高度: " + tree.height());
//	System.out.println("--------------------------------------");
//	tree.reflect();
//	System.out.println("交换每个节点的孩子节点后......");
//	System.out.println("前序遍历二叉树结果: ");
//	tree.preOrder(tree);
//	System.out.println();
//	System.out.println("中序遍历二叉树结果: ");
//	tree.inOrder(tree);
//	System.out.println();
//	System.out.println("后序遍历二叉树结果: ");
//	tree.postOrder(tree);
//	System.out.println();
//	System.out.println("层次遍历二叉树结果: ");
//	tree.LayerOrder(tree);
//	System.out.println();
//	System.out.println("F所在的层次: " + tree.level("F"));
//	System.out.println("这棵二叉树的高度: " + tree.height());
}
