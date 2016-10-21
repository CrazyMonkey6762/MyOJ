package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-5-24
 * @Describe
 */
public class Main1087 {

	private static int max(int i, int j) {
		return i > j ? i : j;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();
			if (count <= 0) {
				break;
			}
			int arr[] = new int[count];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			int d[] = new int[count + 2];//表示第i个棋子为最后一个时的最大值
			int max = 0;
			for (int i = 0; i <arr.length; i++) {
				d[i] = arr[i];
				for (int j = i - 1; j >= 0; j--) {
					if (arr[j] < arr[i]) {
						d[i] = max(d[j] + arr[i], d[i]);
					}
				}
				max = max(max, d[i]);
			}
			System.out.println(max);
		}
	}

}
