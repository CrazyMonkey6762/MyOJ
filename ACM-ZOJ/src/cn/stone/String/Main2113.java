package cn.stone.String;

import java.util.Scanner;

/**
 * @Title_Test.java
 * @author_Stone6762
 * @CreationTime_2014年10月20日 下午9:59:35
 */
public class Main2113 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			int big = 0, sma = 0, dige = 0, kong = 0;
			for (int i = 0; i < str.length(); i++) {
				char t = str.charAt(i);
				if (Character.isDigit(t)) {
					dige++;
					continue;
				}
				if (Character.isUpperCase(t)) {
					big++;
					continue;
				}
				if (Character.isLowerCase(t)) {
					sma++;
					continue;
				}
				if (t == ' ') {
					kong++;
				}
			}
			System.out.println(big + " " + sma + " " + dige + " " + kong);

		}
	}
}