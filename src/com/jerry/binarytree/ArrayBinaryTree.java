package com.jerry.binarytree;


/**
 * 数组实现二叉树
 * @author Jerry Wang
 *
 */
public class ArrayBinaryTree<T> implements BinaryTree<T>{
	
	private Object[] datas = null;
	/**
	 * 保存树的深度，默认为8  
	 */
	private int DEFAULT_DEEP = 8;
	private int deep = 0;
	private int arraySize = 0;
	
	public void init() {
		this.arraySize = (int)(Math.pow(2, deep) - 1);
		this.datas = new Object[this.arraySize];
	}
	
	/**
	 * 默认的深度  
	 */
	public ArrayBinaryTree() {
		this.deep = this.DEFAULT_DEEP;
		this.init();
	}
	
	/**
	 * 指定深度
	 * @param deep
	 */
	public ArrayBinaryTree(int deep) {
		this.deep = deep;
		this.init();
	}
	
	/**
	 * 指定深度和根节点  
	 * @param deep
	 * @param data
	 */
	public ArrayBinaryTree(int deep, T data) {
		this.deep = deep;
		this.init();
		this.datas[0] = data;
	}
	
	
	@Override
	public void add(int index, T data, boolean left) {
		if(this.datas[index] == null) {
			throw new RuntimeException(index + "节点为空");
		}
		
		if(2 * index + 1 >= this.arraySize) {
			throw new RuntimeException("树底层已满");
		}
		
		if(left) {
			this.datas[2 * index + 1] = data;
		} else {
			this.datas[2 * index + 2] = data;
		}
		
	}

	@Override
	public boolean isEmpty() {
		return this.datas[0] == null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getRoot() {
		 if(this.isEmpty()) {
			 return (T)this.datas[0];
		 }
		 return null;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public T getParent(int index) {
		if(index >= 0 && index < this.arraySize) {
			return (T)this.datas[index / 2 - 1];
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getLeft(int index) {
		if(2 * index + 1 >= this.arraySize) {
			throw new RuntimeException("该节点为叶子节点，无子节点");
		}
		return (T) this.datas[2 * index + 1];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getRight(int index) {
		if(2 * index + 2 >= this.arraySize) {
			throw new RuntimeException("该节点为叶子节点，无子节点");
		}
		return (T) this.datas[2 * index + 2];
	}

	@Override
	public int deep() {
		return this.deep;
	}

	@Override
	public int position(T data) {
		for(int i = 0; i < this.arraySize; i++) {
			if(this.datas[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return java.util.Arrays.toString(this.datas);
	}

	@Override
	public void preOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postOrder() {
		// TODO Auto-generated method stub
		
	}
	
}
