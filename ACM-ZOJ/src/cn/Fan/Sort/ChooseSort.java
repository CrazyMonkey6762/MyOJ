package cn.Fan.Sort;

import java.util.Arrays;

/**
 * @Title—°‘Ò≈≈–Ú
 * @author ∑∂Õ˛’Ò
 * @date 2014-6-11
 * @Describe
 */
public class ChooseSort {
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

		int arr[] = new int[] { 9, 8, 2, 4, 35, 1, 25 };
		chooseSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}










