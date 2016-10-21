package cn.Fan.main1100_1200;

import java.util.Scanner;

/**
 * 
 * @2014-5-10上午09:31:10
 * @Author:Fan
 * @description
 */
public class Main1171 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int countNumber = scan.nextInt();// 这个是需要分的各种设备的个数
			if (countNumber <= 0) {
				break;
			}
			int vaule[] = new int[countNumber + 2];// 每种设备的价值
			int number[] = new int[countNumber + 3];// 每种设备的个数
			// 接收数据,并确定总的价值
			int maxNumber = 0;
			for (int i = 1; i <= countNumber; i++) {
				vaule[i] = scan.nextInt();
				number[i] = scan.nextInt();
				maxNumber += vaule[i] * number[i];
			}
			int result[] = new int[maxNumber + 2];// 某种价值的分法
			int temp[] = new int[maxNumber + 2];// 暂时保存合并括号时的系数
			// 初始化第一个括号内的各个项的系数
			for (int i = 0; i <= number[1] * vaule[1]; i = i + vaule[1]) {
				result[i] = 1;
			}
			// 开始合并大括号
			int signs = number[1] * vaule[1];
			for (int i = 2; i <= countNumber; i++) {// 大括号的个数
				for (int j = 0; j <= signs; j++) {
					for (int k = 0; k <= number[i] * vaule[i]; k = k + vaule[i]) {
						temp[j + k] += result[j];
					}
				}
				signs += vaule[i] * number[i];
				for (int j = 0; j <= signs; j++) {
					result[j] = temp[j];
					temp[j] = 0;
				}
			}
			for (int i = maxNumber / 2; i >= 0; i--)
				if (result[i]!=0) {
					System.out.println((maxNumber - i) + " " + i);
					break;
				}
		}
	}
}
