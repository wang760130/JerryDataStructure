package com.jerry.tree;

import java.util.List;

/**
 * 树通用接口
 * @author Jerry Wang
 *
 */
public interface Tree<T> {
	
	/**
	 * 添加一个节点  
	 * @param node
	 */
	public void add(Node<T> node);
	
	/**
	 * 添加一个节点，并指明父节点
	 * @param node
	 * @param parent
	 */
	public void add(Node<T> node, Node<T> parent);
	
	/**
	 * 获取节点在数组的存储位置 
	 * @param node
	 * @return
	 */
	public int position(Node<T> node);
	
	/**
	 * 获取整棵树有多少节点 
	 * @return
	 */
	public int getSize();
	
	/**
	 * 获取根节点 
	 * @return
	 */
	public Node<T> getRoot();
	
	/**
	 * 获取所以节点，以List形式返回
	 * @return
	 */
	public List<Node<T>> getAllNodes();
	
	/**
	 * 获取树的深度，只有根节点时为1
	 * @return
	 */
	public int getDepth();
	
	
}
