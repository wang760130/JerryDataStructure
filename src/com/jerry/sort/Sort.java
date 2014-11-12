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
	 
	 public static void display(int[] data) {
		 for(int i = 0; i < data.length; i++) {
			 System.out.print(data[i]);
			 if(i != data.length - 1) {
				 System.out.print("->");
			 }
		 }
		 System.out.println();
	 }
}
