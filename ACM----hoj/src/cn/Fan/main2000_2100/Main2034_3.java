package cn.Fan.main2000_2100;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-5-5
 * @Describe
 */
public class Main2034_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (m == 0 && n == 0) {
				break;
			}
			double A[] = new double[n];
			boolean sihnsA[] = new boolean[n];
			double B[] = new double[m];
			// 数据的输入
			for (int i = 0; i < n; i++) {
				A[i] = scan.nextDouble();
			}
			for (int i = 0; i < B.length; i++) {
				B[i] = scan.nextDouble();
			}

			// 遍历，外层是B中的元素的遍历，内层的A中的元素的判断，标记A中和B中相同的元素的下标
			int count = 0;// 标记A中与B中相同的元素的个数
			for (int i = 0; i < B.length; i++) {
				for (int j = 0; j < A.length; j++) {
					if (B[i] == A[j]) {
						count++;
						sihnsA[j] = true;
						break;
					}
				}
			}

			if (count == n) {
				System.out.println("NULL");
			} else {
				Arrays.sort(A);
				for (int i = 0; i < A.length; i++) {
					if (!sihnsA[i]) {
						System.out.print(A[i] + " ");
					}
				}
			}

		}
	}

}
