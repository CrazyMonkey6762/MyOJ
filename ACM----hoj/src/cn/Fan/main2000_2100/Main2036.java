package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-21
 * @Describe ����ε����
 */
public class Main2036 {
	
	public static double abbs(double s) {
		return s > 0 ? s : -s;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n >= 3 && n <= 100) {
				int x[] = new int[n];
				int y[] = new int[n];
				// ʵ�����ݵ�����
				for (int i = 0; i < n; i++) {
					x[i] = scan.nextInt();
					y[i] = scan.nextInt();
				}
				double s = 0;//�����
				for (int i = 0; i < n; i++) {
					if (i == n - 1) {
						s += (x[i] - x[0]) * (y[i] + y[0]) / 2.0;
					} else {
						s += (x[i] - x[i + 1]) * (y[i] + y[i + 1]) / 2.0;
					}
				}
				System.out.printf("%.1f", abbs(s));//
				System.out.println();
			}
		}
	}

}
