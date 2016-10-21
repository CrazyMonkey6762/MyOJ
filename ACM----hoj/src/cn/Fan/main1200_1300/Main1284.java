package cn.Fan.main1200_1300;

import java.util.Scanner;
/**
 *
 *@2014-5-17ÏÂÎç12:58:30
 *@Author:·¶ÍþÕñ
 *@description
 */
public class Main1284 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long result[]=new long [32768+3];
		long temp[]=new long [32768+3];
		for (int i = 0; i <=32768; i++) {
			result[i]=1;
		}
		for (int i =2; i <=3; i++) {
			for (int j=0;j<=32768; j++) {
				for (int k=0;k+j<=32768; k+=i) {
					temp[k+j]+=result[j];
				}
			}
			for (int j = 0; j <=32768; j++) {
				result[j]=temp[j];
				temp[j]=0;
			}
		}
		while(scan.hasNext()){
			int n=scan.nextInt();
			System.out.println(result[n]);
		}
	}

}
