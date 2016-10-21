package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1050
 * @author_Stone6762
 * @CreationTime_2015��1��24�� ����8:54:02
 * @Description_ ����һ�����֣�������ǰ����������еġ�5�������ɿո���ô�͵õ�һ���ÿո�ָ�����ɷǸ�����
 *               ��������Щ�����ԡ�0����ͷ����Щͷ���ġ�0��Ӧ�ñ����Ե�����������������������ɸ���0����ɵģ���ʱ�����������0����
 *               ��������ǣ�����Щ�ָ�õ�������������С�����˳�����������
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
