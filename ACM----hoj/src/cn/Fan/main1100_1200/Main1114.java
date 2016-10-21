package cn.Fan.main1100_1200;

import java.util.Scanner;

/**
 * 
 * @2014-5-19下午12:14:39
 * @Author:范威振
 * @description
 */

public class Main1114 {
	private int values;
	private int weight;

	public Main1114(int values, int weight) {
		super();
		this.values = values;
		this.weight = weight;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();
			for (int m = 0; m < count; m++) {
				int b = scan.nextInt();
				int a = scan.nextInt();
				int sumWeight = a - b;// 确定钱币的总量
				int N = scan.nextInt();// 钱币的种类数
				Main1114 money[] = new Main1114[N];
				int f[] = new int[sumWeight + 3];// i克质量的最小钱币值
				// 因为要装满，所有除了f[0]=0,其他的都让其等于一个较大的值，如果出现不可能装到的重量的情况，可以判断
				for (int i = 1; i < f.length; i++) {
					f[i] = 1000000000;
				}

				// 1.接收钱的各种类型
				for (int i = 0; i < N; i++) {
					money[i] = new Main1114(scan.nextInt(), scan.nextInt());
				}
				/*
				 * f[i]=min{f[i],f[i-weight[i]+values[i]}
				 */
				// 2.循环，遍历每一种钱。
				for (int i = 0; i < N; i++) {
					/*
					 * 用每一种钱币的情况
					 * 分别确定每一克的最小钱币数
					 */
					for (int j = money[i].weight; j <= sumWeight; j++) {
						f[j]=(f[j]>f[j-money[i].weight]+money[i].values)?(f[j-money[i].weight]+money[i].values):f[j];
					}
				}
				if (f[sumWeight] == 1000000000){
					System.out.println("This is impossible.");					
				}
				else{				
					System.out.println("The minimum amount of money in the piggy-bank is "+f[sumWeight]+".");
				}
			}
		}
	}
}
