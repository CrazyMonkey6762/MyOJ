package cn.Fan.Main1000_1100;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *@2014-5-14����08:58:09
 *@Author:Fan
 *@description
 */

public class Main1031 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();//�����˶�������
			int M=scan.nextInt();//�������м���ͼ��
			int k=scan.nextInt();//����ĸ���
			
			double sum[]=new double [M];
			int temps[]=new int [k];
			//��������,�����
			for (int i = 0; i <n; i++) {
				for (int j =0; j <M; j++) {
					double tems=scan.nextDouble();
					sum[j]+=tems;
				}
			}
			//�ҵ�Ҫ���ͼ��
			for (int i =0; i <k; i++) {
				int max=0;
				for (int j =0; j <M; j++) {
					if(sum[j]>sum[max]){
						max=j;
					}
				}
				sum[max]=0;
				temps[i]=max+1;
			}
			//��������������
			Arrays.sort(temps);
			for (int i =k-1; i>=0; i--) {
				if(i==k-1){
					System.out.print(temps[i]);	
				}else{
					System.out.print(" "+temps[i]);
				}
			}
			System.out.println();
			
			
		}
	}

}
