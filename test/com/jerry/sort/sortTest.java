package com.jerry.sort;

import org.junit.Test;

public class sortTest {
	
	@Test
	public void sort() {
		int[] data = {49,38,65,97,76,13,27,49,78,34,12,64,1};
		
		Sort sort = new BubbleSort();
		
		sort.sort(data);
		
	}
}
