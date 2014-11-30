package com.jerry.algorithm;

/**
 * 斐波那契数列
 * @author Jerry Wang
 * 
 */
public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci.fibonacci(20);
	}
	
	public static void fibonacci(int size) {
		int[] fib = new int[size];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++)
			fib[i] = fib[i - 1] + fib[i - 2];
		for (int i = 0; i < fib.length; i++)
			System.out.print(fib[i] + " ");
		System.out.println();
	}
}
