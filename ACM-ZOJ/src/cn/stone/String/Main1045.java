package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1045--�����С����
 * @author_Stone6762
 * @CreationTime_2014��12��1�� ����11:25:42
 * @Description_
 */
public class Main1045 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int nl = 0; nl < n; nl++) {
				String str = scan.next();
				int count = scan.nextInt();
				int index = str.indexOf('.') + count;
				if (index < str.length()) {
					System.out.println(str.charAt(index));
				} else {
					System.out.println(0);
				}
			}
		}
	}
}
