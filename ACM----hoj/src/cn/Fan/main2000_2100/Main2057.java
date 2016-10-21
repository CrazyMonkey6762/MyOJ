package cn.Fan.main2000_2100;

import java.math.BigInteger;
import java.util.Scanner;
/**
 *@2014-5-20
 *@Author:Fan
 *@description
 */
public class Main2057 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String s1=scan.next();
			String s2=scan.next();
			BigInteger a1=new BigInteger(s1,16);
			BigInteger a2=new BigInteger(s2,16);
			BigInteger a3=a1.add(a2);
			System.out.println(a3.toString(16).toUpperCase());	
		}
	}
}
