package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-21
 * @Describe �� A^B �Ľ���������λ
 */
public class Main2035 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			if (A >= 1 && A <= 10000 && B >= 1 && B <= 10000) {
				int sum = 1;
				A = A % 1000;
				for (int i = 0; i < B; i++) {
					sum = (sum * A) % 1000;
				}
				System.out.println(sum);
			}
		}

	}
}
