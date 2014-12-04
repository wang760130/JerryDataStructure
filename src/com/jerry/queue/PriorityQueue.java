package com.jerry.queue;

/**
 * 优先级队列
 * @author Jerry Wang
 *
 * @param <T>
 */
public class PriorityQueue {
	private long[] data = null;
	private int size = 0;
	private int capacity = 0;
	
	public PriorityQueue(int capacity) {
		data = new long[capacity];
		this.capacity = capacity;
	}
	
	/**
	 * 优先级队列的插入不是队尾,而是选择一个合适的按照某种顺序插入的
	 * 当队列长度为0时，如下
	 * 不为0时,将所有比要插入的数小的数据后移,这样大的数就在队列的头部了
	 */
	public void insert(long l) {
		int i = 0;
		if(size == 0) {
			data[0] = l;
		} else {
			for(i = size - 1; i >= 0; i++) {
				if(l < data[i]) {
					data[i+1] = data[i];
				} else {
					break;
				}
			}
			data[i+1] = l;
		}
		size++;
	}

	/**
	 * 移出的是数组最上端的数，这样减少数组元素的移动
	 */
	public long remove() {
		return data[--size];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public int size() {
		return size;
	}

}
