package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 * 
 * @2014-5-19ÏÂÎç08:57:35
 * @Author:·¶ÍşÕñ
 * @description
 */

public class Main2550 {
	private int length;
	private int number;

	public Main2550(int length, int number) {
		super();
		this.length = length;
		this.number = number;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();
			for (int k = 0; k < count; k++) {
				int N = scan.nextInt();

				Main2550[] jian = new Main2550[N];
				for (int i = 0; i < jian.length; i++) {
					jian[i] = new Main2550(scan.nextInt(), scan.nextInt());
				}
				int min = 0;
				for (int i = 0; i < jian.length - 1; i++) {
					min = i;
					for (int j = i; j < jian.length; j++) {
						if (jian[j].length < jian[min].length) {
							min = j;
						}
					}
					Main2550 temp = jian[min];
					jian[min] = jian[i];
					jian[i] = temp;
				}
				for (int m = 0; m < N; m++) {
					int length = jian[m].length;
					int number = jian[m].number;
					String str = ">+";
					for (int i = 0; i <= length - 3; i++) {
						str += "-";
					}
					str += "+>";
					for (int i = 0; i < number; i++) {
						System.out.println(str);
					}
					System.out.println();
				}
			}
		}
	}
}
