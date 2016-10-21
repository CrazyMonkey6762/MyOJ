package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @ClassName_Main
 * @author_Stone6762
 * @Description_
 */
public class Main2000 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println(a + b);
			}
		}
	}
}
