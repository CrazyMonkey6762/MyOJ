package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-6
 * @Describe 
 */
public class Main2076 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int num=scan.nextInt();
			if(num<=0){
				break;
			}
			double result[]=new double[num];
			
			for (int i = 0; i < result.length; i++) {
				
				double h=scan.nextInt();
				double m=scan.nextInt();
				double s=scan.nextInt();
				
				double hCount=30*h+m/60.0*30.0+s/3600.0*30.0;
				double mCount=m*6+s/60.0*6;
				result[i]=Math.abs(hCount-mCount);
			
				if(result[i]>180){
					result[i]=360-result[i];
				}	
			}
			
			
			for (int i = 0; i < result.length; i++) {
				System.out.println((int)result[i]);
			}
			
			
			
		}
	}

}
