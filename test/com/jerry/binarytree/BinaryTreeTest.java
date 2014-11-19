package com.jerry.binarytree;

/**
 * 二叉树
 * @author Jerry Wang
 *
 */
public class BinaryTreeTest {
	public void testBinaryTree() {
		BinaryTree<String> tree = new ArrayBinaryTree<String>(4, "root");
		tree.add(0, "0_left", true);
		tree.add(0, "0_right", false);

		tree.add(1, "1_left", true);
		tree.add(1, "1_right", false);

		tree.add(2, "2_left", true);
		tree.add(2, "2_right", false);
		System.out.println(tree);
	}
}
