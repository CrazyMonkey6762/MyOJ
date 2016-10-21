package cn.Fan.main2500_2600;

import java.util.Scanner;
/**
 *
 *@2014-5-19ÏÂÎç08:00:54
 *@Author:·¶ÍşÕñ
 *@description
 */
public class Main2567 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()) {
			int count=scan.nextInt();
			for (int i = 0; i <count; i++) {
				String str=scan.next();
				String temp=scan.next();
				String newStr="";
				for (int j = 0; j <str.length(); j++) {
					newStr+=str.charAt(j);
					if(j==str.length()/2-1){
						newStr+=temp;
					}
				}
				System.out.println(newStr);
			}
		}
	}
}
