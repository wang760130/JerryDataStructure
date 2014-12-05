package com.jerry.tree;

/**
 * 二叉树
 * @author Jerry Wang
 *
 */
public class BinTree<T> {
	public final static int MAX = 40;
	BinTree<T>[] elements = new BinTree[MAX];
	
	int front = 0;
	int tail = 0;
	
	private T data = null;
	private BinTree<T> left = null;
	private BinTree<T> right = null;
	
	public BinTree() {
		
	}
	
	public BinTree(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public BinTree(T data, BinTree<T> left, BinTree<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public String toString() {
		return data.toString();
	}
	
	/**
	 * 前序遍历二叉树
	 * @param parent
	 */
	public void preOrder(BinTree<?> parent) {
		if(parent == null)
			return ;
		System.out.print(parent.data + " ");
		preOrder(parent.left);
		preOrder(parent.right);
	}
	
	/**
	 * 中序遍历
	 * @param parent
	 */
	public void inOrder(BinTree<?> parent) {
		if(parent == null)
			return ;
		inOrder(parent.left);
		System.out.print(parent.data + " ");
		inOrder(parent.right);
	}
	
	/**
	 * 后序遍历
	 * @param parent
	 */
	public void postOrder(BinTree<?> parent) {
		if(parent == null)
			return;
		postOrder(parent.left);
		postOrder(parent.right);
		System.out.print(parent.data + " ");
	}
	
	/**
	 * 层次遍历二叉树
	 * @param parent
	 */
	public void LayerOrder(BinTree<T> parent) {
		elements[0] = parent;
		front = 0;
		tail = 1;
		while(front < tail) {
			try {
				if(elements[front].data != null) {
					System.out.print(elements[front].data + " ");
					if(elements[front].left != null) 
						elements[tail++] = elements[front].left;
					if(elements[front].right != null) 
						elements[tail] = elements[front].right;
					front++;
				}
			} catch (Exception e) {
				break;
			}
			
		}
	}
	
	/**
	 * 返回树的叶节点个数
	 * @return
	 */
	public int leaves() {
		if(left == null && right == null) 
			return 1;
		return (left == null ? 0 : left.leaves()) + (right == null ? 0 : right.leaves());
	}
	
	/**
	 * 结果返回树的高度
	 * @return
	 */
	public int height() {
		int height;
		int leftHeight = (left == null ? 0 :left.height());
		int rightHeight = (right == null ? 0 : right.height());
		height = leftHeight < rightHeight ? rightHeight : leftHeight;
		return 1 + height;
	}
	
	/**
	 * 如果对象不在树中,结果返回-1;否则结果返回该对象在树中所处的层次,规定根节点为第一层
	 * @param object
	 * @return
	 */
	public int level(Object object) {
		int level = 0;
		if(object == data) 
			return 1;
		int leftLevel = (left == null ? -1 : left.level(object));
		int rightLevel = (right == null ? -1 : right.level(object));
		if(leftLevel < 0 && rightLevel < 0)
			return -1;
		level = leftLevel < rightLevel ? rightLevel : leftLevel;
		return 1 + level;
		
	}
	
	/**
	 * 将树中的每个节点的孩子对换位置
	 */
	public void reflect() {
		if(left != null)
			left.reflect();
		if(right != null)
			right.reflect();
		BinTree<T> temp = left;
		left = right;
		right = temp;
	}
	
	/**
	 * 将树中的所有节点移走,并输出移走的节点
	 */
	public void defoliate() {
		// 若本节点是叶节点，则将其移走
		if(left == null && right == null) {
			System.out.print(this + " ");
			data = null;
			return;
		}
		
		// 移走左子树若其存在
		if(left != null) {
			left.defoliate();
			left = null;
		}
		
		data = null;
		
		if(right != null) {
			right.defoliate();
			right = null;
		}
	}
} 
