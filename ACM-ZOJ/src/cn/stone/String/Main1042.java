package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1042--元音字母转换
 * @author_Stone6762
 * @CreationTime_2014年12月1日 下午11:24:55
 * @Description_
 */
public class Main1042 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int nl = 0; nl < n; nl++) {
				String s1 = scan.next().toLowerCase();
				s1 = s1.replaceAll("a", "A").replaceAll("e", "E")
						.replaceAll("i", "I").replaceAll("o", "O")
						.replaceAll("u", "U");
				System.out.println(s1);
			}
		}
	}
}
