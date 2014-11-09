package com.jerry.sort;

/**
 * 排序通用接口
 * @author Jerry Wang
 *
 */
public abstract class Sort {
	 public abstract void sort(int[] data);
	 
	 public static void swap(int[] data, int i, int j) {
		 int temp = data[i];
		 data[i] = data[j];
		 data[j] = temp;
	 }
}
