package com.jerry.sort;

/**
 * 插入排序
 * @author Jerry Wang
 *
 */
public class InsertSort extends Sort{

	@Override
	public void sort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			for (int j = i; (j > 0) && (data[j] < data[j-1]); j--) {
				super.swap(data, j, j - 1);
				super.display(data);
			}
		}
	}

}
