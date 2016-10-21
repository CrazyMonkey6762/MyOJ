package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 *
 *@2014-5-19ÏÂÎç09:14:12
 *@Author:·¶ÍşÕñ
 *@description
 */

public class Main2551 {

	public static void main(String[] args) {
		int arr[]=new int[10000];
		for (int i =1; i < arr.length; i++) {
			arr[i]=arr[i-1]+i*i*i;
		}
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();
			for (int i = 0; i <count; i++) {
				int signs=scan.nextInt();
				for (int j =1; j < arr.length; j++) {
					if(arr[j]>=signs){
						System.out.println(j);
						break;
					}
				}
				
			}
		}
	}
}
