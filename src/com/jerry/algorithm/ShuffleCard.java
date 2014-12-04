package com.jerry.algorithm;

/**
 * 洗扑克牌（乱数排列）
 * 说明：
 * 洗扑克牌的原理其实与乱数排列是相同的，都是将一组数字（例如1～N）打乱重新排列，只不过洗扑克牌多了一个花色判断的动作而已。
 * 解法：
 * 初学者通常会直接想到，随机产生1～N的乱数并将之存入阵列中，后来产生的乱数存入阵列前必须先检查阵列中是否已有重复的数字，
 * 如果有这个数就不存入，再重新产生下一个数，运气不好的话，重复的次数就会很多，程式的执行速度就很慢了，这不是一个好方法。
 * 以1～52的乱数排列为例好了，可以将阵列先依序由1到52填入，然后使用一个回圈走访阵列，并随机产生1～52的乱数，
 * 将产生的乱数当作索引取出阵列值，并与目前阵列走访到的值相交换，如此就不用担心乱数重复的问题了，阵列走访完毕后，所有的数字也就重新排列了。
 * 至于如何判断花色？这只是除法的问题而已，取商数判断花色，取余数判断数字，您可以直接看程式比较清楚。
 * @author Jerry Wang
 *
 */
public class ShuffleCard {
	public static void shuffle() {
		final int N = 52;
		int[] poker = new int[N + 1];
		// 初始化阵列
		for(int i = 1; i <= N; i++)
			poker[i] = i;
		// 洗牌
		for(int i = 1; i <= N; i++) {
			int j = (int) (Math.random() * N);
			if(j == 0)
				j = 1;
			int tmp = poker[i];
			poker[i] = poker[j];
			poker[j] = tmp;
		}
		for(int i = 1; i <= N; i++) {
			// 判断花色
			switch((poker[i]-1) / 13) {
				case 0:System.out.print("桃"); break;
				case 1:System.out.print("心"); break;
				case 2:System.out.print("砖"); break;
				case 3:System.out.print("梅"); break;
			}             
			// 扑克牌数字
			int remain = poker[i] % 13;
			switch(remain) {
				case 0:System.out.print("K "); break;
				case 12:System.out.print("Q "); break;
				case 11:System.out.print("J "); break;
				default:System.out.print(remain + " ");break;
			}
			if(i % 13 == 0)
			   System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		ShuffleCard.shuffle();
	}
}
