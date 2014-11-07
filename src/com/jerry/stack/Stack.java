package com.jerry.stack;


/**
 * 栈通用接口
 * @author Jerry Wang
 * 
 */
public interface Stack<T> {
	T push(T item);

	T pop();

	T top();

	boolean isEmpty();

	int search(Object o);
	
	int size();
}
