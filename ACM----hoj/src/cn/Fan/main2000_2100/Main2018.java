package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-4-21
 * @Describe 
 */
public class Main2018 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n>0&&n<55){
			int arr[]=new int [n];
			for (int i = 0; i <n; i++) {
				if(i<4){
					arr[i]=i+1;
				}else{
					arr[i]=arr[i-1]+arr[i-3];
				}
			}
			System.out.println(arr[n-1]);			
			}
		}
	}

}
