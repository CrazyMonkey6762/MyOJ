package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 *
 *@2014-5-6下午04:50:28
 *@Deteacher 向量的乘积，除以向量模的乘积，去反三角函数
 *@Author:Fan
 */

public class Main2080 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int num=scan.nextInt();
			double result []=new double [num]; 
			for (int i = 0; i <num; i++) {
				double x1=scan.nextDouble();
				double y1=scan.nextDouble();
				double x2=scan.nextDouble();
				double y2=scan.nextDouble();
				double sum1=Math.hypot(x1, y1)*Math.hypot(x2, y2);
				double sum2=x1*x2+y1*y2;
				result [i]=Math.toDegrees(Math.acos(sum2/sum1));	
			}
			for (int i = 0; i < result.length; i++) {
					System.out.printf("%.2f",result[i]);
					System.out.println();
			}
		}
	}

}
