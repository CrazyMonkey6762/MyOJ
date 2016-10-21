package cn.Fan.main2100_2200;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-6-7
 * @Describe
 */
public class Main2139 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int m = scan.nextInt();
			if(m<=0){
				break;
			}
			int n = (m + 1) / 2;
			int result = (4 * n * n - 1)/3*n;
			System.out.println(result);
		}
	}
}
