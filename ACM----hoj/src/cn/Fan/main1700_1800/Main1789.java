package cn.Fan.main1700_1800;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-5-24
 * @Describe
 */
public class Main1789 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int testNumber = scan.nextInt();
			if (testNumber <= 0) {
				break;
			}
			for (int l = 0; l < testNumber; l++) {
				int Number = scan.nextInt();
				int deadlines[] = new int[Number];
				int scores[] = new int[Number];
				boolean signs[] = new boolean[12000];
				for (int i = 0; i < deadlines.length; i++) {
					deadlines[i] = scan.nextInt();
				}
				for (int i = 0; i < scores.length; i++) {
					scores[i] = scan.nextInt();
				}
				// �������ʱ���������������ʱ����ͬ�����տ۵ķֽ�������
				int max = 0;
				for (int i = 0; i < deadlines.length - 1; i++) {
					max = i;
					for (int j = i + 1; j < deadlines.length; j++) {
						if (scores[j] > scores[max]) {
							max = j;
						}
					}
					int temp = deadlines[max];
					deadlines[max] = deadlines[i];
					deadlines[i] = temp;
					temp = scores[max];
					scores[max] = scores[i];
					scores[i] = temp;
				}
				int lost = 0;// ʧȥ�ķ���
				for (int i = 0; i < scores.length; i++) {// ��ÿһ�ֿ��ǲ�������
					int temp = deadlines[i];// �ÿε����ʱ��
					while (signs[temp] && temp > 0) {
						temp--;
					}
					if (temp == 0) {
						lost += scores[i];
					} else {
						signs[temp] = true;
					}
				}
				System.out.println(lost);

			}
		}
	}
}
