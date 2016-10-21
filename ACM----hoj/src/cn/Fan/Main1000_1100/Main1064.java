package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-6-6
 * @Describe
 */
public class Main1064 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double sum = 0;
			for (int i = 0; i < 12; i++) {
				sum += scan.nextDouble();
			}
			System.out.printf("$%.2f", sum / 12);
			System.out.println();
		}
	}
}
