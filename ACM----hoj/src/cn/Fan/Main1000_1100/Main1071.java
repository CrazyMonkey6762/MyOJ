package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-5-25
 * @Describe 
 * ��Ϊp2 p3�� y ������ȣ����Բ����������������
 * 
 *  ��Ϊp1����ߵ㣬���Բ�����������غϵ���� 
 *  ���ֻ�����������غϣ�P1��P3�����ߣ�p1��p2��
 *  
 *������غϣ�����һ�������� Ҳ������p1��p2�����������p1��p3�����̣��������
 * �����P1��P3���غϣ�ֻ���ã�p1 p2�������
 *  �����p1 p2���غϣ�ֻ���ã�P1 P3�����
 *   y1=aX1^2+bX1+c
 *    y2=aX2^2+bX2+c 
 *    ����Ϊ X1=-b/��2*a��; 
 *    �������ó���һ����ʽ���������̣�����δ֪�����ɽ�
 *    ������ϵ�������֮�󣬾�ֱ���Ǽ򵥵�΢���ֵ�������
 * 
 */
public class Main1071 {

	
	/**
	 * @Title:ģ�¶�Ԫһ�η��̵�΢��
	 * @Describe 
	 * @date 2014-5-25
	 * @param aϵ��
	 * @param bϵ��
	 * @param cϵ��
	 * @param x1����
	 * @param x2����
	 * @return ���ֵĽ��
	 * @param args
	 */
	private static double Result(double a, double b, double c, double x1,
			double x2) {

		double result = (a * x1 * x1 * x1 / 3 + b * x1 * x1 / 2 + c * x1)
				- (a * x2 * x2 * x2 / 3 + b * x2 * x2 / 2 + c * x2);
		return abbs(result);

	}

	private static double abbs(double a) {
		return a > 0 ? a : -a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int t = scan.nextInt();
			for (int ln = 0; ln < t; ln++) {
				double x[] = new double[4];
				double y[] = new double[4];
				for (int i = 1; i <= 3; i++) {
					x[i] = scan.nextDouble();
					y[i] = scan.nextDouble();
				}
				double yy1 = y[1] - y[2];
				double yy2 = y[1] - y[3];

				double xx1 = x[1] - x[2];
				double xxx1 = x[2] - x[1];

				double xx2 = x[1] - x[3];
				double xxx2 = x[3] - x[1];
				double a = yy1 / (xx1 * xxx1);// �����ģ�û���غϵ����
				if (x[1] == x[3]) {// ���p3��p1�غ�
					a = yy1 / (xx1 * xxx1);
				}
				if (x[1] == x[2]) {// ���p2��p1�غ�
					a = yy2 / (xx2 * xxx2);
				}
				double b = -2 * x[1] * a;
				double c = y[1] - a * x[1] * x[1] - b * x[1];
				double sum = Result(a, b, c, x[2], x[3]);// �����µ��������
				double tixing = abbs(x[2] - x[3]) * (y[2] + y[3]) / 2;// ����ٳ��������ε����
				double rr = abbs(sum - tixing);// ����ɵ�
				System.out.printf("%.2f", rr);
				System.out.println();
			}
		}
	}
}
