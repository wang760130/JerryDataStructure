package com.jerry.algorithm;

/**
 * 约瑟夫问题（Josephus Problem）
 * 
 * 说明： 据说着名犹太历史学家 Josephus有过以下的故事：在罗马人占领乔塔帕特后， 39
 * 个犹太人与Josephus及他的朋友躲到一个洞中，39个犹太人决定宁愿死也不要被敌人到，于是决定了一个自杀方式， 41个人排成一个圆圈，由第1个人
 * 开始报数，每报数到第3人该人就必须自杀，然后再由下一个重新报数，直到所有人都自杀身亡为止。 然而Josephus
 * 和他的朋友并不想遵从，Josephus要他的朋友先假装遵从， 他将朋友与自己安排在第16个与第31个位置，于是逃过了这场死亡游戏。
 * 
 * @author Jerry Wang
 * 
 */
public class Josephus {
	public static int[] arrayOfJosephus(int number, int per) {
		int[] man = new int[number];
		for (int count = 1, i = 0, pos = -1; count <= number; count++) {
			do {
				pos = (pos + 1) % number;// 环状处理
				if (man[pos] == 0)
					i++;
				if (i == per) {// 报数为3了
					i = 0;
					break;
				}
			} while (true);
			man[pos] = count;
		}
		return man;
	}

	public static void main(String[] args) {
		int[] man = Josephus.arrayOfJosephus(41, 3);
		int alive = 3;
		System.out.println("约琴夫排列：");
		for (int i = 0; i < 41; i++)
			System.out.print(man[i] + " ");
		System.out.println("\nL表示3个存活的人要放的位置：");
		for (int i = 0; i < 41; i++) {
			if (man[i] > (41 - alive))
				System.out.print("L");
			else
				System.out.print("D");
			if ((i + 1) % 5 == 0)
				System.out.print("  ");
		}
		System.out.println();
	}
}
