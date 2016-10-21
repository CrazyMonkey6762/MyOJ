package cn.Fan.Sort;

import java.util.Arrays;

/**
 * @Title÷±Ω”≤Â»Î≈≈–Ú
 * @author ∑∂Õ˛’Ò
 * @date 2014-6-11
 * @Describe
 */
public class InsertSort {
	
	/** 
	 * @Title_insertSort
	 * @Describe_
	 * @Author_Stone6762
	 * @param arr
	 */
	private static void insertSort(int[] arr) {
	
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
				} else {
					arr[j + 1] = temp;
					break;
				}
			}
			if (j <0) {
				arr[0] = temp;
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 9, 8, 2, 4, 35, 1, 25 };
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
