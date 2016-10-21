package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 *
 *@2014-5-11обнГ01:14:37
 *@Author:Fan
 *@description
 */

public class Main2502 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int count=scan.nextInt();
			if(count<=0){
				break;
			}
			for (int i = 0; i <count; i++) {
				int n=scan.nextInt();
				int sum= (int) (Math.pow(2.0, n-1)+(n-1)*Math.pow(2.0, n-1)/2);
				System.out.println(sum);
			}
		}
	}

}
