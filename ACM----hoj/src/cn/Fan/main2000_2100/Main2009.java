package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-4-20
 * @Describe 
 */
public class Main2009 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			double n=scan.nextDouble();
			int m=scan.nextInt();
			double sum=n,temp=n;	
			for (int i=2; i <=m; i++) {
				temp=Math.sqrt(temp);
				sum=sum+temp;;
			}	
			System.out.printf("%.2f",sum);
			System.out.println();
			}
			
		
	}
}
