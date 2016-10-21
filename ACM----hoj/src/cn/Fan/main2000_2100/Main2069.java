package cn.Fan.main2000_2100;

import java.util.Scanner;
/**
 *
 *@2014-5-11下午12:01:35
 *@Author:Fan
 *@description 
 */
public class Main2069 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        while (scan.hasNext()) {
	        	int maxNumber=scan.nextInt();
	        	if(maxNumber<0){
	        		break;
	        	}
	            int result[]=new int [maxNumber+3];
	            int temp[]=new int [maxNumber+3];
	            int arr[]=new int []{0,1,5,10,25,50};
	            
	            //确定第一个括号里面的各个项的系数
	            for (int i =0; i <=100; i++) {
	                result[i]=1;
	            }	            
	            for (int i =2; i <=5; i++) {
	                for (int j =0; j <=maxNumber; j++) {
	                    for (int k = 0; k+j<=maxNumber&&j+k<100;k+=arr[i]) {
	                        temp[j+k]+=result[j];
	                    }
	                }
	                for (int j =0; j <=maxNumber; j++) {
	                    result[j]=temp[j];
	                    temp[j]=0;
	                }
	            }
	            System.out.println(result[maxNumber]);
	            
	        }
	}
}
