package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 *
 *@2014-5-20ÏÂÎç05:49:32
 *@Author:·¶ÍþÕñ
 *@description
 */

public class Main1097 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			int result=a;;
			for (int i = 0; i <b; i++) {
				result=a*result%10;
			}
			System.out.println(result);
		}
	}
}
