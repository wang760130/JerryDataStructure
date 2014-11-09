package com.jerry.list;


import org.junit.Test;

public class SingleLinkedListTest {
	@Test
	public void singleLinkedListTest() {
		List<Integer> list =  new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.display();
		list.set(1, 1);
		list.display();
	}
}
