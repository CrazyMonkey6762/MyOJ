package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
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
				
				
				//���ݵ�����,���ݹ�񻯣����ݴ���
				for (int i = 0; i <T; i++) {
					A[i]=scan.nextInt()%100;
					B[i]=scan.nextInt()%100;
					A[i]=(A[i]+B[i])%100;
				}
				
				//�������
				for (int i = 0; i <T; i++) {
					System.out.println(A[i]);
				}
				
				
				
				
				
				
				
			}
		}
	}

}
