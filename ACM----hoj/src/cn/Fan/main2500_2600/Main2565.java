package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 *
 *@2014-5-19ÏÂÎç07:42:24
 *@Author:·¶ÍþÕñ
 *@description
 */

public class Main2565 {

	private static int abs(int a){
		return a>0?a:(-a);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()) {
			int count=scan.nextInt();
			for (int m = 0; m <count; m++) {
				int temp=scan.nextInt();
				int signs=(temp-1)/2;
				for (int y =-signs; y<=signs; y++) {
					for (int x =-signs; x <=abs(y); x++) {
						if(abs(x)==abs(y)){
							System.out.print("X");
						}else{
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				System.out.println();			
				
			}
		}
	}
}
