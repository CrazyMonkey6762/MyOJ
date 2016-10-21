
package cn.Fan.Sort;

import java.util.Arrays;

/**
 * @title希尔排序
 * @2014-6-10上午10:38:20
 * @Author:范威振
 * @description
 */

public class ShellSort {

	/**
	 *@description希尔排序
	 *把整个数组分成很多个快，每次减少快的长度，从第i个开始，每k个是一组  
	 *比如当    块的长度为  4 时，起始如果是1 那么  
	 *    1  5   9   13   17.。肯定是一组
	 *同理    2  6   10  14   18.。。肯定是一组
	 *其他组也一样，	
	 *
	 *然后进行      组内    类直接插入排序，对每一组都处理
	 *然后再减少块的长度每次折半，
	 *优点：
	 *减少循环的次数，在一开始的时候就把很多大的数据分到了后面，把小的数据分到了前面，
	 *以达到在块的长度很小的时候需要移动的次数很少了
	 *
	 */
	private static void shellSort(int[] arr) {
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int temp = arr[i];
				int j = 0;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
					arr[j] = arr[j - gap];
				}
				arr[j] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = new int[] { 20, 15, 25, 39, 1, -8, 4, 7, 6, 0, -1, 99 };
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
