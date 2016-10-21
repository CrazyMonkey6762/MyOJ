package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 *
 *@2014-5-17ÉÏÎç09:16:58
 *@Author:·¶ÍşÕñ
 *@description
 */

public class Main2562 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int count=scan.nextInt();
			for (int i = 0; i <count; i++) {
				
				String temp=scan.next();
				String signs="";
				for (int j = 0; j <temp.length(); j+=2) {
					signs=signs+temp.charAt(j+1)+temp.charAt(j);
				}
				System.out.println(signs);
			}
		}
	}

}
