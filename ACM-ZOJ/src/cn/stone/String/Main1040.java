package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1040---墓碑上的字符
 * @author_Stone6762
 * @CreationTime_2014年12月1日 下午11:24:32
 * @Description_
 */
public class Main1040 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
		
			for (int nl = 0; nl < n; nl++) {
				String s1 = scan.next();
				String s2 = scan.next();
			
				String aim = s1.substring(0, s1.length() / 2) + s2
						+ s1.substring(s1.length() / 2, s1.length());
				
				System.out.println(aim);
			}
		}
	}
}
