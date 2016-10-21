package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:		判断一堆数中，其他都出现偶数次，仅仅的一个出现奇数次的那个数
 * @author 范威振
 * @date 2014-4-23
 * @Describe 
 */
public class Main2095 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int s=0;
			while(n!=0){
				int a=scan.nextInt();
				s=s^a;
				n--;
			}
			System.out.println(s);
		}
	}

}
