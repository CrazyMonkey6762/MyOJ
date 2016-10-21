package cn.Fan.main1100_1200;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-24
 * @Describe
 */
public class Main1176 {

	private static class Pan {
		private int index;
		private int time;

		public Pan(int index, int time) {
			super();
			this.index = index - 5;
			this.time = time;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int testNumber = scan.nextInt();
			Pan bing[] = new Pan[testNumber];
			for (int i = 0; i < testNumber; i++) {
				bing[i]=new Pan(scan.nextInt(), scan.nextInt());
			}
			
			
			
			
			
			
			
		}
	}
}
