package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-9
 * @Describe 100 50 10 5 2 1
 */
public class Main2021 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int count = 0;//��Ϊ���ǳ�Ա���ԣ���������������в��������������и�ֵ����Ϊ��ֵ�Ĺ���Ҳ�Ƿ���ռ�Ĺ��̣��������ֵ��ֻ��������һ��int���͵�����
		while(scan.hasNext()){
		int n=scan.nextInt();
		if(n>0){
			int arr[]=new int[n];
			for (int i = 0; i <n; i++) {
				arr[i]=scan.nextInt();
				int bai=arr[i]/100;
				int wushi=arr[i]%100/50;
				int shi=arr[i]%50/10;
				int wu=arr[i]%10/5;
				int er=arr[i]%10%5/2;
				int yi=arr[i]%10%5%2;
				count=bai+wushi+shi+wu+er+yi+count;
			}
			System.out.println(count);	
		}
		}
		
	}

}
