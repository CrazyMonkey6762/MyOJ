package cn.Fan.main2000_2100;

import java.util.Scanner;
/**
 * @Title:
 * @author 范威振
 * @date 2014-4-29
 * @Describe:建立一个坐标系，用直线的方法来表示
 */
public class Main2091_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		while (scan.hasNext()) {
			char signs = scan.next().charAt(0);
			if (signs == '@') {
				break;
			}
			if(count>0){
				System.out.println();
			}
			int n = scan.nextInt();
			for (int j =n-1; j >=0; j--) {// 表示的是y轴
				for (int i = -(n - 1); i <=n-j-1; i++) {// 表示的是x轴
					if (j + Math.abs(i) == n-1||j==0) {
						System.out.print(signs);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			count++;
		}
	}

}
