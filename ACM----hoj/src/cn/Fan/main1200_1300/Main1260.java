package cn.Fan.main1200_1300;

import java.util.Scanner;
/**
 * 
 * @2014-5-21����08:34:33
 * @Author:������
 * @description
 */
public class Main1260 {
	private static int min(int a, int b) {
		return a > b ? b : a;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();// ����ʵ���ĸ���
			for (int l = 0; l < count; l++) {
				int number = scan.nextInt();// �����ж�����
				int Single[] = new int[number + 4];// ��һ��Ʊ��Ҫ���ѵ�ʱ��
				int Two[] = new int[number + 4];// �������ڵ�Ʊ��Ҫ��ʱ��
				int d[] = new int[number + 4];// ������i��Ʊʱ����С��ʱ��
				// 1.������Щ����
				for (int i = 1; i <= number; i++) {
					Single[i] = scan.nextInt();
				}
				for (int i = 2; i < number + 1; i++) {
					Two[i] = scan.nextInt();
				}
				// 2.����Щ���ݽ�������
				/**
				 * d[i]=min{d[i-1]+Single[i],d[i-2]+Two[i]}
				 */
				d[1] = Single[1];
				for (int i = 2; i <= number; i++) {
					d[i] = min(d[i - 1] + Single[i], d[i - 2] + Two[i]);
				}
				int HH = 8, MM = 0, SS = 0, signs = 0;
				SS = d[number] % 60;
				MM = d[number] / 60 % 60;
				HH = (8 + d[number] / 3600) % 12;
				signs = (8 + d[number] / 3600) / 12;// �жϾ��������ٸ� 12 Сʱ��
				System.out.printf("%02d", HH);
				System.out.printf(":%02d", MM);
				System.out.printf(":%02d", SS);
				if (signs % 2 == 0) {// ����
					System.out.println(" am");
				} else {// ����
					System.out.println(" pm");
				}
			}
		}
	}
}
