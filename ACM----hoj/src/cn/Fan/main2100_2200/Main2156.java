package cn.Fan.main2100_2200;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-6-7
 * @Describe
 */
public class Main2156 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n <= 0) {
				break;
			}
			double result = n;
			for (int i = n - 1; i > 0; i--) {
				result += 2 * i * (1.00 / (n + 1 - i));
			}
			System.out.printf("%.2f", result);
			System.out.println();
		}
	}
}
