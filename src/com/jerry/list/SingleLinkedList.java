package com.jerry.list;


/**
 * 单向链表
 * @author Jerry Wang
 *
 */
public class SingleLinkedList<T> implements List<T>{
	
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
	
	public SingleLinkedList() {
		size = 0;
		head = null;
	}
	
	private Node<T> searchNode(T key) {
		Node<T> pre = head;
		while (pre != null && pre.key != key)
			pre = pre.next;
		return pre;
	}
	
	private int searchIndex(T key) {
		Node<T> pre = head;
		int i = 0;
		while(pre != null && pre.key != key) {
			i++;
			pre = pre.next;
		}
		if(pre!= null)
			return i;
		else
			return -1;
	} 
	
	private Node<T> getNode(int index) {
		if(index < 0 && index >= size) 
			return null;
		int i = 0;
		Node<T> pre = head;
		while(i++ < index)
			pre = pre.next;
		return pre;
	}
	
	private T front() {
		return head.key;
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
		Node<T> node  = this.searchNode(e);
		if(null == node) 
			return false;
		if(size == 1)
			head = null;
		else {
			Node<T> pre = head;
			while(pre.next != null && pre.next != node) {
				pre = pre.next;
				pre.next = node.next;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		if(index > size || index < 0)
			return null;
		int i = size - 1;
		Node<T> pre = head;
		while(i-- > index) 
			pre = pre.next;
		return pre.key;	
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
		// TODO Auto-generated method stub
		return 0;
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
		Node<T> pre, insertNode, next;
		pre = head;
		//每个要插入元素的头结点都是最初的头结点  
		next = head.next;
		while(i++ < size) {
			insertNode = next;
			if(next.next != null)
				next = next.next;
			pre.next = insertNode.next;
			insertNode.next = head;
			head = insertNode;
		}
	}

}
