package com.jerry.search;

import org.junit.Test;

public class SearchTest {
	@Test
	public void search() {
		Search search = new SequenceSearch();
		int[] arr = new int[] { 12, 23, 34, 45, 56, 67, 77, 89, 90 };
		System.out.println(search.search(arr, 12));
		System.out.println(search.search(arr, 45));
		System.out.println(search.search(arr, 67));
		System.out.println(search.search(arr, 89));
		System.out.println(search.search(arr, 99));
	}
}
