package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author Stone
 * @date 2014-4-20
 * @Describe 
 */
public class Main2030 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			int n=scan.nextInt();
			String st=scan.nextLine();//�����س�����Ӱ��
			String arr[]=new String [n];
			
			//ʵ�����ݵ�����
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scan.nextLine();
			}
			
			//�������飬����ÿһ���ַ���
			for (int i = 0; i < arr.length; i++) {
				
				int count=0;
				//�����ַ������ж�ÿһ���ַ�
				for (int j = 0; j <arr[i].length(); j++) {
					/*
					 * ����ж�һ���ַ��ǲ��Ǻ��֣�
					 * ��Ϊһ��������ռ�����ֽڵ�
					 * 
					 * ���Ȱѵ����ַ�ת��ɷ�װ���ַ�����Ȼ��ת���ַ�������
					 * Ȼ������ַ����ķ�����ת���ֽ����飬���ֽ�����ĳ���
					 */
					int lengthc=Character.valueOf(arr[i].charAt(j)).toString().getBytes().length;
					if(lengthc==2){
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}
