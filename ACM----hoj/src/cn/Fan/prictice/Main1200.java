package cn.Fan.prictice;

import java.util.Scanner;

/**
 * @ClassName_Main1200
 * @author_Stone6762
 * @CreationTime_2015年9月3日 下午3:58:39
 * @Description_
 */
public class Main1200 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			String str = scan.next();
			int hangN = str.length() / n;
			String result = "";
			int t = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < hangN; j++) {
					if (j % 2 == 0) {
						t = i + n * j;
					} else {
						t = (j + 1) * n - 1 - i;
					}
					char ct = str.charAt(t);
					result += "" + ct;
				}
			}
			System.out.println(result);
		}
	}
}
