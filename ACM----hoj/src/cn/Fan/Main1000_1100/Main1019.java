package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-6-6
 * @Describe
 */
public class Main1019 {
	private static int Max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int test = scan.nextInt();
			for (int l = 0; l < test; l++) {
				int m = scan.nextInt();
				int arr[] = new int[m];
				int max = 0;
				for (int i = 0; i < arr.length; i++) {
					arr[i] = scan.nextInt();
					max=Max(max,arr[i]);
				}
				for (int i = max;; i+=max) {
					boolean flage=true;
					for (int j = 0; j < arr.length; j++) {
						if(i%arr[j]!=0){
							flage=false;
							break;
						}
					}
					if(flage){
						System.out.println(i);
						break;
					}
				}
			}
		}
	}
}
