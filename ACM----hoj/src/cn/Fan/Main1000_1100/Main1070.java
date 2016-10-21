package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 *
 *@2014-5-16обнГ02:57:21
 *@Author:Fan
 *@description
 */

public class Main1070 {
	
	public static void main(String[] args) {
		long arr[]=new long[55];
		arr[1]=1;
		for (int i =2; i < arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n<0){
				break;
			}
			System.out.println(arr[n]);
		}
	}
}
