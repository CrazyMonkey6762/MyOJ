package cn.stone.Math;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Title_Main1068_3.java
 * @author_Stone6762
 * @CreationTime_2015年1月25日 下午12:59:35
 * @Description
 */
public class Main1068_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int arr[] = new int[n + m];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			System.out.print(arr[0]);
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] != arr[i - 1]) {
					System.out.print(" " + arr[i]);
				}
			}
			System.out.println();
		}
	}
}
