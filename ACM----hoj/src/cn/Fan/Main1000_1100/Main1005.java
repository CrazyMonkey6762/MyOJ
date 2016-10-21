package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * 
 * @2014-5-14обнГ02:10:25
 * @Author:Fan
 * @description f(n) = (A * f(n - 1) + B * f(n - 2)) mod 7
 */
public class Main1005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int N = scan.nextInt();
			if (A == 0 && B == 0 && N == 0) {
				break;
			}
			int arr[] = new int[50];
			arr[1] = arr[2] = 1;
			for (int i = 3; i < arr.length; i++) {
				arr[i] = (A * arr[i - 1] + B * arr[i - 2]) % 7;
			}
			System.out.println(arr[N%49]);
		}
	}

}
