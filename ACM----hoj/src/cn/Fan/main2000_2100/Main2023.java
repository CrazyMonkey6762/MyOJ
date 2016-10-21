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
				
				//实现输入和求每个人成绩的平均数，放在第     m+1    列
				for (int i = 0; i <n; i++) {
					for (int j = 0; j <m; j++) {
						arr[i][j]=scan.nextDouble();
						arr[i][m]+=arr[i][j];
					}
					arr[i][m]/=m;
				}
				//求每一科的平均数，放在第n+1行
				for (int i = 0; i <m; i++) {
					for (int j = 0; j <n; j++) {
						arr[n][i]+=arr[j][i];
					}
					arr[n][i]/=n;
				}
				
				//求每科都大于平均值的学生数
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
				//输出:第一行包含n个数据，表示n个学生的平均成绩，结果保留两位小数；
				for (int i = 0; i <n; i++) {
					if(i==0){
						System.out.printf("%.2f",arr[i][m]);
					}else{
						System.out.print(" ");
						System.out.printf("%.2f",arr[i][m]);
					}
				}
				System.out.println();
				//第二行包含m个数据，表示m门课的平均成绩
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
				//要求每个测试实例间都有空行，所以必须加上这个空行
				System.out.println();
	
			}
		}	
	}

}
