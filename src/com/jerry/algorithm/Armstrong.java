package com.jerry.algorithm;

/**
 * 阿姆斯壮数
 * 在三位的整数中，例如153可以满足13 + 53 + 33 = 153，这样的数称之为Armstrong数，
 * @author Jerry Wang
 *
 */
public class Armstrong {
	public static void main(String[] args) {
		System.out.println("寻找Armstrong数：");
		for (int i = 100; i <= 999; i++) {
			int a = i / 100;
			int b = (i % 100) / 10;
			int c = i % 10;
			if (a * a * a + b * b * b + c * c * c == i)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}