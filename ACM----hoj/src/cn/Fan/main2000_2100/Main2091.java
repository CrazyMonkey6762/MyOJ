package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-29
 * @Describe:	��ӡ���ĵ�ͼ��
 */
public class Main2091 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		while (scan.hasNext()) {
			char sign = scan.next().charAt(0);
			if (sign == '@') {
				break;
			}
			if(count>0){
				System.out.println();
			}
			int n = scan.nextInt();
			// ѭ���ж�ÿһ�У�Ȼ�����
			for (int i = 1; i <= n; i++) {
				/*
				 * ��������֪�����˵�һ�к����һ�У�������ֻ���������������ո���Ӵ��ı�Ե���� �����жϵ�һ�� n-i
				 * ��ָÿһ��һ��ʼ��n-i���ո񣬵�n-i+1��Ӧ��������
				 * 
				 * Ȼ���ǵڶ��� ����ÿһ�ж��� ������n-i���ո�Ȼ����2 * i - 1����ǣ������ǵ�n-i+2 * i - 1������
				 */

				// �ж�ÿһ�е�ÿһ��Ӧ�����ʲô
				for (int j = 1; j <= n - i + 2 * i - 1; j++) {
					if (j == n - i + 1 || j == n - i + 2 * i - 1 || i == n) {
						System.out.print(sign);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			count++;
		}
	}

}
