package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-6-3
 * @Describe 
 */
public class Main1062 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int test = scan.nextInt();
			if (test <= 0) {
				break;
			}
			String temp = scan.nextLine();
			for (int i = 0; i < test; i++) {
				String str = scan.nextLine();
				str=str.replaceAll(" ", "@");
				String arr[] = str.trim().split("@+");
				for (int j = 0; j < arr.length; j++) {
					String t = "";
					for (int k = 0; k < arr[j].length(); k++) {
						t = arr[j].charAt(k) + t;
					}
					str=str.replace(arr[j], t);
					str=str.replace("@", " ");
				}
				System.out.println(str);
			}
		}

	}

}
