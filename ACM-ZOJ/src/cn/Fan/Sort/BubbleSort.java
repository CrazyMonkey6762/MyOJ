package cn.Fan.Sort;

import java.util.Arrays;

/**
 * @Title√∞≈›≈≈–Ú
 * @author ∑∂Õ˛’Ò
 * @date 2014-6-11
 * @Describe
 */
public class BubbleSort {

	private static void bubbleSort(int[] arr) {
		boolean flage = true;
		for (int i = 0; flage && i < arr.length - 1; i++) {
			flage = false;
			for (int j = 0;  j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flage = true;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 9, 8, 2, 4, 35, 1, 25 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
