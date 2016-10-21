package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @Title_Main1010.java
 * @author_Stone6762
 * @CreationTime_2014年10月16日 下午2:50:14
 * @Description
 */
public class Main1010 {
	private static char arr[][];
	private static int ex;
	private static int sx;
	private static int ey;
	private static int sy;

	/**
	 * @Title_isCanAcssess
	 * @Describe_
	 * @Author_Stone6762
	 * @param sum
	 * @return
	 */
	private static boolean isCanAcssess(int sum) {
		if (sum < 0) {
			return false;
		}
		// 上
		if (ex - 1 >= 0 && (arr[ex][ey] != 'X' && arr[ex][ey] != '#')) {
			ex--;
			arr[ex][ey] = '#';
			if (sum == 1 && arr[ex][ey] == 'D') {
				return true;
			} else {
				if (isCanAcssess(sum - 1)) {
					return true;
				}
			}
		}
		// 下
		if (ex + 1 < arr.length && (arr[ex][ey] != 'X' && arr[ex][ey] != '#')) {
			ex++;
			arr[ex][ey] = '#';
			if (sum == 1 && arr[ex][ey] == 'D') {
				return true;
			} else {
				if (isCanAcssess(sum - 1)) {
					return true;
				}
			}
		}
		// 左
		if (ey - 1 >= 0 && (arr[ex][ey] != 'X' && arr[ex][ey] != '#')) {
			ey--;
			arr[ex][ey] = '#';
			if (sum == 1 && arr[ex][ey] == 'D') {
				return true;
			} else {
				if (isCanAcssess(sum - 1)) {
					return true;
				}
			}
		}

		// 右
		if (ey + 1 < arr[0].length && (arr[ex][ey] != 'X' && arr[ex][ey] != '#')) {
			ey++;
			arr[ex][ey] = '#';
			if (sum == 1 && arr[ex][ey] == 'D') {
				return true;
			} else {
				if (isCanAcssess(sum - 1)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int r = scan.nextInt();
			int w = scan.nextInt();
			int sum = scan.nextInt();
			if (r == 0 && w == 0 && sum == 0) {
				break;
			}
			arr = new char[r][w];
			// 初始化数据
			for (int i = 0; i < r; i++) {
				arr[i] = scan.next().toCharArray();
			}
			// 找到起始坐标
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] == 'S') {
						ex = i;
						ey = j;
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();

			}

			// 遍历
			boolean flage = isCanAcssess(sum);
			if (flage) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
