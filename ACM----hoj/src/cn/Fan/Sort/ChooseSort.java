package cn.Fan.Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Title—°‘Ò≈≈–Ú
 * @author ∑∂Õ˛’Ò
 * @date 2014-6-11
 * @Describe
 */
public class ChooseSort {

	private static <T> void chooseSort(T[] arr, Comparator<? super T> cmp) {
		for (int i = 0; i < arr.length - 1; i++) {
			int tempIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (cmp.compare(arr[j], arr[tempIndex]) > 0) {
					tempIndex = j;
				}
			}
			T temp = arr[i];
			arr[i] = arr[tempIndex];
			arr[tempIndex] = temp;
		}
	}

	public static void main(String[] args) {
		Integer arr[] = { 9, 8, 2, 4, 35, 1, 25 };
		chooseSort(arr, new FirstMax());
		chooseSort(arr, new FirstMin());

		System.out.println(Arrays.toString(arr));
	}

}
