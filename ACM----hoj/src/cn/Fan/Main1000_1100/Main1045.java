package cn.Fan.Main1000_1100;

import java.util.Scanner;
/**
 * 
 * @2014-5-15下午07:20:38
 * @Author:Fan
 * @description
 */
public class Main1045 {
	private int x;
	private int y;
	private int values;

	public Main1045(int x, int y, int values) {
		super();
		this.x = x;
		this.y = y;
		this.values = values;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int N = scan.nextInt();
			if (N <= 0) {
				break;
			}
			// 接受这些数据并把数据处理掉
			String temp[] = new String[N + 4];// 接受字符串
			int arr[][] = new int[N + 2][N + 2];//存放每一个点的权值
			int maxSum = 0;// 最多能放的碉堡的个数
			Main1045 Dis[] = new Main1045[N * N];// 每一个点的对象
			for (int i = 0; i < N; i++) {//接受给定的地形图
				temp[i] = scan.next();
			}
			// 找到每一个点的权值，并生成每一个点的对象
			for (int i = 1; i <= N; i++) {// 行
				for (int j = 1; j <= N; j++) {// 列
					Dis[(i - 1) * N + j - 1] = new Main1045(j - 1, i - 1, 0);
					if (temp[i - 1].charAt(j - 1) == 'X') {
						arr[i][j] = -50;
						arr[i + 1][j]++;
						arr[i - 1][j]++;
						arr[i][j + 1]++;
						arr[i][j - 1]++;
					}
				}
			}
			// 把权值放到点的里面
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					Dis[(i - 1) * N + j - 1].values = arr[i][j];
				}
			}
			
			// 开始放碉堡
			for (;;) {
				// 判断是不是还有点的可以放碉堡
				boolean flag = true;
				for (int j = 0; j < Dis.length; j++) {
					if (Dis[j].values >= 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					break;
				}
				int max = 0;//找到权值最大的点
				for (int j =Dis.length-1; j>=0; j--) {
					if (Dis[j].values > Dis[max].values) {
						max = j;
					}
				}
				maxSum++;//把该碉堡能“看到的位置都pass掉”
				int s1, s2, t1, t2;
				s1 = s2 = t1 = t2 = 0;
				int x = Dis[max].x;
				int y = Dis[max].y;
				// 右边
				for (int j = x; j < N && temp[y].charAt(j) != 'X'; j++) {
					Dis[max + s1].values = -6;
					s1++;
				}
				// 左边
				for (int j = x; j >= 0 && temp[y].charAt(j) != 'X'; j--) {
					Dis[max - s2].values = -6;
					s2++;
				}
				// 上边
				for (int j = y; j >= 0 && temp[j].charAt(x) != 'X'; j--) {
					Dis[max - t1 * N].values = -6;
					t1++;
				}
				// 下边
				for (int j = y; j < N && temp[j].charAt(x) != 'X'; j++) {
					Dis[max + t2 * N].values = -6;
					t2++;
				}
			}
			System.out.println(maxSum);
		}
	}
}