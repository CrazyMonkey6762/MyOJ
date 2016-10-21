package cn.Fan.main1100_1200;

import java.util.Scanner;

/**
 * 
 * @2014-5-19����12:14:39
 * @Author:������
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
				int sumWeight = a - b;// ȷ��Ǯ�ҵ�����
				int N = scan.nextInt();// Ǯ�ҵ�������
				Main1114 money[] = new Main1114[N];
				int f[] = new int[sumWeight + 3];// i����������СǮ��ֵ
				// ��ΪҪװ�������г���f[0]=0,�����Ķ��������һ���ϴ��ֵ��������ֲ�����װ��������������������ж�
				for (int i = 1; i < f.length; i++) {
					f[i] = 1000000000;
				}

				// 1.����Ǯ�ĸ�������
				for (int i = 0; i < N; i++) {
					money[i] = new Main1114(scan.nextInt(), scan.nextInt());
				}
				/*
				 * f[i]=min{f[i],f[i-weight[i]+values[i]}
				 */
				// 2.ѭ��������ÿһ��Ǯ��
				for (int i = 0; i < N; i++) {
					/*
					 * ��ÿһ��Ǯ�ҵ����
					 * �ֱ�ȷ��ÿһ�˵���СǮ����
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
