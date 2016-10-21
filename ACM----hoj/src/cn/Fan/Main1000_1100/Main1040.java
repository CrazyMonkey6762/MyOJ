package cn.Fan.Main1000_1100;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *@2014-5-12обнГ01:11:57
 *@Author:Fan
 *@description
 */

public class Main1040 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int number=scan.nextInt();
			for (int n = 0; n <number; n++) {
				int N=scan.nextInt();
				int arr[]=new int [N];
				for (int i = 0; i < arr.length; i++) {
					arr[i]=scan.nextInt();
				}
				
				Arrays.sort(arr);
				for (int i = 0; i < arr.length; i++) {
					if(i==0){
						System.out.print(arr[i]);
					}else{
						System.out.print(" "+arr[i]);
					}
				}
				
				System.out.println();
				
			}
		}
	}

}
