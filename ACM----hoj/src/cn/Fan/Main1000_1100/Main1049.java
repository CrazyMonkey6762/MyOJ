package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-13
 * @Describe
 */
public class Main1049 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int sum = scan.nextInt();
			int up = scan.nextInt();
			int dowm = scan.nextInt();
			if (sum <= 0) {
				break;
			}
			int nowPlace = 0;
			int countTime = 0;
			boolean flage = true;
			while (flage) {
				nowPlace += up;
				countTime++;
				if (nowPlace >= sum) {
					flage = false;
				} else {
					nowPlace -= dowm;
					countTime++;
				}
			}
			System.out.println(countTime);
		}
	}

}
