package com.jerry.sort;

/**
 * 增强型快速排序
 * @author Jerry Wang
 *
 */
public class ImprovedQuickSort extends Sort {

	private static int MAX_STACK_SIZE = 4096;
	private static int THRESHOLD = 10;
	
	@Override
	public void sort(int[] data) {
		int[] stack = new int[MAX_STACK_SIZE];
		
		int top = 1;
		int pivot, pivotIndex, l, r;
		
		stack[++top] = 0;
		stack[++top] = data.length - 1;
		
		while(top > 0) {
			int j = stack[top--];
			int i = stack[top--];
			
			pivotIndex = (i + j) / 2;
			pivot = data[pivotIndex];
			
			super.swap(data, pivotIndex, j);
			
			l = i - 1;
			r = j;
			
			do{
				while(data[++l] < pivot);
				while((r != 0) && (data[--r] > pivot));
				super.swap(data, l, r);
			} while(l < r);
			
			super.swap(data, l, r);
			super.swap(data, l, j);
			
			if((l - i) > THRESHOLD) {
				stack[++top] = i;
				stack[++top] = l - 1;
			}
			
			if((j - l) > THRESHOLD) {
				stack[++top] = l + 1;
				stack[++top] = j;
			}
		}
		this.insertData(data);
	}
	
	private void insertData(int[] data) {
		for(int i = 1; i < data.length; i++) {
			for(int j = i; (j > 0) && (data[j] < data[j - 1]); j--) {
				super.swap(data, j, j - 1);
			}
		}
	}
}
