package com.jerry.list.util;

import org.junit.Test;

import com.jerry.list.LinkedList;
import com.jerry.list.utils.LinkedListUtil;

public class LinkedListUtilTest {
	
	@Test
	public void mergeListTest() {
		LinkedList<Integer> listA  = new LinkedList<Integer>();
		listA.add(1);
		listA.add(5);
		listA.add(9);
		listA.display();
		
		LinkedList<Integer> listB  = new LinkedList<Integer>();
		listB.add(3);
		listB.add(7);
		listB.display();
		
		LinkedList<Integer> list = LinkedListUtil.mergeList(listA, listB);
		list.display();
	}
}
