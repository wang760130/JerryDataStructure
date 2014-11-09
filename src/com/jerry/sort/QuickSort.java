package com.jerry.sort;

/**
 * 快速排序
 * @author Jerry Wang
 *
 */
public class QuickSort extends Sort{

	@Override
	public void sort(int[] data) {
		quickSort(data, 0, data.length - 1);
	}
	
	private void quickSort(int[] data, int i, int j) {
		int pivatIndex = (i + j) / 2;
		super.swap(data, pivatIndex, j);
		int k = this.partition(data, i - 1, j, data[j]);
		super.swap(data, k, j);
		if((k - i) > 1)
			quickSort(data, i, k - 1);
		if((j - k) > 1)
			quickSort(data, k + 1, j);
		
	}
	
	
	private int partition(int[] data, int l, int r, int pivot) {
		do{
			while(data[++l] < pivot);
			while((r != 0) && data[--r] > pivot);
			super.swap(data, l, r);
		}while(l < r);
		super.swap(data, l, r);
		return l;
	}
}
