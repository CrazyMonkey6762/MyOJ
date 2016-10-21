package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-23
 * @Describe
 */
public class Main2602 {

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int T = scan.nextInt();
			for (int n = 0; n < T; n++) {
				int number = scan.nextInt();
				int room = scan.nextInt();
				int values[] = new int[number + 3];
				int cost[] = new int[number + 3];
				int f[] = new int[room + 1];

				for (int j = 1; j <= number; j++) {
					values[j] = scan.nextInt();
				}
				for (int j = 1; j <= number; j++) {
					cost[j] = scan.nextInt();
				}
				for (int i = 1; i <= number; i++)
					for (int j = room; j >= cost[i]; j--) {
						f[j] = max(f[j], f[j - cost[i]] + values[i]);
					}

				System.out.println(f[room]);

			}
		}
	}

}
