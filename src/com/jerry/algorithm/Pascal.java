package com.jerry.algorithm;

import java.awt.*;
import javax.swing.*;
/**
 * 巴斯卡（Pascal）三角形
 * @author Jerry Wang
 *
 */
public class Pascal extends JFrame {
	private static final long serialVersionUID = 1L;
	public Pascal() {
		setBackground(Color.white);
		setTitle("巴斯卡三角形");
		setSize(520, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.clearRect(0,0,getSize().width,getSize().height);
		g.setColor(Color.red);
		final int N = 12;
		int n, r, t;
		for(n = 0; n <= N; n++) {
			for(r = 0; r <= n; r++)
			g.drawString(" " + combi(n, r),(N-n)*20 + r * 40, n * 20 + 50);
		}
	}
	
	private long combi(int n, int r){
		int i;
		long p = 1;
		for(i = 1; i <= r; i++)
		p = p * (n-i+1) / i;
		return p;
	
	}
	
	public static void main(String args[]) {
		Pascal frm = new Pascal();
	}
}
