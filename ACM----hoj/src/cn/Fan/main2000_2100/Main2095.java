package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:		�ж�һ�����У�����������ż���Σ�������һ�����������ε��Ǹ���
 * @author ������
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
