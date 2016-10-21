package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-23
 * @Describe 一个不知道后两位的数，能被一个整数整除，求所有满足这个问题的尾数
 */
public class Main2099 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			//数据输入
			int a=scan.nextInt();
			int b=scan.nextInt();
				
			if(!(a==0&&b==0)){
				int temp=a*100;
				int count=0;
				for (int i = 0;i<100; i++) {
					int signs=temp+i;
					//满足条件就输出
					if(signs%b==0){
						count++;
					if(count==1){
						System.out.printf("%02d",i);
					}else if(count>1){
						System.out.print(" ");
						System.out.printf("%02d",i);
						}
							
					}
				}
					System.out.println();
			}
			
		}
	}

}
