package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 *
 *@2014-5-14обнГ03:37:15
 *@Author:Fan
 *@description
 */

public class Main1003 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int count=scan.nextInt();
			for (int n = 0; n <count; n++) {
				int maxSum = 0;
				int start = 0;
				int end = 0;
				int N=scan.nextInt();
				int arr[]=new int [N];
				int sum,start1,end1;
				sum=start1=start=0;
				for (int i =0; i < arr.length; i++) {
					arr[i]=scan.nextInt();
				}
				maxSum = arr[0];
				for (int i =0; i < arr.length; i++) {
					sum+=arr[i];
					end1=i;
					if(sum>maxSum){
						maxSum=sum;
						start=start1;
						end=end1;
					}
					if(sum<0){
						sum=0;
						start1=i+1;
					}
				}
				if(n>0){
					System.out.println();
				}
				System.out.println("Case "+(n+1)+":");
				System.out.println(maxSum+" "+(start+1)+" "+(end+1));
			
			}
		}
	}

}
