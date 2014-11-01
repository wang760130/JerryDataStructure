package com.jerry.list;


/**
 * 单向链表
 * @author Jerry Wang
 *
 */
class SingleLinkedList<T> {
	
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
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	
	public void insert(T key) {
		head = new Node<T>(key,head);
		size++;
	}
	
	public T front() {
		return head.key;
	}
	
	public T get(int index) {
		if(index > size || index < 0) {
			return null;
		}
		int i = 0;
		Node<T> pre = head;
		while(i++ < index) {
			pre = pre.next;
		}
		return pre.key;
	}
	
	public T delete() {
		T node = head.key;
		head = head.next;
		size--;
		return node;
	}
	
	public void delete (T key) {
		Node<T> node  = this.searchNode(key);
		if(null == node) {
			return;
		}
		if(size == 1) {
			head = null;
		} else {
			Node<T> pre = head;
			while(pre.next != null && pre.next != node) {
				pre = pre.next;
				pre.next = node.next;
			}
		}
		size --;
	}
	
	public Node<T> searchNode(T key) {
		Node<T> pre = head;
		while (pre != null && pre.key != key) {
			pre = pre.next;
		}
		return pre;
	}
	
	public int searchIndex(T t) {
		Node<T> pre = head;
		int i = 0;
		while(pre != null && pre.key != t) {
			i++;
			pre = pre.next;
		}
		if(pre!= null)
			return i;
		else
			return -1;
	} 
	
	public Node<T> getNode(int index) {
		if(index < 0 && index >= size) 
			return null;
		int i = 0;
		Node<T> pre = head;
		while(i++ < index)
			pre = pre.next;
		return pre;
	}
	
	/**
	 * 求链表逆序
	 * 方法一：
	 * 是把前面的元素从后向前一次放在链表结尾  
     * 还要查找元素节点，查找过程为n所以时间复杂度已经为 ：n的平方 了 
	 */
	public void reverse() {
		if(size <= 1)
			return ;
		int i = size - 2;
		Node<T> tail = this.getNode(i);
		while(i >= 0) {
			Node<T> e = this.getNode(i);
			if(e != head) {
				Node<T> pre = this.getNode(i - 1);
				tail.next = e;
				pre.next = e;
				tail = e;
				tail.next = null;
			} else {
				tail.next = head;
				tail = head;
				head = head.next;
				tail.next = null;
			}
			i++;
		}
	}
	
	/**
	 * 求链表逆序
	 * 方法二:
	 *  从后面像最前面插入，插入排序的思想 
	 */
	public void reverse2() {
		if(size <= 1)
			return ;
		int i = 1;
		Node<T> pre, insertNode,next;
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
