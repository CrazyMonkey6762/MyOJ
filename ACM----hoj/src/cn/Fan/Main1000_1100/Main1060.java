package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @ClassName_Main
 * @author_Stone6762
 * @CreationTime_2014-8-25 ����05:26:46
 * @Description_������Ĵ������ݵ����λ
 * 
 * nu^nu=10^n+a------a��С��10��      n��һ������
 * 
 * ��
 * nu*ln(nu)=n+ln(a)----------ln(a����С��      n������
 * 
 * �� x= nu*ln��nu��----------------ln(a����x ��С������       n��x����������
 * 
 * ��   x= n+ln(a)
 * 
 * Ҳ����    a=10^(x-n)-------a=10^(x-��int��x)
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
