package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @ClassName_Main
 * @author_Stone6762
 * @CreationTime_2014-8-25 下午05:26:46
 * @Description_求大数的大数次幂的最高位
 * 
 * nu^nu=10^n+a------a是小于10的      n是一个整数
 * 
 * 则
 * nu*ln(nu)=n+ln(a)----------ln(a）是小数      n是整数
 * 
 * 令 x= nu*ln（nu）----------------ln(a）是x 的小数部分       n是x的整数部分
 * 
 * 有   x= n+ln(a)
 * 
 * 也就是    a=10^(x-n)-------a=10^(x-（int）x)
 */
public class Main1060 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int test=scan.nextInt();
			for (int i = 0; i < test; i++) {
				long n = scan.nextLong();
				double x = n * (Math.log10(n));
				int a = (int) Math.pow(10, x - (long) (x));
				System.out.println(a);
			}
		}
	}
}
