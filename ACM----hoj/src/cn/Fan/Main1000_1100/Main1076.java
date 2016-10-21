package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 *
 *@2014-5-17ÉÏÎç10:55:46
 *@Author:·¶ÍşÕñ
 *@description
 */

public class Main1076 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int count=scan.nextInt();
			for (int i = 0; i < count; i++) {
				int start=scan.nextInt();
				int times=scan.nextInt();
				int signs=0;
				for (signs=start;; signs++) {
					if(signs%400==0||(signs%4==0&&signs%100!=0)){
						times--;
					}
					if(times<=0){
						break;
					}
				}
				System.out.println(signs);
			}
		}
	}
}
