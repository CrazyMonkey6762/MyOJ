package cn.Fan.main2500_2600;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-23
 * @Describe
 */
public class Main2546 {

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n <= 0) {
				break;
			}
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			int left = scan.nextInt();

			Arrays.sort(arr);
			int d[] = new int[left + 3];

			if (left >= 5) {
				for (int i =0; i < arr.length-1; i++) {
					for (int j = left-5; j >= arr[i]; j--) {
						if (d[j] < d[j - arr[i]] + arr[i])
							d[j] = d[j - arr[i]] + arr[i];
					}
				}
				left -= d[left-5];
				System.out.println(left - arr[n-1]);
			} else {
				System.out.println(left);
			}

		}
	}
}
