package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1046---晚餐
 * @author_Stone6762
 * @CreationTime_2014年12月1日 下午11:25:50
 * @Description_
 */
public class Main1046 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			String aim = "";
			for (int nl = 0, t = 0; nl < n; nl++) {
				String temp = scan.next();
				if (temp.equals("bowl") || temp.equals("knife")
						|| temp.equals("fork") || temp.equals("chopsticks")) {
					t++;
					if (t == 1) {
						aim += temp;
						continue;
					}
					aim += " " + temp;
				}
			}
			System.out.println(aim);
		}
	}
}
