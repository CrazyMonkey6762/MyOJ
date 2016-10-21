package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-23
 * @Describe
 */
public class Main123 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int N=scan.nextInt();
			int result[]=new int [N+1];//记录每次合并后各项的系数
			int temp[]=new int [N+1];//作为中间变量来缓存合并的时候的系数
			//因为一开始的系数都是   1
			for (int i = 0; i < temp.length; i++) {
				result[i]=1;
			}
			for (int i =2; i <=N; i++) {//决定合并到了第几个括号
				for (int j = 0; j <=N; j++) {//这是决定合并到了某个括号内的第几项
					for (int k = 0; k+j<=N; k+=i) {//让前一个括号内的任意一项，都跟后一个括号内的所有项都相乘
						temp[j+k] += result[j];//因为相乘之后幂增加了，所以赋值给j+k项
					}
				}
				for (int j = 0; j < temp.length; j++) {//把合并一次后的结果赋值给result，并将中间的数组初始化
					result[j]=temp[j];
					temp[j]=0;
				}	
			}
			System.out.println(result[N]);
		}
	}
}
