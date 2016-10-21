package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 *
 *@2014-5-19ÏÂÎç08:08:26
 *@Author:·¶ÍşÕñ
 *@description
 */

public class Main2568 {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()) {
			int c=scan.nextInt();
			for (int k = 0; k <c; k++) {
				long signs=scan.nextLong();
				int sum=0;
				while(signs!=0){
					if(signs%2==1){
						sum++;
						signs--;
					}
					signs/=2;
				}
				System.out.println(sum);
			}
		}
	}

}
