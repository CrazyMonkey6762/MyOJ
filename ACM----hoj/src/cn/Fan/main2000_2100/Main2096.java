package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-23
 * @Describe 
 */
public class Main2096 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int T=scan.nextInt();
			if(T>0){
				int A[]=new int [T];
				int B[]=new int [T];
				
				
				//数据的输入,数据规格化，数据处理
				for (int i = 0; i <T; i++) {
					A[i]=scan.nextInt()%100;
					B[i]=scan.nextInt()%100;
					A[i]=(A[i]+B[i])%100;
				}
				
				//数据输出
				for (int i = 0; i <T; i++) {
					System.out.println(A[i]);
				}
				
				
				
				
				
				
				
			}
		}
	}

}
