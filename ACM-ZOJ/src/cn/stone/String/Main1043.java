package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1043--�������ַ���
 * @author_Stone6762
 * @CreationTime_2014��12��1�� ����11:25:22
 * @Description_
 */
public class Main1043 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int nl = 0; nl < n; nl++) {
				int t = scan.nextInt();
				String sings = "";
				for (int i = 0; i < t; i++) {
					sings += "ACM";
				}
				for (int i = 0; i < t * 3; i++) {
					System.out.println(sings);
				}
			}
		}
	}

}
