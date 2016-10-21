package cn.stone.String;

import java.util.Scanner;

/**  
 * @ClassName_Main1044--字母概率
 * @author_Stone6762  
 * @CreationTime_2014年12月1日 下午11:25:33
 * @Description_
 */
public class Main1044 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			char aim = scan.next().toLowerCase().charAt(0);
			String str = scan.next().toLowerCase();
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (aim == str.charAt(i)) {
					count++;
				}
			}
			double result = (count*1.00) / str.length();
			System.out.printf("%.5f", result);
			System.out.println();
		}
	}
}
