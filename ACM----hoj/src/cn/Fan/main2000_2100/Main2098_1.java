package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:��һ���㷨��������������������������������ʱ��������
 * @author ������
 * @date 2014-4-23
 * @Describe 
 */
public class Main2098_1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n<=0){
				break;
			}else if(n<3){
				System.out.println(0);
			}else{
				int arr[]=new int [n+1];
				//1.�ҵ� n �� ���е�����
				arr[3]=1;
				for (int i=3; i <n;i=i+2) {
					boolean flag=true;
					for (int j=3; j<i; j=j+2) {
						if(i%j==0){
							flag=false;
							break;
						}
					}
					if(flag){
						arr[i]=1;
					}
				}
				
				//2.ͳ������
				int count=0;
				for (int i=3; i<n/2; i=i+2) {
					if(arr[i]==1&&arr[n-i]==1){
						count++;
					}
				}
				System.out.println(count);				
			}
		}
	}
}
