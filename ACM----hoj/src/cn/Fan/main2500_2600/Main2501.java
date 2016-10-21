package cn.Fan.main2500_2600;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-19
 * @Describe 
 */
public class Main2501 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()) {
			int signs=scan.nextInt();
			String str="";
			while(signs!=0){
				int temp=signs%2;
				str=""+temp+str;
				signs=signs/2;
			}
			System.out.println(str);
			
		}
	}

}
