package com.jerry.sort;

/**
 * 插入排序
 * @author Jerry Wang
 *
 */
public class BubbleSort extends Sort{

	@Override
	public void sort(int[] data) {
		for(int i = 0; i < data.length; i++) {
			for(int j = i+1; j <= data.length - 1; j++) {
				if(data[i] > data[j])
					super.swap(data, i, j);
			}
		}
	}

}
