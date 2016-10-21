package cn.Fan.main1400_1500;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 *@2014-5-17ÉÏÎç09:52:49
 *@Author:·¶ÍþÕñ
 *@description
 */

public class Main1402 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
		BigInteger a=scan.nextBigInteger();
		BigInteger b=scan.nextBigInteger();
		BigInteger c=a.multiply(b);
		System.out.println(c);
		}
	}
}
