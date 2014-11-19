package com.jerry.binarytree;

/**
 * 链表实现二叉树
 * @author Jerry Wang
 *
 */
public class LinkedBinaryTree<T> implements BinaryTree<T>{
	
	public static class BinaryTreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left = null;
		public BinaryTreeNode<T> right = null;
		
		public BinaryTreeNode() {
			
		}
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
		
		public BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	private BinaryTreeNode<T> root = null;
	
	public LinkedBinaryTree(BinaryTreeNode<T> root) {
		this.root = root;
	}
	
	public LinkedBinaryTree(T data) {
		this.root = new BinaryTreeNode<T>(data);
	}
	
	@Override
	public void add(int index, T data, boolean left) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public T getRoot() {
		if(this.isEmpty()) {
			throw new RuntimeException("Tree is empty");
		}
		return this.root.data;
	}
	
	@Override
	public T getParent(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getLeft(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getRight(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deep() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int position(T data) {
		// TODO Auto-generated method stub
		return 0;
	}

}
