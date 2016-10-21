package cn.Fan.Main1000_1100;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @2014-5-28����06:36:04
 * @Author:������
 * @description
 */

public class Main1022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			String str1 = scan.next();
			String str2 = scan.next();
			Stack<Character> temp = new Stack<Character>();
			char inarr[] = str1.toCharArray();
			char outarr[] = str2.toCharArray();
			int flag[] = new int[20];
			for (int i = 0, j = 0; i < n;) {
				if (temp.isEmpty()) {
					temp.push(inarr[i]);
					flag[i + j] = 1;
					i++;
				}
				if (!temp.isEmpty() && temp.peek() != outarr[j]) {
					temp.push(inarr[i]);
					flag[i + j] = 1;
					i++;
				}
				// ����Ҫע�⣬����ʹ��if,��ʼʹ��if��һֱ����AC������ʹ��while��Ҫ�����з��Ϲ����
				// Ԫ�ض�����ջ...
				while (!temp.isEmpty() && temp.peek() == outarr[j]) {
					temp.pop();
					flag[i + j] = 0;
					j++;
				}
			}
			if (temp.isEmpty()) {
				System.out.println("Yes.");
				for (int m = 0; m < 2 * n; m++) {
					if (flag[m] == 1) {
						System.out.println("in");
					} else {
						System.out.println("out");
					}
				}
			} else {

				System.out.println("No.");
			}
			System.out.println("FINISH");
		}
	}
}
