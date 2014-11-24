package com.jerry.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 图的点
 * @author Jerry Wang
 *
 * @param <T>
 */
public class Node<T> {
	private List<Arc<T>> outgoing = null;
	private Object value = null;
	public Node (Object value) {
		this.value = value;
		outgoing = new ArrayList<Arc<T>>();
	}
	public List<Arc<T>> getOutgoing() {
		return outgoing;
	}
	public void setOutgoing(List<Arc<T>> outgoing) {
		this.outgoing = outgoing;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	
}