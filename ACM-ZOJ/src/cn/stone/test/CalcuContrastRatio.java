package cn.stone.test;

import java.util.Scanner;

/**
 * @ClassName_CalcuContrastRatio
 * @author_Stone6762
 * @CreationTime_2015��5��12�� ����4:29:17
 * @Description_��Աȶ�_���Ľ���Ϊ��
 */
public class CalcuContrastRatio {

	/**
	 * @Description:��һ�����ľ���ֵ
	 * @param aԭ�ȵ�ֵ
	 * @return ����ľ���ֵ
	 */
	public static double abbs(double a) {
		return a > 0 ? a : -a;
	}

	/**
	 * @Description: �ĸ��ǵ�
	 * @param i�к�
	 * @param j�к�
	 * @param arr
	 *            ����
	 * @return
	 */
	public static double count2Border(int i, int j, double arr[][]) {
		double rate = 1 / 2.0;
		double dist1 = 0, dist2 = 0;
		if (i == 0) {
			// ��һ�ж���һ�������µ�
			dist1 = abbs(arr[0][j] - arr[1][j]);
		} else {
			// ���һ�ж���һ�����ϵ�
			dist1 = abbs(arr[i][j] - arr[i - 1][j]);
		}
		if (j == 0) {
			// ��һ�ж���һ�������
			dist2 = abbs(arr[i][j] - arr[i][j + 1]);
		} else {
			// ���һ�ж���һ�����ҵ�
			dist2 = abbs(arr[i][j] - arr[i][j - 1]);
		}
		return (dist1 * dist1 + dist2 * dist2) * rate;
	}

	/**
	 * @Description: �߽��ȥ�ĸ��ǵ�
	 * @param i�к�
	 * @param j�к�
	 * @param arr
	 *            ����
	 * @return
	 */
	public static double count3Border(int i, int j, double arr[][]) {
		double rate = 1 / 3.0;
		double dist1 = 0;
		double dist2 = 0;
		double dist3 = 0;
		if (i == 0 || i == arr.length - 1) {
			// ��һ�к����һ�У����Ҷ��ֱ���һ��
			dist1 = abbs(arr[i][j] - arr[i][j - 1]);
			dist2 = abbs(arr[i][j] - arr[i][j + 1]);
			// �ֱ��ж��ǵ�һ�л������һ��
			if (i == 0) {
				dist3 = abbs(arr[i][j] - arr[i + 1][j]);
			} else {
				dist3 = abbs(arr[i][j] - arr[i - 1][j]);
			}
		} else {
			// ��һ�к����һ�����¶�����һ��
			dist1 = abbs(arr[i][j] - arr[i - 1][j]);
			dist2 = abbs(arr[i][j] - arr[i + 1][j]);
			// �ֱ��ж��ǵ�һ�л������һ��
			if (j == 0) {
				dist3 = abbs(arr[i][j] - arr[i][j + 1]);
			} else {
				dist3 = abbs(arr[i][j] - arr[i][j - 1]);
			}

		}
		return (dist1 * dist1 + dist2 * dist2 + dist3 * dist3) * rate;
	}

	/**
	 * @Description: ȥ���߽��
	 * @param i�к�
	 * @param j�к�
	 * @param arr
	 *            ����
	 * @return
	 */
	public static double count4Border(int i, int j, double arr[][]) {
		double rate = 1 / 4.0;
		double dist1 = 0;
		double dist2 = 0;
		double dist3 = 0;
		double dist4 = 0;
		// ֱ����������
		dist1 = abbs(arr[i][j] - arr[i - 1][j]);
		dist2 = abbs(arr[i][j] - arr[i + 1][j]);
		dist3 = abbs(arr[i][j] - arr[i][j - 1]);
		dist4 = abbs(arr[i][j] - arr[i][j + 1]);
		return (dist1 * dist1 + dist2 * dist2 + dist3 * dist3 + dist4 * dist4)
				* rate;
	}

	/**
	 * @Description: ����
	 * @param arr
	 * @return �Աȶ�
	 */
	public static double calContrast(double[][] arr) {
		double result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if ((i == 0 && (j == 0 || j == arr[0].length - 1))
				// �ĸ��ǵ�
						|| ((i == arr.length - 1) && (j == 0 || j == arr[0].length - 1))) {
					result += count2Border(i, j, arr);
				} else if (i == 0 || (i == arr.length - 1) || j == 0
						|| j == arr[0].length - 1) {
					// �߽��
					result += count3Border(i, j, arr);
				} else {
					// �м��
					result += count4Border(i, j, arr);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double arr[][] = new double[8][8];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scan.nextDouble();
			}
		}
		double result = calContrast(arr);
		System.out.println(result);
	}

}
