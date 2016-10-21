package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1050
 * @author_Stone6762
 * @CreationTime_2015年1月24日 下午8:54:02
 * @Description_ 输入一行数字，如果我们把这行数字中的‘5’都看成空格，那么就得到一行用空格分割的若干非负整数
 *               （可能有些整数以‘0’开头，这些头部的‘0’应该被忽略掉，除非这个整数就是由若干个‘0’组成的，这时这个整数就是0）。
 *               你的任务是：对这些分割得到的整数，依从小到大的顺序排序输出。
 */
public class Main1050 {

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

	private static String intArr2String( int[] arr) {
		String aim = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				aim += arr[i];
				continue;
			}
			aim += " "+ arr[i];
		}

		return aim;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next().replaceAll("5", " ").trim();
			String strs[] = str.split(" +");
			int arr[]=new int [strs.length];
			for (int i = 0; i < strs.length; i++) {
				arr[i]=Integer.valueOf(strs[i].trim());
			}
			chooseSort(arr);
			System.out.println(intArr2String(arr));
			
		}
	}

}
