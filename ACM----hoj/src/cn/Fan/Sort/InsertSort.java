package cn.Fan.Sort;

import java.util.Arrays;
import java.util.Comparator;

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
			if (j < 0) {
				arr[0] = temp;
			}
		}

	}

	private static <T> void insertSort(T[] arr, Comparator<? super T> cmp) {

		for (int i = 1; i < arr.length; i++) {
			T temp = arr[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (cmp.compare(arr[j],temp)>0) {
					arr[j + 1] = arr[j];
				} else {
					arr[j + 1] = temp;
					break;
				}
			}
			if (j < 0) {
				arr[0] = temp;
			}
		}

	}

	public static void main(String[] args) {

		Integer arr[] = { 9, 8, 2, 4, 35, 1, 25 };
		insertSort(arr,new FirstMax());
		
		
		
		System.out.println(Arrays.toString(arr));
	}

}
