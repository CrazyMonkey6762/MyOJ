package cn.stone.simulate;

import java.util.Scanner;

/**
 * @ClassName_Main1011
 * @author_Stone6762
 * @CreationTime_2014年12月13日 下午11:06:08
 * @Description_
 */
public class Main1011 {

	private static int maNA;
	private static int minNA;
	private static int rNA;
	private static int maNB;
	private static int minNB;
	private static int rNB;
	private static boolean flagMax;
	private static boolean flagMin;
	private static boolean flagR;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int countN = scan.nextInt();
			for (int i = 0; i < countN; i++) {
				maNA = scan.nextInt();
				minNA = scan.nextInt();
				rNA = scan.nextInt();
				maNB = scan.nextInt();
				minNB = scan.nextInt();
				rNB = scan.nextInt();
				flagMax = maNA == maNB;
				if (flagMax) {
					flagMin = minNA == maNB;
					if (flagMin) {
						flagR = rNA == rNB;
						if (flagR) {
							System.out.println("Same");
						} else {
							if (rNA > rNB) {
								System.out.println("First");
							} else {
								System.out.println("Second");
							}
						}

					} else {
						if (minNA > minNB) {
							System.out.println("First");
						} else {
							System.out.println("Second");
						}
					}
				} else {
					if (maNA > maNB) {
						System.out.println("First");
					} else {
						System.out.println("Second");
					}
				}

			}

		}
	}
}
