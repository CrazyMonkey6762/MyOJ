package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 *
 *@2014-5-16обнГ03:15:03
 *@Author:Fan
 *@description
 */

public class Main2055 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int N=scan.nextInt();
			if(N<=0){
				break;
			}
			for (int i = 0; i <N; i++) {
				char x=scan.next().charAt(0);
				int y=scan.nextInt();
				int xx=0;
				if(x>='A'&&x<='Z'){
					xx=1+x-'A';
				}
				if(x>='a'&&x<='z'){
					xx=-1-(x-'a');
				}
				System.out.println(xx+y);
			}
			
		}
	}

}
