package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1052---相对分子质量
 * @author_Stone6762
 * @CreationTime_2014年12月1日 下午11:41:15
 * @Description_
 */
public class Main1052 {

	
	/** 
	 * @Title_trans根据字母确定相对分子质量
	 * @Describe_
	 * @Author_Stone6762
	 * @param c
	 * @return
	 */
	public static int trans(char c) {
		if (c == 'H' || c == 'h') {
			return 1;
		} else if (c == 'C' || c == 'c') {
			return 12;

		} else if (c == 'N' || c == 'n') {
			return 14;

		} else if (c == 'O' || c == 'o') {
			return 16;

		} else if (c == 'F' || c == 'f') {
			return 19;

		} else if (c == 'P' || c == 'p') {
			return 31;

		} else if (c == 'S' || c == 's') {
			return 32;

		} else if (c == 'K' || c == 'k') {
			return 39;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();
			for (int tls = 0; tls < count; tls++) {
				String str = scan.next();
				int sum = 0;
				for (int i = 0; i < str.length(); i++) {
					char t = str.charAt(i);
					if (Character.isLetter(t)) {
						sum += trans(t);
						continue;
					}
					if (Character.isDigit(t)) {
						int start = i;
						while (i < str.length()
								&& Character.isDigit(str.charAt(i))) {
							i++;
						}
						int num = Integer.valueOf(str.substring(start, i));
						sum += (num - 1) * trans(str.charAt(start - 1));
						i--;
					}
				}
				System.out.println(sum);
			}
		}
	}
}
