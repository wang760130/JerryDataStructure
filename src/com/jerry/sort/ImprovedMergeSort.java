package com.jerry.sort;

/**
 * 增强型归并排序
 * @author Jerry Wang
 *
 */
public class ImprovedMergeSort extends Sort{
	
	private static final int THRESHOLD = 10;
	
	@Override
	public void sort(int[] data) {
		int[] temp = new int[data.length];
		this.mergeSort(data, temp, 0, data.length - 1);
	}
	
	private void mergeSort(int[] data, int[] temp, int l, int r) {
		int i, j, k;
		int mid = (l + r) / 2;
		if (l == r)
			return;
		if ((mid - l) >= THRESHOLD)
			mergeSort(data, temp, l, mid);
		else
			insertSort(data, l, mid - l + 1);
		if ((r - mid) > THRESHOLD)
			mergeSort(data, temp, mid + 1, r);
		else
			insertSort(data, mid + 1, r - mid);

		for (i = l; i <= mid; i++) {
			temp[i] = data[i];
		}
		for (j = 1; j <= r - mid; j++) {
			temp[r - j + 1] = data[j + mid];
		}
		int a = temp[l];
		int b = temp[r];
		for (i = l, j = r, k = l; k <= r; k++) {
			if (a < b) {
				data[k] = temp[i++];
				a = temp[i];
			} else {
				data[k] = temp[j--];
				b = temp[j];
			}
		}
	}
	
	private void insertSort(int[] data, int start, int len) {
		for(int i = start + 1; i < start + len; i++) {
			for(int j = i; (j > start) && data[j] < data[j - 1]; j--) {
				super.swap(data, j, j - 1);
			}
		}
	}
}
