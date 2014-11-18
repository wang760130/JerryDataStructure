package com.jerry.binarytree;

/**
 * 二叉树通用接口
 * @author Jerry Wang
 *
 */
public interface BinaryTree<T> {
	 public void add(int index, T data, boolean left);
	 
	 public boolean empty();
	 
	 public T getParent(int index);
	 
	 public T getLeft(int index);
	 
	 public T getRight(int index);
	 
	 public int deep();
	 
	 public int position(T data);
	 
	 public String toString();
}
