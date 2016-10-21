package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-4-23
 * @Describe 
 */
public class Main2097 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n==0){
				break;
			}else{
				int signs[]=new int[3];
				int arr[]={10,12,16};
				int sum[]=new int[3];
				
				for (int i = 0; i <3; i++) {
					signs[i]=n;
					sum[i]=signs[i]%arr[i];
					signs[i]=signs[i]/arr[i];
					while(signs[i]!=0){
						sum[i]+=signs[i]%arr[i];
						signs[i]=signs[i]/arr[i];
					}
				}
				if(sum[0]==sum[1]&&sum[1]==sum[2]){
					System.out.println(n+" is a Sky Number.");
				}else{
					System.out.println(n+" is not a Sky Number.");
					
				}
			}			
		}
	}

}
