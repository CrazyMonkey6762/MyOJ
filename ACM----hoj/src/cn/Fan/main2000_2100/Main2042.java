package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-22
 * @Describe 
 */
public class Main2042 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int N=scan.nextInt();
			if(N>0){
				int a[]=new int[N];
				//实现数据的输入
				for (int i = 0; i < a.length; i++) {
					a[i]=scan.nextInt();
				}
				//遍历    对每个数据进行处理
				for (int i = 0; i < a.length; i++) {
					int sum=3;
					for (int j = 0; j <a[i]; j++) {
						sum=(sum-1)*2;
					}
					System.out.println(sum);
				}		
			}			
		}
	}

}
