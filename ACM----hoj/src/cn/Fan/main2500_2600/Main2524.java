package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 *
 *@2014-5-12обнГ04:34:09
 *@Author:Fan
 *@description
 */

public class Main2524 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int count=scan.nextInt();
			for (int i = 0; i <count; i++) {
				int m=scan.nextInt();
				int n=scan.nextInt();
				System.out.println((m*(m+1)*n*(n+1)/4));
			}
		}
	}

}
