package cn.Fan.main1100_1200;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-20
 * @Describe
 */
public class Main1108 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int min = a > b ? b : a;
			int max = a > b ? a : b;
			int sum = a * b;
			int r = max % min;
			while (r != 0) {
				max = min;
				min = r;
				r = max % min;
			}
			System.out.println(sum / min);
		}
	}
}
