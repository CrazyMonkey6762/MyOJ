package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-5-25
 * @Describe 
 * 因为p2 p3的 y 可能相等，所以不能用他们两个相减
 * 
 *  因为p1是最高点，所以不会存在三点重合的情况 
 *  最多只能是两个点重合（P1，P3）或者（p1，p2）
 *  
 *如果不重合，用哪一个都可以 也就是用p1和p2相减，或者用p1和p3（方程）相减都行
 * 如果（P1，P3）重合，只能用（p1 p2）相减，
 *  如果（p1 p2）重合，只能用（P1 P3）相减
 *   y1=aX1^2+bX1+c
 *    y2=aX2^2+bX2+c 
 *    又因为 X1=-b/（2*a）; 
 *    结合上面得出的一个公式，两个方程，两个未知数，可解
 *    当所有系数求出来之后，就直接是简单的微积分的问题了
 * 
 */
public class Main1071 {

	
	/**
	 * @Title:模仿二元一次方程的微分
	 * @Describe 
	 * @date 2014-5-25
	 * @param a系数
	 * @param b系数
	 * @param c系数
	 * @param x1上限
	 * @param x2下线
	 * @return 积分的结果
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
				double a = yy1 / (xx1 * xxx1);// 正常的，没有重合的情况
				if (x[1] == x[3]) {// 如果p3和p1重合
					a = yy1 / (xx1 * xxx1);
				}
				if (x[1] == x[2]) {// 如果p2和p1重合
					a = yy2 / (xx2 * xxx2);
				}
				double b = -2 * x[1] * a;
				double c = y[1] - a * x[1] * x[1] - b * x[1];
				double sum = Result(a, b, c, x[2], x[3]);// 积分下的所有面积
				double tixing = abbs(x[2] - x[3]) * (y[2] + y[3]) / 2;// 下面抠出来的梯形的面积
				double rr = abbs(sum - tixing);// 相减可得
				System.out.printf("%.2f", rr);
				System.out.println();
			}
		}
	}
}
