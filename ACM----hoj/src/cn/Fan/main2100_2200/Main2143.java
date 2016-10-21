package cn.Fan.main2100_2200;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-6-7
 * @Describe
 */
public class Main2143 {
	private static long Max(long a, long b, long c) {
		long max = a > b ? a : b;
		return max > c ? max : c;
	}

	private static long Min(long a, long b, long c) {
		long min = a > b ? b : a;
		return min > c ? c : min;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = scan.nextLong();
			long max = Max(a, b, c);
			if (a + b + c == 2 * max) {
				System.out.println("oh,lucky!");
				continue;
			}
			if (a * b * c == max * max) {
				System.out.println("oh,lucky!");
				continue;
			}
			long min=Min(a, b, c);
			long mid=a+b+c-max-min;
			if (mid==min||(mid!=0&&max%mid==min)) {
				System.out.println("oh,lucky!");
				continue;
			}
			System.out.println("what a pity!");
		}
	}
}
