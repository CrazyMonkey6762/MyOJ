package cn.stone.String;

import java.util.Scanner;

/**  
 * @ClassName_Main1047--字符串的奇偶性
 * @author_Stone6762  
 * @CreationTime_2014年12月1日 下午11:26:02
 * @Description_
 */
public class Main1047 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			if (str.equals("#")) {
				break;
			}
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '1') {
					count++;
				}
			}
			char sings = str.charAt(str.length() - 1);
			boolean fla = count % 2 == 0;
			if ((!fla && sings == 'e') || (fla && sings == 'o')) {
				str=str.replace(sings, '1');
			} else {
				str=str.replace(sings, '0');
			}
			System.out.println(str);
		}
	}
}
