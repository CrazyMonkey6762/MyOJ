package cn.stone.Math;

import java.util.Scanner;

/**
 * @ClassName_Main1067
 * @author_Stone6762
 * @CreationTime_2015��1��24�� ����9:44:07
 * @Description_ ���Ƕ������¾��� 1/1 1/2 1/3 1/2 1/1 1/2 1/3 1/2 1/1
 *               ����Խ����ϵ�Ԫ��ʼ����1/1���Խ������߷����ķ�ĸ��������� ��������������ܺ͡�
 */
public class Main1067 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			double result = n;
			for (int i = n; i >= 2; i--) {
				double t = 2*(n + 1 - i) / (i * 1.00);
				result += t;
			}
			System.out.printf("%.2f\n", result);
		}
	}
}
