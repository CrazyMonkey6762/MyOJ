package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 *
 *@2014-5-14ионГ09:56:13
 *@Author:Fan
 *@description
 */

public class Main1014 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int stp=scan.nextInt();
			int mod=scan.nextInt();
			boolean signs[]=new boolean[mod+1];
			int temp=0;
			do{
				signs[temp]=true;
				temp=(temp+stp)%mod;
			}while(temp!=0);
			boolean flage=true;
			for (int i = 0; i <mod; i++) {
				if(signs[i]==false){
					flage=false;
					break;
				}
			}
			if(flage){
				System.out.printf("%10d%10d    Good Choice",stp,mod);
				System.out.println();
				System.out.println();
			}else{
				System.out.printf("%10d%10d    Bad Choice",stp,mod);
				System.out.println();
				System.out.println();
			}
		}
	}

}
