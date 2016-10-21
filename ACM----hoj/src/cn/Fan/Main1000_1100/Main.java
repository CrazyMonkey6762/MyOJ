package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * 
 * @2014-5-14обнГ08:58:09
 * @Author:Fan
 * @description
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int M = scan.nextInt();
			for (int n = 0; n < M; n++) {
				int N = scan.nextInt();
				if (N == 0) {
					break;
				}
				double max=0;
				for (int i = 0; i < N; i++) {
					double t=scan.nextDouble();
					if(t>max){
						max=t;
					}
				}
				System.out.printf("%.2f",max);
				System.out.println();
			}
		}
	}

}
