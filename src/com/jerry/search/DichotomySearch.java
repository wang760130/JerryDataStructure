package com.jerry.search;

/**
 * 二分查找
 * @author Jerry Wang
 *
 */
public class DichotomySearch extends Search{

	@Override
	public int search(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int middle = (start + end) / 2;
			if(key < arr[middle]) 
				end = middle - 1;
			else if(key > arr[middle])
				start = middle + 1;
			else
				return middle;
		}
		return -1; 
	}
}
