package cn.Fan.Main1000_1100;

import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 *@2014-5-12обнГ01:18:07
 *@Author:Fan
 *@description
 */
public class Main1042 {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int N=scan.nextInt();
			BigInteger sum=new BigInteger("1");
			for (int i =1; i <=N; i++) {
				sum=sum.multiply(new BigInteger(""+i));
			}
			System.out.println(sum);
			
		}
	}

}
