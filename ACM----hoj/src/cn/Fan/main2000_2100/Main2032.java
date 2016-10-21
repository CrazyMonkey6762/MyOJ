package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-4-21
 * @Describe 
 */
public class Main2032 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			int n=scan.nextInt();
			if(n>=1&&n<=30){
				int arr[][]=new int[n][n];
				for (int i =0; i <n; i++) {
					for (int j=0; j<=i; j++) {
						if(j==0||j==i){
							arr[i][j]=1;
						}else{
							arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
						}
					}
				}
				for (int i =0; i <n; i++) {
					for (int j=0; j <=i; j++) {
						if(j==0){
							System.out.print(arr[i][j]);
							
						}else{
							System.out.print(" "+arr[i][j]);
							
						}
					}
					System.out.println();
				}
				System.out.println();
			}
		}
		
	}
}
