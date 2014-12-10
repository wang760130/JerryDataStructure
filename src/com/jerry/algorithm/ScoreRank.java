package com.jerry.algorithm;

/**
 * 得分排行
 * @author Jerry Wang
 * 
 */
public class ScoreRank {
	public static void getScoreRank(int[] score) {
		final int MAX = 100;
		int[] rank = new int[MAX+2];
		int length = score.length;
		for (int i = 0; i < length; i++)
			rank[score[i]]++;

		rank[MAX + 1] = 1;
		for (int i = MAX; i >= 0; i--)
			rank[i] = rank[i] + rank[i + 1];
		System.out.println("得分\t排行");
		for (int i = 0; i < length; i++) {
			System.out.println(score[i] + "\t" + rank[score[i] + 1]);
		}
		
	}
	public static void main(String[] args)  {
		int[] score = new int[] {0,40,30,80,88,70,30,45,2,34,100,99};
		ScoreRank.getScoreRank(score);
	}
}
