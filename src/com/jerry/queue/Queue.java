package com.jerry.queue;

/**
 * 队列通用接口
 * @author Jerry Wang
 *
 * @param <T>
 */
public interface Queue<T>{
	public void insert(T t);
	
	public void remove();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public int size();
}
