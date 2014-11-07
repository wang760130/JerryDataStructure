package com.jerry.list;


/**
 * 单向链表
 * @author Jerry Wang
 *
 */
public class LinkedList<T> implements List<T>{
	
	private static class Node<T> {
		private T key;
		Node<T> next;
		public Node(T key, Node<T> next) {
			this.key = key;
			this.next = next;
		}
	}
	
	private int size;
	private Node<T> head;
	
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	private Node<T> getNode(T e) {
		Node<T> current = head;
		while (current != null && current.key != e)
			current = current.next;
		return current;
	}
	
	private Node<T> getNode(int index) {
		if(index > size || index < 0)
			return null;
		int i = size - 1;
		Node<T> current = head;
		while(i-- > index) 
			current = current.next;
		return current;	
	}
	
	private int getIndex(T e) {
		Node<T> current = head;
		int i = 0;
		while(current != null && current.key != e) {
			i++;
			current = current.next;
		}
		if(current!= null)
			return i;
		else
			return -1;
	} 
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	@Override
	public boolean contains(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T[] toArray(T[] e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		head = new Node<T>(e,head);
		size++;
		return true;
	}

	@Override
	public boolean remove(T e) {
		Node<T> node  = this.getNode(e);
		if(null == node) 
			return false;
		if(size == 1)
			head = null;
		else {
			Node<T> current = head;
			while(current.next != null && current.next != node) {
				current = current.next;
				current.next = node.next;
			}
		}
		size --;
		return true;
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
		size = 0;
		head.key = null;
		head.next = null;
	}

	@Override
	public T get(int index) {
		return this.getNode(index).key;
	}

	@Override
	public T set(int index, T e) {
		Node<T> node = this.getNode(index);
		node.key = e;
		return e;
	}

	@Override
	public void add(int index, T e) {
		Node<T> newNode = null;
		if(index > size || index < 0) 
			return ;
		else if(index == size - 1)
			this.add(e);
		else if(index == 0) 
			newNode = new Node<T>(e,this.getNode(0));
		else {
			Node<T> current = this.getNode(index);
			newNode = new Node<T>(e,current);
			Node<T> pre = this.getNode(index - 1);
			pre.next = newNode;
		}
		size++;
	}

	@Override
	public T remove(int index) {
		Node<T> current = this.getNode(index);
		if(index > 0 && index < size) {
			
		}
		
		return current.key;
	}

	@Override
	public int indexOf(T e) {
		Node<T> current = head;
		for(int i = size - 1; i >= 0; i--) {
			if(current.key.equals(e))
				return i;
			current = current.next;
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
		for(int i = 0; i < size; i++) {
			System.out.print(this.get(i));
			if(i != size - 1)
				System.out.print("->");
		}
		System.out.println();
	}

	/**
	 * 求链表逆序
	 * 从后面像最前面插入，插入排序的思想 
	 */
	@Override
	public void reverse() {
		if(size <= 1)
			return ;
		int i = 1;
		Node<T> current, insertNode, next;
		current = head;
		//每个要插入元素的头结点都是最初的头结点  
		next = head.next;
		while(i++ < size) {
			insertNode = next;
			if(next.next != null)
				next = next.next;
			current.next = insertNode.next;
			insertNode.next = head;
			head = insertNode;
		}
	}

}
