package cn.Fan.main1200_1300;

import java.util.Scanner;
/**
 * 
 * @2014-5-21下午08:34:33
 * @Author:范威振
 * @description
 */
public class Main1260 {
	private static int min(int a, int b) {
		return a > b ? b : a;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();// 测试实例的个数
			for (int l = 0; l < count; l++) {
				int number = scan.nextInt();// 代表有多少人
				int Single[] = new int[number + 4];// 买一张票需要话费的时间
				int Two[] = new int[number + 4];// 买两相邻的票需要的时间
				int d[] = new int[number + 4];// 卖掉第i张票时的最小的时间
				// 1.接受这些数据
				for (int i = 1; i <= number; i++) {
					Single[i] = scan.nextInt();
				}
				for (int i = 2; i < number + 1; i++) {
					Two[i] = scan.nextInt();
				}
				// 2.对这些数据进行排序
				/**
				 * d[i]=min{d[i-1]+Single[i],d[i-2]+Two[i]}
				 */
				d[1] = Single[1];
				for (int i = 2; i <= number; i++) {
					d[i] = min(d[i - 1] + Single[i], d[i - 2] + Two[i]);
				}
				int HH = 8, MM = 0, SS = 0, signs = 0;
				SS = d[number] % 60;
				MM = d[number] / 60 % 60;
				HH = (8 + d[number] / 3600) % 12;
				signs = (8 + d[number] / 3600) / 12;// 判断经历过多少个 12 小时了
				System.out.printf("%02d", HH);
				System.out.printf(":%02d", MM);
				System.out.printf(":%02d", SS);
				if (signs % 2 == 0) {// 上午
					System.out.println(" am");
				} else {// 下午
					System.out.println(" pm");
				}
			}
		}
	}
}
