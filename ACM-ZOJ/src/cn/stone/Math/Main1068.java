package cn.stone.Math;

import java.util.Scanner;

/**
 * @ClassName_Main1068
 * @author_Stone6762
 * @CreationTime_2015年1月24日 下午9:57:33
 * @Description_ 给你两个集合，要求{A} + {B}。 注:同一个集合中不会有两个相同的元素。
 */
public class Main1068 {

	private static void chooseSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int arrA[] = new int[n];
			int arrB[] = new int[m];
			for (int i = 0; i < n; i++) {
				arrA[i] = scan.nextInt();
			}
			for (int i = 0; i < m; i++) {
				arrB[i] = scan.nextInt();
			}
			chooseSort(arrA);
			chooseSort(arrB);

			int i = 0, j = 0;
			while (i < n && j < m) {
				int a = arrA[i];
				int b = arrB[j];
				if (a == b) {
					System.out.print(b + " ");
					j++;
					i++;
				} else if (b > a) {
					System.out.print(a + " ");
					i++;
				} else {
					System.out.print(b + " ");
					j++;
				}
				if (i >= n) {
					while (j < m - 1) {
						System.out.print(arrB[j] + " ");
						j++;
					}
					System.out.print(arrB[j]);
					break;
				}
				if (j >= m) {
					while (i < n - 1) {
						System.out.print(arrA[i] + " ");
						i++;
					}
					System.out.print(arrA[i]);
					break;
				}
			}
			System.out.println();

		}
	}
}