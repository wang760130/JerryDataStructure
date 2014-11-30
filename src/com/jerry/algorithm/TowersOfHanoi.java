package com.jerry.algorithm;
/**
 * 河内塔问题
 * @author Jerry Wang
 *
 */
public class TowersOfHanoi {
	public static void main(String[] args) {
		int n = 64;
		TowersOfHanoi hanoi = new TowersOfHanoi();
		hanoi.move(n,'A','B','C');
	}
	
	public void move(int n, char a, char b, char c) {
		if(n==1)
		    System.out.println("盘 " + n + " 由 " + a + " 移至 " + c);
		else {
			move(n - 1, a, c, b);
			System.out.println("盘 " + n + " 由 " + a + " 移至 " + c);
			move(n - 1, b, a, c);
		}
	}
}
