package com.jerry.sort;

/**
 * 希尔排序
 * @author Jerry Wang
 *
 */
public class ShellSort extends Sort{

	@Override
	public void sort(int[] data) {
		for(int i = data.length / 2; i>2; i/=2) {
			for(int j = 0; j < i; j++)
				this.insertSort(data, j, i);
		}
	}
	
	private void insertSort(int[] data, int start, int inc) {
		for(int i = start + inc; i < data.length; i+=inc) {
			for(int j = i; (j >= inc) && (data[j] < data[j - inc]); j-=inc) {
				super.swap(data, j, j-inc);
			}
		}
	}
}
