package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 *
 *@2014-5-12обнГ12:47:33
 *@Author:Fan
 *@description
 *
 */
public class Main1021 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			 if(n%4==2){
				 System.out.println("yes");
			 }else{
				 System.out.println("no");
			 }
		}
	}

}
