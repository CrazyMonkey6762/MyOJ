package cn.Fan.main1200_1300;

import java.util.Scanner;

/**
 * 1203
 * 
 * @2014-5-19下午03:16:26
 * @Author:范威振
 * @description
 */

public class Main1203 {
	private int cost;
	private double chance;
	public Main1203(int cost, double chance) {
		super();
		this.cost = cost;
		this.chance = chance;
	}
	private static double max(double a, double b) {
		return a > b ? a : b;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int sumMoney = scan.nextInt();
			int count = scan.nextInt();
			if (sumMoney == 0 && count == 0) {
				break;
			}
			Main1203 schoo[] = new Main1203[count];
			double f[] = new double[sumMoney+4];
			for (int i = 0; i < count; i++) {
				schoo[i] = new Main1203(scan.nextInt(), scan.nextDouble());
			}
			/*
			 * f[i]表示第i万美元最大可能性 f[i]=max{f[i],1-(1-f[i])*(1-chance[j])}
			 */
			for (int i = 0; i < schoo.length; i++) {
				for (int j =sumMoney; j>=schoo[i].cost; j--) {
						f[j]=max(f[j],1-(1-f[j-schoo[i].cost])*(1-schoo[i].chance));
				}
			}
			System.out.printf("%.1f",f[sumMoney]*100);
			System.out.println("%");
		}
	}
}
