package com.jerry.search;

/**
 * 顺序查找
 * @author Jerry Wang
 *
 */
public class SequenceSearch extends Search{

	@Override
	public int search(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}

}
