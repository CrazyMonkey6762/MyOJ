package cn.stone.test;

import java.util.Scanner;

/**
 * @Title_Main.java
 * @author_Stone6762
 * @CreationTime_2015年8月20日 下午9:40:00
 * @Description
 */
public class Main111 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str1 = scan.next();
			int c1 = scan.next().charAt(0) - '0';
			String str2 = scan.next();
			int c2 = scan.next().charAt(0) - '0';
			str1 = str1.replaceAll("[^" + c1 + "]", "");
			str2 = str2.replaceAll("[^" + c2 + "]", "");
			long numb1 = Long.valueOf(str1);
			long numb2 = Long.valueOf(str2);
			System.out.println(numb1 + numb2);
		}
	}
}
