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
	
	public static void main(String[] args) {
		Search search = new DichotomySearch();
		int[] arr = new int[] { 12, 23, 34, 45, 56, 67, 77, 89, 90 };
		System.out.println(search.search(arr, 12));
		System.out.println(search.search(arr, 45));
		System.out.println(search.search(arr, 67));
		System.out.println(search.search(arr, 89));
		System.out.println(search.search(arr, 99));
	}
}
