package com.jerry.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 最大访客数
 * 说明：
 * 现将举行一个餐会，让访客事先填写到达时间与离开时间，为了掌握座位的数目，必须先估计不同时间的最大访客数。
 * 解法：
 * 这个题目看似有些复杂，其实相当简单，单就计算访客数这个目的，同时考虑同一访客的来访时间与离开时间，反而会使程式变得复杂；
 * 只要将来访时间与离开时间分开处理就可以了，假设访客 i 的来访时间为x[i]，而离开时间为y[i]。
 * 在资料输入完毕之后，将x[i]与y[i]分别进行排序（由小到大），道理很简单，
 * 只要先计算某时之前总共来访了多少访客，然后再减去某时之前的离开访客，就可以轻易的解出这个问题
 * @author Jerry Wang
 *
 */
public class MaxVisit {
	public int maxGuest(int[] x, int[] y, int time) {
		int num = 0;
		for(int i = 0; i < x.length; i++) {
			if(time > x[i]) 
				num++;
			if(time > y[i])
				num--;
		}
		return num;
	}
	
	public void getMaxVisit(List<String> list) {
		int[] x = new int[list.size()];
		int[] y = new int[list.size()];
		for(int i = 0; i < x.length; i++) {
			String input = list.get(i);
			String[] strs = input.split(" ");
			x[i] = Integer.parseInt(strs[0]);
			y[i] = Integer.parseInt(strs[1]);
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		for(int time = 0; time < 24; time++) 
			System.out.println(time + " 时的最大访客数：" + this.maxGuest(x, y, time));
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1 13");
		list.add("2 14");
		list.add("12 14");
		list.add("12 14");
		list.add("12 14");
		list.add("12 14");
		list.add("12 14");
		list.add("12 14");
		MaxVisit maxVisit = new MaxVisit();
		maxVisit.getMaxVisit(list);
	}
}
