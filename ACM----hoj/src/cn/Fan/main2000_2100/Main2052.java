package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-19
 * @Describe 
 */
public class Main2052 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()) {
			int wid=scan.nextInt();
			int hig=scan.nextInt();
			String widStr="+";
			for (int i = 0; i <wid; i++) {
				widStr+="-";
			}
			widStr+="+";
			
			String higStr="|";
			for (int i = 0; i <wid; i++) {
				higStr+=" ";
			}
			higStr+="|";
			
			System.out.println(widStr);
			for (int i = 0; i <hig; i++) {
				System.out.println(higStr);
			}
			System.out.println(widStr);
			System.out.println();
		}
	}

}
