package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 * 
 * @2014-5-19ÏÂÎç08:26:17
 * @Author:·¶ÍşÕñ
 * @description
 */

public class Main2549 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();
			for (int k = 0; k < count; k++) {
				String str = scan.next();
				int signs = scan.nextInt();
				for (int i = 0; i <str.length();i++) {
					if(str.charAt(i)=='.'){
						if(i+signs<str.length()){
							System.out.println(str.charAt(i+signs));
						}else{
							System.out.println(0);
						}
						break;
					}
					
				}
			}
		}
	}
}
