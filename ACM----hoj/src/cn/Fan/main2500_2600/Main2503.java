package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 * 
 * @2014-5-12����01:33:32
 * @Author:Fan
 * @description
 */

public class Main2503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int number = scan.nextInt();
			for (int p = 0; p < number; p++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int signs = (a > b) ? b : a;// �ҵ����ӷ�ĸ�е���Сֵ
				// �ҷ��ӷ�ĸ�����Լ��
				for (int i = signs; i >= 1; i--) {
					if (a % i == 0 && b % i == 0) {
						a = a / i;
						b = b / i;
						break;
					}
				}
				int c = scan.nextInt();
				int d = scan.nextInt();
				signs = (c > d) ? d : c;// �ҵ����ӷ�ĸ�е���Сֵ
				// �ҷ��ӷ�ĸ�����Լ��
				for (int i = signs; i >= 1; i--) {
					if (c % i == 0 && d % i == 0) {
						d = d / i;
						c = c / i;
						break;
					}
				}
				int m = a * d + b * c;// ����
				int n = b * d;// ��ĸ
				signs = (m > n) ? n : m;// �ҵ����ӷ�ĸ�е���Сֵ
				// �ҷ��ӷ�ĸ�����Լ��
				for (int i = signs; i >= 1; i--) {
					if (m % i == 0 && n % i == 0) {
						m = m / i;
						n = n / i;
						break;
					}
				}
				System.out.println(m + " " + n);
			}
		}
	}

}
