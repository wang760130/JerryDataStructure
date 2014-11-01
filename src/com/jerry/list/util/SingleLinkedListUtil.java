package com.jerry.list.util;

import com.jerry.list.SingleLinkedList;

/**
 * 单链表工具类
 * @author Jerry Wang
 * @param <T>
 *
 */

public class SingleLinkedListUtil {
	/**
	 * 两个单链表归并
	 * @author Jerry Wang
	 *
	 */
	public static SingleLinkedList<Integer> mergeList(SingleLinkedList<Integer> listA, SingleLinkedList<Integer> listB) {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		int i = 0;
		int j = 0;
		while(i < listA.size() && j < listB.size()) {
			Integer ta = listA.get(i);
			Integer tb = listB.get(j);
			if(ta <= tb) {
				list.add(ta);
				i++;
			} else {
				list.add(tb);
				j++;
			}
		}
		while(i < listA.size()) 
			list.add(listA.get(i++));
		
		while(j < listB.size()) 
			list.add(listB.get(j++));
		
		return list;
	}
}
