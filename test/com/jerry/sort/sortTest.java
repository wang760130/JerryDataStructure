package com.jerry.sort;

import org.junit.Test;

public class sortTest {
	
	@Test
	public void sort() {
		int[] data = {49,38,65,97,76,13,27,49,78,34,12,64,1};
		
		Sort sort = new HeapSort();
		
		sort.sort(data);
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			if(i != data.length - 1)
				System.out.print("->");
		}
	}
}
