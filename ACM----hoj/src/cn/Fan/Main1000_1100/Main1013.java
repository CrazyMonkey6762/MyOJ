package cn.Fan.Main1000_1100;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-13
 * @Describe 
 */
public class Main1013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
		String temp=scan.next();
		if(temp.equals("0")){
			break;
		}
		boolean flage=true;
		while(flage){
			int sum=0;
			for (int i= 0; i <temp.length(); i++) {
				sum=sum+(temp.charAt(i)-'0');
			}
		    temp=String.valueOf(sum);
		    if(temp.length()==1){
		    	break;
		    }   
		}
		
		
		
		System.out.println(temp);
		}
	}

}
