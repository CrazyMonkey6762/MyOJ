package cn.Fan.main1700_1800;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-5-24
 * @Describe
 */
public class Main1789_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int testNumber = scan.nextInt();
			for (int l = 0; l < testNumber; l++) {
				int Number = scan.nextInt();
				int deadlines[] = new int[Number];
				int scores[] = new int[Number];
				for (int i = 0; i < deadlines.length; i++) {
					deadlines[i] = scan.nextInt();
				}
				for (int i = 0; i < scores.length; i++) {
					scores[i] = scan.nextInt();
				}
				// �������ʱ���������������ʱ����ͬ�����տ۵ķֽ�������
				int min = 0;
				for (int i = 0; i < deadlines.length - 1; i++) {
					min = i;
					for (int j = i + 1; j < deadlines.length; j++) {
						if (deadlines[j] < deadlines[min]
								|| (deadlines[j] == deadlines[min] && scores[j] > scores[min])) {
							min = j;
						}
					}
					int temp = deadlines[min];
					deadlines[min] = deadlines[i];
					deadlines[i] = temp;

					temp = scores[min];
					scores[min] = scores[i];
					scores[i] = temp;
				}
				
				
				
				
				int d[]=new int [Number+1];//��ʾ��i�����������ļ�ֵ
				for (int i = 1; i <=Number; i++) {
					
					for (int j = 0; j <deadlines.length; j++) {
						
					}
				}
				
				
			}
		}
	}
}