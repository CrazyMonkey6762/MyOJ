package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1041----奇偶位互换
 * @author_Stone6762
 * @CreationTime_2014年12月1日 下午11:24:41
 * @Description_
 */
public class Main1041 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
		
			for (int nl = 0; nl < n; nl++) {
				String s1 = scan.next();
				String aim = "";
			
				for (int i = 0; i < s1.length(); i++) {
					aim += s1.charAt(i + 1);
					aim += s1.charAt(i);
					i++;
				}
				
				System.out.println(aim);
			}
		}
	}
}
