package cn.Fan.main1200_1300;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-6-3
 * @Describe
 */
public class Main1256 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int test = scan.nextInt();
			for (int l = 0; l < test; l++) {
				char signs = scan.next().charAt(0);
				int high = scan.nextInt();
				int up, down;
				up = down = (high - 3) / 2;
				if ((high - 3) % 2 != 0) {
					down++;
				}
				int kuan= high / 6 + 1;
				String top = "";
				for (int i = 0; i < kuan; i++) {
					top += " ";
				}

				for (int i = 0; i < down; i++) {
					top += signs;
				}

				String zhongjian = "";
				for (int i = 0; i < kuan; i++) {
					zhongjian += signs;
				}

				for (int i = 0; i < down; i++) {
					zhongjian += " ";
				}

				for (int i = 0; i < kuan; i++) {
					zhongjian += signs;
				}
				
				if (l> 0) {
					System.out.println();
				}
				System.out.println(top);
				for (int i = 0; i < up; i++) {
					System.out.println(zhongjian);
				}
				System.out.println(top);
				for (int i = 0; i < down; i++) {
					System.out.println(zhongjian);
				}
				System.out.println(top);

			}
		}
	}

}
