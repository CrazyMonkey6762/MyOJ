package cn.Fan.Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Title√∞≈›≈≈–Ú
 * @author ∑∂Õ˛’Ò
 * @date 2014-6-11
 * @Describe
 */
public class BubbleSort {

	private static <T> void bubbleSort(T[] arr, Comparator<? super T> cmp) {
		boolean flage = true;
		for (int i = 0; flage && i < arr.length - 1; i++) {
			flage = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (cmp.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flage = true;
				}
			}
		}
	}

	private static void bubbleSort(double[] arr) {
		boolean flage = true;
		for (int i = 0; flage && i < arr.length - 1; i++) {
			flage = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flage = true;
				}
			}
		}
	}

	public static void main(String[] args) {

		Integer arr[] = { 9, 8, 2, 4, 35, 1, 25 };
		bubbleSort(arr,new FirstMax());
		System.out.println(Arrays.toString(arr));
		
	}
}
