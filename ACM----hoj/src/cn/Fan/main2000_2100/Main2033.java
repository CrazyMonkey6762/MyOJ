package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-20
 * @Describe ����ʱ�����
 */
public class Main2033 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int N = scan.nextInt();
			if (N > 0) {
				// ʵ�����ݵ����룬���Ѻ͵Ľ������A ��
				for (int i = 0; i < N; i++) {
					int AH = scan.nextInt();
					int AM = scan.nextInt();
					int AS = scan.nextInt();
					int BH = scan.nextInt();
					int BM = scan.nextInt();
					int BS = scan.nextInt();
					AH += BH;
					AM += BM;
					AS += BS;
					if (AS >= 60) {
						AS %= 60;
						AM++;
					}
					if (AM >= 60) {
						AM %= 60;
						AH++;
					}
					// ֻҪ��� �����ڣ�0~59��֮�䣬ûҪ��Сʱ�����Բ��ô���Ҳ���ܴ���
					System.out.println(AH + " " + AM + " " + AS);
				}
				// ���
			}
		}
	}

}
