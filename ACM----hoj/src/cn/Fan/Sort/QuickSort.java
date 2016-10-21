package cn.Fan.Sort;

import java.util.Arrays;

/**
 * @title快排
 * @2014-6-10下午12:18:23
 * @Author:范威振
 * @description
 */
public class QuickSort {

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	/**
	 * @Author:范威振
	 * @description求一个区间中心的元素值并将中心元素放到末尾的前一个
	 */
	private static int midIndex(int[] arr, int left, int right) {
		/**
		 * 首先将中心元素，左边端点，右边端点，三个点进行排序， 变成 左边 < 中心 < 右边
		 */
		int center = (left + right) / 2;
		if (arr[left] > arr[center]) {
			swap(arr, left, center);
		}
		if (arr[right] < arr[center]) {
			swap(arr, right, center);
		}
		if (arr[right] < arr[left]) {
			swap(arr, right, left);
		}
		/**
		 * 将中心元素放到右端点的前一个，然后对   left+1 和    right-2  内的所有的元素进行处理，处理排序 
		 */
		swap(arr, center, right - 1);
		
		return arr[right - 1];
	}

	/**
	 * @title实现一个简单的排序
	 * @description当分割后的区间长度小于三直接就用该排序的方法来排序
	 */
	private static void sort(int[] arr, int left, int right) {
		for (int p = left + 1; p <= right; p++) {
			int tmp = arr[p];
			int j;
			for (j = p; j > left && tmp - (arr[j - 1]) < 0; j--)
				arr[j] = arr[j - 1];
			arr[j] = tmp;
		}
	}

	/**
	 * @title快排
	 * @description具体的实现
	 */
	private static void quickSort(int[] arr, int left, int right) {
		if (left + 3 <= right) {
			/**
			 * 用区间长度的大小来判断是否有必要进行下去 如果区间长度小于等于三， 直接就可以排序个序就完事了 如果区间的长度大于三，再来去用快排
			 */
			// 中间值，用来当做标准来判断某一个元素应该放在中间值的左边还是右边
			int center = midIndex(arr, left, right);
			int leftFinal = left;
			int rightFinal = right - 1;
			for (;;) {
				/**
				 * 1、在中间值的右区间内寻找一个比中间值小的值 
				 * 2、在中间值的左区间内寻找一个比中间值大的值
				 * 3、交换两个值
				 */
				while (arr[++leftFinal] - center < 0) {
				}
				while (arr[--rightFinal] - center > 0) {
				}
				// 判断一下两边的游标是否已经发生重合，如果没有，则直接把右区间的“小”数，跟左区间的“大”值，交换
				if (leftFinal < rightFinal) {
					swap(arr, leftFinal, rightFinal);
				} else {
				// 如果左游标和右游标发生重合，则说明该区间已经完成了排序，就没有必要再继续下去了，直接跳出完事
					break;
				}
			}
			/**
			 * 在把该区间内的元素都完成排序后，再将中心元素从后面整回来
			 */
			swap(arr, leftFinal, right - 1);

			// 中间值的左区间递归本方法
			quickSort(arr, left, leftFinal - 1);
			// 中间值的右区间递归本方法
			quickSort(arr, leftFinal, right);

		} else {
			// 如果区间长度小于等于三，就直接排序，就完事
			sort(arr, left, right);
		}

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 20, 15, 25, 39, 1, -8, 4, 7, 6, 0, -1, 99 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

		
	}

	
	
	
	
	
	
	
}











