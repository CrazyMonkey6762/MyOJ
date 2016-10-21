package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-13
 * @Describe 
 */
public class Main1008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int N=scan.nextInt();
			if(N<=0){
				break;
			}
			int arr[]=new int [N];
			arr[0]=scan.nextInt();
			int sum=5*N+6*arr[0];
			for (int i=1; i <arr.length; i++) {
				arr[i]=scan.nextInt();
				if(arr[i]>=arr[i-1]){
					sum+=(arr[i]-arr[i-1])*6;
				}
				if(arr[i]<arr[i-1]){
					sum+=(arr[i-1]-arr[i])*4;
				}
			}
			System.out.println(sum);
		}
	}

}
