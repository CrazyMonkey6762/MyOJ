package cn.Fan.main2000_2100;

import java.math.BigDecimal;
import java.util.Scanner;
/**
 *
 *@2014-5-16обнГ03:02:35
 *@Author:Fan
 *@description
 */

public class Main2054 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			BigDecimal a=scan.nextBigDecimal();
			BigDecimal b=scan.nextBigDecimal();
			if(a.compareTo(b)==0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
