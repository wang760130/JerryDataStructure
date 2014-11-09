package com.jerry.sort;

/**
 * 归并排序
 * @author Jerry Wang
 *
 */
public class MergeSort extends Sort{

	@Override
	public void sort(int[] data) {
		int[] temp = new int[data.length];
		this.mergeSort(data, temp, 0, data.length - 1);
	}
	
	
	private void mergeSort(int[] data, int[] temp, int l, int r) {
		int mid = (l + r) / 2;
		if(l == r) return;
		this.mergeSort(data, temp, l, mid);
		this.mergeSort(data, temp, mid+1, r);
		
		for(int i = l; i <= r; i++) {
			temp[i] = data[i];
		}
		
		int i1 = l;
		int i2 = mid + 1;
		
		for(int cur = l; cur <= r; cur++) {
			if(i1 == mid + 1)
				data[cur] = temp[i2++];
			else if(i2 > r)
				data[cur] = temp[i1++];
			else if(temp[i1] < temp[i2])
				data[cur] = temp[i1++];
			else
				data[cur] = temp[i2++];
		}
	}
}
