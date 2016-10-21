package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 *
 *@2014-5-17ÉÏÎç11:09:09
 *@Author:·¶ÍşÕñ
 *@description
 */

public class Main1018 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int count=scan.nextInt();
			for (int k =0; k <count; k++) {
				int signs=scan.nextInt();
				double sum=0;
				for (int i =1; i <=signs; i++) {
					sum+=Math.log10(i);
				}
				System.out.println(((int)sum)+1);
			}
		}
	}
}
