package cn.Fan.prictice;

import java.util.Scanner;

/**
 * @ClassName_Main1018
 * @author_Stone6762
 * @CreationTime_2015年9月3日 下午3:13:51
 * @Description_
 */
public class Main1018 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int testNumber=scan.nextInt();
			for (int i = 0; i <testNumber; i++) {
				int n=scan.nextInt();
				double sum=0;
				for (int j = 2; j <=n; j++) {
					sum+=Math.log10(j);
				}
				int reslut=((int) sum)+1;
				System.out.println(reslut);
			}
		}
	}
}
