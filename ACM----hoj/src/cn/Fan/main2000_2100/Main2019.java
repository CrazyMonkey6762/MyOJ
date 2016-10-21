package cn.Fan.main2000_2100;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-4-20
 * @Describe 
 */
public class Main2019 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int m=scan.nextInt();
			
			if(!(m==0&&n==0)){
				int arr[]=new int[n+1];
			
				for (int i = 0; i <n; i++) {
					arr[i]=scan.nextInt();
				}
				arr[n]=m;
				Arrays.sort(arr);
			for (int j = 0; j <=n; j++) {
				if(j==0){
					System.out.print(arr[j]);
				}else{
					System.out.print(" "+arr[j]);
				}
			}	
			System.out.println();	
		
			
			
			}	
		}
	}

}
