package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1042_2--Ԫ����ĸת��
 * @author_Stone6762
 * @CreationTime_2014��12��1�� ����11:32:34
 * @Description_
 */
public class Main1042_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int nl = 0; nl < n; nl++) {
				String s1 = scan.next().toLowerCase();
				String aim = "";
				char c = ' ';
				for (int i = 0; i < s1.length(); i++) {
					c = s1.charAt(i);
					if (c == 'a' || c == 'e' || c == 'i' || c == 'o'
							|| c == 'u') {
						c -= 32;
					}
					aim += c;
				}
				System.out.println(aim);
			}
		}
	}
}
