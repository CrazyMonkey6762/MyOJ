package cn.Fan.Sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName_BirSearch-----采用二分法在一个非减数组里检索一个数据的位置（如果有多个，要都显示）
 * @author_Stone6762
 * @CreationTime_2014年11月19日 上午10:04:21
 * @Description_
 */
public class BirSearch {

	/**
	 * @Title_searchByBir二分法查找一个数据
	 * @Describe_
	 * @Author_Stone6762
	 * @param arr
	 * @param signs
	 * @return
	 */
	private static int searchByBir(int[] arr, int signs) {
		int low = 0;
		int high = arr.length - 1;
		int center = 0;
		while (high >= low) {
			center = (low + high) / 2;
			if (arr[center] == signs) {
				return center + 1;
			} else if (arr[center] > signs) {
				high = center - 1;
			} else {
				low = center + 1;
			}
			/*
			 * UML与java
			 */
		}
		return 0;
	}

	/**
	 * @Title_getStart
	 * @Describe_根据已经查找到的数据所在的位置_确定与该数据相等的数的起始位置
	 * @Author_Stone6762
	 * @param arr--总的数据
	 * @param index--已经查找到的数据的位置
	 * @return
	 */
	private static int getStart(int[] arr, int index) {
		index--;//--将数据所在的位置转换成数组的下标
		int signs=arr[index];
		
		while (index >= 0 && arr[index] == signs) {
			index--;
		}
		//因为起始减一，while第一次循环减一，减了二，加二，正好变成所在位置
		return index + 2;
	}

	/**
	 * @Title_getEnd
	 * @Describe_根据已经查找到的数据所在的位置_确定与该数据相等的数的起始位置
	 * @Author_Stone6762
	 * @param arr---总的数据
	 * @param index--已经查询到的数据的位置
	 * @return
	 */
	private static int getEnd(int[] arr, int index) {
		index--;
		int signs=arr[index];
		while (index < arr.length && arr[index] == signs) {
			index++;
		}
		//因为开始减一，while第一次加一，正好不用变化就已经是数据的位置了
		return index ;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = { 11, 22, 33, 33, 44, 55, 55, 77 };
		while (scan.hasNext()) {
			int signs = scan.nextInt();
			int index = searchByBir(arr, signs);
			if (index == 0) {
				System.out.println(Arrays.toString(arr));
				System.out.println("您要找的数据不存在");
			} else {
				System.out.println(Arrays.toString(arr));
				System.out.println("您要找的数据的位置为：");
				int start = getStart(arr, index);
				int end = getEnd(arr, index);
				for (int i = start; i <= end; i++) {
					System.out.println(i);
				}
			}
		}
	}
}
