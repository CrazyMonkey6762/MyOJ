package cn.Fan.main2000_2100;

import java.util.Scanner;

public class Main2023 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int m=scan.nextInt();
			if(n>0&&n<=50&&m>0&&m<=5){
				double arr[][]=new double[n+1][m+1];
				int countNum=0,count=0;
				
				//ʵ���������ÿ���˳ɼ���ƽ���������ڵ�     m+1    ��
				for (int i = 0; i <n; i++) {
					for (int j = 0; j <m; j++) {
						arr[i][j]=scan.nextDouble();
						arr[i][m]+=arr[i][j];
					}
					arr[i][m]/=m;
				}
				//��ÿһ�Ƶ�ƽ���������ڵ�n+1��
				for (int i = 0; i <m; i++) {
					for (int j = 0; j <n; j++) {
						arr[n][i]+=arr[j][i];
					}
					arr[n][i]/=n;
				}
				
				//��ÿ�ƶ�����ƽ��ֵ��ѧ����
				for (int i = 0; i <n; i++) {
					count=0;
					for (int j = 0; j <m; j++) {
						if(arr[i][j]>=arr[n][j]){
							count++;
						}
					}
					if(count==m){
						countNum++;
					}
				}
				//���:��һ�а���n�����ݣ���ʾn��ѧ����ƽ���ɼ������������λС����
				for (int i = 0; i <n; i++) {
					if(i==0){
						System.out.printf("%.2f",arr[i][m]);
					}else{
						System.out.print(" ");
						System.out.printf("%.2f",arr[i][m]);
					}
				}
				System.out.println();
				//�ڶ��а���m�����ݣ���ʾm�ſε�ƽ���ɼ�
				for (int i = 0; i <m; i++) {
					if(i==0){
						System.out.printf("%.2f",arr[n][i]);	
					}else{
						System.out.print(" ");
						System.out.printf("%.2f",arr[n][i]);	
					}
					
				}
				System.out.println();
				System.out.println(countNum);
				//Ҫ��ÿ������ʵ���䶼�п��У����Ա�������������
				System.out.println();
	
			}
		}	
	}

}
