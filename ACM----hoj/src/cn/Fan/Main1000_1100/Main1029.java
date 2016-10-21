package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 *
 *@2014-5-14обнГ04:28:28
 *@Author:Fan
 *@description
 */

public class Main1029 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int N=scan.nextInt();
			int arr[]=new int [50000];
			int s=0,n=0;
			int signs=(N+1)/2;
			for (int i = 0; i <N; i++) {
				n=scan.nextInt();
				arr[n]++;
				if(arr[n]>=signs){
					s=n;
				}
			}
			System.out.println(s);
		}
	}

}
