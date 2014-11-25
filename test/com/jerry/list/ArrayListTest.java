package com.jerry.list;

import org.junit.Before;
import org.junit.Test;

/**
 * 数组实现链表测试类
 * @author Jerry Wang
 *
 */
public class ArrayListTest {
	
	private List<String> list = null;
	
	@Before
	public void init() {
		list = new ArrayList<String>(2);
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
//		list.add("f");
//		list.add("g");
//		list.add("h");
//		list.add("i");
//		list.add("j");
//		list.add("k");
//		list.add("l");
//		list.add("m");
//		list.add("n");
//		list.add("o");
//		list.add("p");
//		list.add("q");
	}
	
	@Test
	public void testDisplay() {
		list.display();
	}
	
	@Test
	public void testSize() {
		System.out.println(list.size());
	}
	
}
