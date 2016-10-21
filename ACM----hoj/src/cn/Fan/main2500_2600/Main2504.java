package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 *
 *@2014-5-12обнГ01:59:19
 *@Author:Fan
 *@description
 */

public class Main2504 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int number=scan.nextInt();
			if(number<=0){
				break;
			}
			for (int p = 0; p <number; p++) {
				int a=scan.nextInt();
				int b=scan.nextInt();
				for (int i =2*b; i<a*2; i+=b) {
					int signs=i;
					int signs2=a;
					 while(signs!=0){  
			               int temp=signs2%signs;
			               signs2=signs;
			               signs=temp;
			            }  
					if(signs2==b){
						System.out.println(i);
						break;
					}
				}
			}
		}
	}

}
