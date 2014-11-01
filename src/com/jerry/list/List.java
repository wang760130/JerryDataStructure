package com.jerry.list;


/**
 * 链表接口
 * @author Jerry Wang
 *
 * @param <T>
 */
public interface List<T> {
	public int size();
	
	public boolean isEmpty();
	
	public void insert(T key);
	
	public T front();
	
	public T get(int index);
	
	public T delete();
	
	public void delete (T key);
	
	public int searchIndex(T t);
	
	
}
