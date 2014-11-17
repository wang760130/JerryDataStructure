package com.jerry.stack;

import java.util.Arrays;

/**
 * 使用数组实现栈
 * @author Jerry Wang
 *
 */
public class ArrayStack<T> implements Stack<T>{
	private final int DEFAULT_SIZE = 3;
	private int size = 0;
	/**
	 * 当前栈的大小
	 */
	private int capacity = 0;
	
	private int top = 0;
	private Object[] array = null;
	
	public ArrayStack() {
		this.capacity = this.DEFAULT_SIZE;
		this.array = new Object[this.capacity];
		this.size = 0;
	}
	
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		this.array = new Object[this.capacity];
		this.size = 0;
	}
	
	@Override
	public void push(T item) {
		if(this.size < this.capacity) {
			this.array[top] = item;
			this.top++;
			this.size++;
		} else {
			this.enlarge();
			this.push(item);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		T item = (T) this.array[top - 1];
		this.array[top - 1] = null;
		this.size--;
		return item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T top() {
		return (T)this.array[this.top - 1];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		Arrays.fill(array, null);
		this.top = 0;
		this.size = 0;
		this.capacity = this.DEFAULT_SIZE;
		this.array = new Object[this.capacity];
	}

	private void enlarge() {
		this.capacity = this.capacity + this.DEFAULT_SIZE;
		Object[] newArray = new Object[this.capacity];
		System.arraycopy(array, 0, newArray, 0, array.length);
		Arrays.fill(array, null);
		this.array = newArray;
	}
}
