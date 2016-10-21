package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 * 
 * @2014-5-17ÉÏÎç09:40:49
 * @Author:·¶ÍşÕñ
 * @description
 */

public class Main2563 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int [21];
		arr[1]=3;arr[2]=7;
		for (int i =3; i < arr.length; i++) {
			arr[i]=2*arr[i-1]+arr[i-2];
		}
		while(scan.hasNext()){
			int count =scan.nextInt();
			for (int i = 0; i <count; i++) {
				int t=scan.nextInt();
				System.out.println(arr[t]);
			}
		}
	}

}
