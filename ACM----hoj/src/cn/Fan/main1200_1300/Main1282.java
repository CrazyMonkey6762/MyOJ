package cn.Fan.main1200_1300;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-23
 * @Describe
 */
public class Main1282 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			int count = 0;
			String aim = "";
			aim = str;
			boolean flage = false;
			while (!flage) {
				for (int i = 0; i < str.length() / 2; i++) {
					if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
						flage = false;
						break;
					} else {
						flage = true;
					}
				}
				if (!flage) {
					String str2 = "";
					for (int i = 0; i < str.length(); i++) {
						str2 = "" + str.charAt(i) + str2;
					}
					String temp = ""
							+ (Integer.valueOf(str) + Integer.valueOf(str2));
					aim = aim + "--->" + temp;
					str = temp;
					count++;
				}
			}
			System.out.println(count);
			System.out.println(aim);
		}
	}
}
