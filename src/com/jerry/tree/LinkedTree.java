package com.jerry.tree;

import java.util.List;

/**
 * 链表实现树结构
 * @author Jerry Wang
 *
 */
public class LinkedTree<T> implements Tree<T>  {
	private final int DEFAULT_SIZE = 10;
	private int size = 0;
	private int count = 0;
	private Node<T>[] nodes = null;
	
	@SuppressWarnings("unchecked")
	public LinkedTree() {
		this.size = this.DEFAULT_SIZE;
		this.nodes = new Node[this.size];
		this.count = 0;
	}
	
	public LinkedTree(T data) {
		// TODO Auto-generated method stub
	}
	
	public LinkedTree(Node<T> root) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void add(Node<T> node) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void add(Node<T> node, Node<T> parent) {
		
	}
	@Override
	public int position(Node<T> node) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Node<T> getRoot() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Node<T>> getAllNodes() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getDepth() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
