package cn.Fan.main2000_2100;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Title:
 * @author ������
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
			// ���ݵ�����
			for (int i = 0; i < n; i++) {
				A[i] = scan.nextDouble();
			}
			for (int i = 0; i < B.length; i++) {
				B[i] = scan.nextDouble();
			}

			// �����������B�е�Ԫ�صı������ڲ��A�е�Ԫ�ص��жϣ����A�к�B����ͬ��Ԫ�ص��±�
			int count = 0;// ���A����B����ͬ��Ԫ�صĸ���
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
