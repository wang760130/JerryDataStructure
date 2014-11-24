package com.jerry.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * 图
 * @author Jerry Wang
 *
 * @param <T>
 */
public class Graph<T> {
	/**
	 * 深度排序的方法
	 * 这个方法的方式：按一个节点，一直深入的找下去，直到它没有节点为止
	 * @param current
	 * @param visited
	 */
	public void deptFirstSearch(Node<T> current, List<Node<T>> visited) {
		// 被访问过了，就不访问，防止死循环
		if(visited.contains(current))
			return ;
		visited.add(current);
		System.out.println("这个遍历的是：" + current.getValue());
		for(int i = 0; i < current.getOutgoing().size(); i++) {
			// 访问本点的结束点
			this.deptFirstSearch(current.getOutgoing().get(i).getEnd(), visited);
		}
	}
	
	/**
	 * 广度排序的方法
	 * 这个方法的方式：按层次对图进行访问，先第一层，再第二层，依次类推
	 * @param start
	 */
	public void widthSearch(Node<T> start) {
		// 记录所有访问过的元素
		Set<Node<T>> visited = new HashSet<Node<T>>();
		// 用队列存放所有依次要访问元素
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		// 把当前的元素加入到队列尾
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			Node<T> current = queue.poll();
			if(!visited.add(current)) {
				visited.add(current);
				System.out.println("查找的节点是：" + current.getValue());
				for(int i = 0; i < current.getOutgoing().size(); i++) {
					// 把它的下一层，加入到队列中
					queue.offer(current.getOutgoing().get(i).getEnd());
				}
			}
		}
	}
}
