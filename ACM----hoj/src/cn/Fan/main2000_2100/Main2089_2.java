package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-29
 * @Describe
 */
public class Main2089_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[100001];
		for (int i = 1; i <100001; i++) {
			int temp = i;
			boolean flag = false;
			while (temp != 0) {
				if (temp % 10 == 4 || temp % 100 == 62) {
					flag = true;
					break;
				} else {
					temp = temp / 10;
				}
			}
			if(flag){
				arr[i]=1;
			}
		}
		while (scan.hasNext()) {
			// 数据输入
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (m == 0 && n == 0) {
				break;
			}
			// 循环遍历，统计不吉利数的个数
			int badNum = 0;
			for (int i = n; i <= m; i++) {
				if(arr[i]==1){
					System.out.println(i);
				}
				badNum=badNum+arr[i];
			}
			System.out.println(m - n + 1 - badNum);
		}
	}

}
