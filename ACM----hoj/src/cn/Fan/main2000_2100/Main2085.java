package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-4-26
 * @Describe 
 */
public class Main2085 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			int n=scan.nextInt();
			if(n==-1){
				break;
			}
			int high=1,di=0;
			int highs=0,dis=0;
			for (int i=0; i <n; i++) {
				highs=3*high+2*di;
				dis=high+di;
				high=highs;
				di=dis;
			}
			System.out.println(high+","+di);
			
		}
	}

}
