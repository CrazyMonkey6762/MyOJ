package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-23
 * @Describe
 */
public class Main123 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int N=scan.nextInt();
			int result[]=new int [N+1];//��¼ÿ�κϲ�������ϵ��
			int temp[]=new int [N+1];//��Ϊ�м����������ϲ���ʱ���ϵ��
			//��Ϊһ��ʼ��ϵ������   1
			for (int i = 0; i < temp.length; i++) {
				result[i]=1;
			}
			for (int i =2; i <=N; i++) {//�����ϲ����˵ڼ�������
				for (int j = 0; j <=N; j++) {//���Ǿ����ϲ�����ĳ�������ڵĵڼ���
					for (int k = 0; k+j<=N; k+=i) {//��ǰһ�������ڵ�����һ�������һ�������ڵ���������
						temp[j+k] += result[j];//��Ϊ���֮���������ˣ����Ը�ֵ��j+k��
					}
				}
				for (int j = 0; j < temp.length; j++) {//�Ѻϲ�һ�κ�Ľ����ֵ��result�������м�������ʼ��
					result[j]=temp[j];
					temp[j]=0;
				}	
			}
			System.out.println(result[N]);
		}
	}
}
