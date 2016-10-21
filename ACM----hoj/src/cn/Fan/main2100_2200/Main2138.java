package cn.Fan.main2100_2200;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-6-6
 * @Describe
 */
public class Main2138 {
	private static boolean SuShu(int temp) {
		if (temp ==1||temp==0) {
			return false;
		}
		int signs=(int) Math.sqrt(temp);
		for (int i = 2; i <=signs ; i++) {
			if (temp % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			long n = scan.nextLong();
			if(n<=0){
				break;
			}
			long sum = 0;
			for (int i = 0; i < n; i++) {
				int temp = scan.nextInt();
				if (SuShu(temp)) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}

}
