package cn.Fan.main2100_2200;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-6-7
 * @Describe
 */
public class Main2148 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int test = scan.nextInt();
			while (test-- != 0) {
				int sum = scan.nextInt();
				int index = scan.nextInt();
				int arr[] = new int[sum + 1];
				for (int i = 1; i < arr.length; i++) {
					arr[i] = scan.nextInt();
				}
				int signs = arr[index];
				int max = 0;
				for (int i = 1; i < arr.length; i++) {
					if (arr[i] > signs) {
						max++;
					} else {
						break;
					}
				}
				System.out.println(max);
			}
		}
	}
}
