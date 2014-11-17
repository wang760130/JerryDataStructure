package com.jerry.stack;

/**
 * 使用链表实现栈
 * @author Jerry Wang
 *
 */
public class LinkedStack<T> implements Stack<T> {
	
	public static class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node() {
			this.data = null;
			this.next = null;
		}
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
		
		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<T> top = null;
	private int size = 0;
	
	public LinkedStack() {
		this.top = null;
		this.size = 0;
	}
	
	public LinkedStack(T data) {
		this();
		Node<T> node = new Node<T>(data);
		this.top = node;
		this.size++;
	}
	
	@Override
	public void push(T item) {
		Node<T> node = new Node<T>(item,top);
		this.top = node;
		this.size++;
	}

	@Override
	public T pop() {
		Node<T> oldTop = this.top;
		if(null == top) {
			return null;
		}
		this.top = this.top.next;
		this.size--;
		return oldTop.data;
	}

	@Override
	public T top() {
		return this.top.data;
	}

	@Override
	public boolean isEmpty() {
		return this.top == null;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void clear() {
		this.top = null;
		this.size = 0;
	}

}
