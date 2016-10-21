package cn.stone.test;

import java.util.Scanner;

/**
 * @ClassName_CalcuContrastRatio
 * @author_Stone6762
 * @CreationTime_2015年5月12日 下午4:29:17
 * @Description_求对比度_以四近邻为例
 */
public class CalcuContrastRatio {

	/**
	 * @Description:求一个数的绝对值
	 * @param a原先的值
	 * @return 求出的绝对值
	 */
	public static double abbs(double a) {
		return a > 0 ? a : -a;
	}

	/**
	 * @Description: 四个角的
	 * @param i行号
	 * @param j列号
	 * @param arr
	 *            数组
	 * @return
	 */
	public static double count2Border(int i, int j, double arr[][]) {
		double rate = 1 / 2.0;
		double dist1 = 0, dist2 = 0;
		if (i == 0) {
			// 第一行都有一个是向下的
			dist1 = abbs(arr[0][j] - arr[1][j]);
		} else {
			// 最后一行都有一个向上的
			dist1 = abbs(arr[i][j] - arr[i - 1][j]);
		}
		if (j == 0) {
			// 第一列都有一个向左的
			dist2 = abbs(arr[i][j] - arr[i][j + 1]);
		} else {
			// 最后一列都有一个向右的
			dist2 = abbs(arr[i][j] - arr[i][j - 1]);
		}
		return (dist1 * dist1 + dist2 * dist2) * rate;
	}

	/**
	 * @Description: 边界除去四个角的
	 * @param i行号
	 * @param j列号
	 * @param arr
	 *            数组
	 * @return
	 */
	public static double count3Border(int i, int j, double arr[][]) {
		double rate = 1 / 3.0;
		double dist1 = 0;
		double dist2 = 0;
		double dist3 = 0;
		if (i == 0 || i == arr.length - 1) {
			// 第一行和最后一行，左右都分别有一个
			dist1 = abbs(arr[i][j] - arr[i][j - 1]);
			dist2 = abbs(arr[i][j] - arr[i][j + 1]);
			// 分别判断是第一行还是最后一行
			if (i == 0) {
				dist3 = abbs(arr[i][j] - arr[i + 1][j]);
			} else {
				dist3 = abbs(arr[i][j] - arr[i - 1][j]);
			}
		} else {
			// 第一列和最后一列上下都各有一个
			dist1 = abbs(arr[i][j] - arr[i - 1][j]);
			dist2 = abbs(arr[i][j] - arr[i + 1][j]);
			// 分别判断是第一列还是最后一列
			if (j == 0) {
				dist3 = abbs(arr[i][j] - arr[i][j + 1]);
			} else {
				dist3 = abbs(arr[i][j] - arr[i][j - 1]);
			}

		}
		return (dist1 * dist1 + dist2 * dist2 + dist3 * dist3) * rate;
	}

	/**
	 * @Description: 去掉边界的
	 * @param i行号
	 * @param j列号
	 * @param arr
	 *            数组
	 * @return
	 */
	public static double count4Border(int i, int j, double arr[][]) {
		double rate = 1 / 4.0;
		double dist1 = 0;
		double dist2 = 0;
		double dist3 = 0;
		double dist4 = 0;
		// 直接上下左右
		dist1 = abbs(arr[i][j] - arr[i - 1][j]);
		dist2 = abbs(arr[i][j] - arr[i + 1][j]);
		dist3 = abbs(arr[i][j] - arr[i][j - 1]);
		dist4 = abbs(arr[i][j] - arr[i][j + 1]);
		return (dist1 * dist1 + dist2 * dist2 + dist3 * dist3 + dist4 * dist4)
				* rate;
	}

	/**
	 * @Description: 计算
	 * @param arr
	 * @return 对比度
	 */
	public static double calContrast(double[][] arr) {
		double result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if ((i == 0 && (j == 0 || j == arr[0].length - 1))
				// 四个角的
						|| ((i == arr.length - 1) && (j == 0 || j == arr[0].length - 1))) {
					result += count2Border(i, j, arr);
				} else if (i == 0 || (i == arr.length - 1) || j == 0
						|| j == arr[0].length - 1) {
					// 边界的
					result += count3Border(i, j, arr);
				} else {
					// 中间的
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
