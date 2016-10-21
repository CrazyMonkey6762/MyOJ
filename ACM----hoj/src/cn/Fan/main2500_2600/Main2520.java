package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 *
 *@2014-5-12обнГ04:16:09
 *@Author:Fan
 *@description
 */

public class Main2520 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int count=scan.nextInt();
			for (int i = 0; i <count; i++) {
				int n=scan.nextInt();
				System.out.println((n*n)%10000);
				
			}
		}
	}
}
