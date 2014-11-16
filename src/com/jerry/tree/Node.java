package com.jerry.tree;

/**
 * 树结构节点
 * @author Jerry Wang
 *
 * @param <T>
 */
public class Node<T> {
	private T data = null;
	private int parent = 0;
	
	public Node(T data) {
		this.data = data;
	}

	public Node(T data, int parent) {
		this.data = data;
		this.parent = parent;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}
}