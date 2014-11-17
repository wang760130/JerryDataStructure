package com.jerry.stack;


/**
 * 栈通用接口
 * @author Jerry Wang
 * 
 */
public interface Stack<T> {
	public void push(T item);

	public T pop();

	public T top();

	public boolean isEmpty();

	public int size();
	
	public void clear();
}
