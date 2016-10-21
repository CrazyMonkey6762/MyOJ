package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 *
 *@2014-5-18ÏÂÎç12:55:00
 *@Author:·¶ÍþÕñ
 *@description
 */

public class Main2564 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int count =scan.nextInt();
			String tem=scan.nextLine();
			for (int i = 0; i <count; i++) {
				String signs=scan.nextLine();
				String arr[]=signs.trim().toUpperCase().split(" +");
				String newStr="";
				for (int j = 0; j < arr.length; j++) {
					newStr+=arr[j].charAt(0);
				}
				System.out.println(newStr);
			}
		}
	}

}
