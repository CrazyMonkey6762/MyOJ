package cn.Fan.main1200_1300;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-21
 * @Describe
 */
public class Main1228 {

	public static void main(String[] args) {
		String arr[] = new String[] { "zero", "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine" };

		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			String regex = "\\+ ";
			String temp[] = str.replaceAll(" =", regex).split(regex);
			String qian[] = temp[0].trim().split(" +");
			String hou[] = temp[1].trim().split(" +");
			int a = 0, b = 0;
			int t = 0;
			for (int i = 0; i < qian.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (qian[i].trim().equals(arr[j])) {
						t++;
						if (t == 1) {
							a = j;
						} else if (t == 2) {
							a = a * 10 + j;
						}
					}
				}
			}
			t = 0;
			for (int i = 0; i < hou.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (hou[i].trim().equals(arr[j])) {
						t++;
						if (t == 1) {
							b = j;
						} else if (t == 2) {
							b = b * 10 + j;
						}
					}
				}
			}

			int c = a + b;
			if (c != 0) {
				System.out.println(c);
			}

		}
	}

}
