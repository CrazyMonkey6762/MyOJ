package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 *
 *@2014-5-17ÉÏÎç10:13:54
 *@Author:·¶ÍşÕñ
 *@description
 */
public class Main1032 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int m=scan.nextInt();
			int start=Math.min(n, m);
			int end=Math.max(m, n);
			int arr[]=new int [end-start+1];
			int signs=0;
			int temp=0;
			for (int i=start; i <=end; i++) {
				signs=i;
				arr[temp]=1;
				while(signs!=1){
					if(signs%2==1){
						signs=3*signs+1;
					}else{
						signs=signs/2;
					}
					arr[temp]++;
				}
				temp++;
			}
			int max=0;
			for (int i=0; i <arr.length; i++) {
				if(arr[i]>arr[max]){
					max=i;
				}
			}
			System.out.println(n+" "+m+" "+arr[max]);
		}
	}

}
