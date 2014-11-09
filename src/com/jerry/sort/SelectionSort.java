package com.jerry.sort;

/**
 * 选择排序
 * @author Jerry Wang
 *
 */
public class SelectionSort extends Sort{

	@Override
	public void sort(int[] data) {
		for(int i = 0; i < data.length; i++) {
			int lowIndex = i;
			for(int j = data.length - 1; j > i; j--) {
				if(data[j] < data[lowIndex]) 
					lowIndex = j;
			}
			super.swap(data, i, lowIndex);
		}
	}
	
}
