package com.jerry.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组实现树结构 
 * @author Jerry Wang
 *
 * @param <T>
 */
public class ArrayTree<T> implements Tree<T> {
	
	private final int DEFAULT_SIZE = 2;
	private int size = 0;
	private int count = 0;
	private Object[] nodes = null;
	
	public ArrayTree() {
		this.size = this.DEFAULT_SIZE;
		this.nodes = new Object[this.size];
		this.count = 0;
	}
	
	public ArrayTree(Node<T> root) {  
        this();  
        this.count = 1;  
        this.nodes[0] = root;  
    }  

	public ArrayTree(Node<T> root, int size) {
		this.size = size;
		this.nodes = new Object[this.size];
		this.count = 1;
		this.nodes[0] = root;
	}
	
	public void enlarge() {
		System.out.println("enlarge...");
		this.size = this.size + this.DEFAULT_SIZE;
		Object[] newNodes = new Object[this.size];
		newNodes = Arrays.copyOf(nodes, this.size);
		Arrays.fill(nodes, null);
		this.nodes = newNodes;
	}
	
	public void check() {
		if (this.count >= this.size) {
			this.enlarge();
		}
	}

	@Override
	public void add(Node<T> node) {
		for(int i = 0; i < this.size; i++) {
			if(this.nodes[i] == null) {
				nodes[i] = node;
				break;
			}
		}
		this.count++;
	}

	@Override
	public void add(Node<T> node, Node<T> parent) {
		this.check();
		node.setParent(this.position(parent));
		this.add(node);
		
	}

	@Override
	public int position(Node<T> node) {
		for(int i = 0; i < this.size; i++) {
			if(nodes[i] == node) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int getSize() {
		return this.count;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Node<T> getRoot() {
		return (Node<T>) this.nodes[0];
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Node<T>> getAllNodes() {
		List<Node<T>> list = new ArrayList<Node<T>>();
		for(int i = 0; i < this.size; i++) {
			if(this.nodes[i] != null) {
				list.add((Node<T>) nodes[i]);
			}
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int getDepth() {
		int max = 1;
		if(this.nodes[0] == null) {
			return 0;
		}
		
		for(int i = 0; i < this.count; i++) {
			int deep = 1;
			int location = ((Node<T>)(this.nodes[i])).getParent();
			while(location != -1 && this.nodes[location] != null) {
				location = ((Node<T>)(this.nodes[location])).getParent();
				deep++;
			}
			if(max < deep)
				max = deep;
		}
		return max;
	}

	
}
