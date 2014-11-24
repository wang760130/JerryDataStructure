package com.jerry.graph;
/**
 * 单个图点的关系
 * @author Jerry Wang
 * @param <T>
 */
public class Arc<T> {
	private Node<T> start = null;
	private Node<T> end = null;
	private int degress = 0;
	public Arc(Node<T> start, Node<T> end) {
		this.start = start;
		this.end = end;
	}
	public Node<T> getStart() {
		return start;
	}
	public void setStart(Node<T> start) {
		this.start = start;
	}
	public Node<T> getEnd() {
		return end;
	}
	public void setEnd(Node<T> end) {
		this.end = end;
	}
	public int getDegress() {
		return degress;
	}
	public void setDegress(int degress) {
		this.degress = degress;
	}
	
}