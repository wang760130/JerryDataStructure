package com.jerry.list;

import java.util.Arrays;

/**
 * 使用数组实现链表
 * @author Jerry Wang
 *
 */
public class ArrayList<T> implements List<T>{
	private final static int DEFAUT_SIZE = 10;
	private Object[] data = null;
	private int size = 0;
	private int capacity = 0;
	
	public ArrayList(int initialCapacity) {
		super();
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
		this.capacity = initialCapacity;
		this.data = new Object[initialCapacity];
	}
	
	public ArrayList() {
		this(DEFAUT_SIZE);
		this.capacity = DEFAUT_SIZE;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(T e) {
		return this.indexOf(e) >= 0;
	}

	@Override
	public Object[] toArray() {
		return Arrays.copyOf(this.data, size);
	}

	@Override
	public T[] toArray(T[] e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		if(this.size >= this.capacity) {
			this.enlarge();
		}
		this.data[this.size++] = e;
		return true;
	}

	private void enlarge() {
		this.capacity = (this.capacity * 3) / 2 + 1;
		this.data = Arrays.copyOf(this.data, this.capacity);
	}

	@Override
	public boolean remove(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(List<T> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(List<T> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, List<T> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(List<T> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(List<T> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T set(int index, T e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, T e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T e) {
		if (e == null) {
			for (int i = 0; i < size; i++)
				if (this.data[i] == null)
					return i;
		} else {
			for (int i = 0; i < size; i++)
				if (e.equals(this.data[i]))
					return i;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(T e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		for(int i = 0; i < this.size; i++) {
			System.out.print(this.data[i]);
			if(i != this.size - 1) 
				System.out.print("->");
		}
		System.out.println();
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
	}
	
	private void RangeCheck(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
					+ size);
	}
}
