package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * 
 * @2014-5-6обнГ04:38:10
 * @Deteacher
 * @Author:Fan
 */
public class Main2075 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int num=scan.nextInt();
			for (int i = 0; i <num; i++) {
				long a=scan.nextLong();
				long b=scan.nextLong();
				if(a%b==0){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		}
	}
}
