package cn.Fan.main1100_1200;

import java.util.Scanner;

/**
 * 
 * @2014-5-10����09:31:10
 * @Author:Fan
 * @description
 */
public class Main1171 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int countNumber = scan.nextInt();// �������Ҫ�ֵĸ����豸�ĸ���
			if (countNumber <= 0) {
				break;
			}
			int vaule[] = new int[countNumber + 2];// ÿ���豸�ļ�ֵ
			int number[] = new int[countNumber + 3];// ÿ���豸�ĸ���
			// ��������,��ȷ���ܵļ�ֵ
			int maxNumber = 0;
			for (int i = 1; i <= countNumber; i++) {
				vaule[i] = scan.nextInt();
				number[i] = scan.nextInt();
				maxNumber += vaule[i] * number[i];
			}
			int result[] = new int[maxNumber + 2];// ĳ�ּ�ֵ�ķַ�
			int temp[] = new int[maxNumber + 2];// ��ʱ����ϲ�����ʱ��ϵ��
			// ��ʼ����һ�������ڵĸ������ϵ��
			for (int i = 0; i <= number[1] * vaule[1]; i = i + vaule[1]) {
				result[i] = 1;
			}
			// ��ʼ�ϲ�������
			int signs = number[1] * vaule[1];
			for (int i = 2; i <= countNumber; i++) {// �����ŵĸ���
				for (int j = 0; j <= signs; j++) {
					for (int k = 0; k <= number[i] * vaule[i]; k = k + vaule[i]) {
						temp[j + k] += result[j];
					}
				}
				signs += vaule[i] * number[i];
				for (int j = 0; j <= signs; j++) {
					result[j] = temp[j];
					temp[j] = 0;
				}
			}
			for (int i = maxNumber / 2; i >= 0; i--)
				if (result[i]!=0) {
					System.out.println((maxNumber - i) + " " + i);
					break;
				}
		}
	}
}
