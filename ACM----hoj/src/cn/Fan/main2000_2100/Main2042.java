package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
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
				//ʵ�����ݵ�����
				for (int i = 0; i < a.length; i++) {
					a[i]=scan.nextInt();
				}
				//����    ��ÿ�����ݽ��д���
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
