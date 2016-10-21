package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-4-26
 * @Describe 
 */
public class Main2090 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double countSum=0;
		while (scan.hasNext()){
			String sings=scan.next();
			double number=scan.nextDouble();
			double price=scan.nextDouble();
			countSum+=number*price;
		}
		System.out.printf("%.1f",countSum);
	}

}
