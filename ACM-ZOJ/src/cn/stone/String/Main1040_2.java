package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1040_2---墓碑上的字符
 * @author_Stone6762
 * @CreationTime_2014年12月1日 下午11:28:57
 * @Description_
 */
public class Main1040_2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		while (scan.hasNext()) {
			int n = scan.nextInt();
		
			for (int nl = 0; nl < n; nl++) {
				String s1 = scan.next();
				String s2 = scan.next();
				
				String aim = "";
			
				for (int i = 0; i < s1.length(); i++) {
					if (i == s1.length() / 2) {
						aim += s2;
					}
				
					aim += s1.charAt(i);
				}
				
				System.out.println(aim);
			}
		}
	}
}
