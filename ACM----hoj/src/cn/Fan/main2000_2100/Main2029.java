package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-20
 * @Describe 
 */
public class Main2029 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){	
			int n=scan.nextInt();
			String arr[]=new String[n];
			if(n>0){
				String str="";
				//ʵ�����ݵ�����
				for (int i = 0; i < arr.length; i++) {
					arr[i]=scan.next();
				}
				
				//�������飬��ÿһ���ַ������д�����ж�
				for (int i = 0; i <arr.length; i++) {
					
					int sign=arr[i].length()/2;//ȷ���ȽϵĴ���
					//�����ַ���
					for (int j = 0; j <sign; j++) {
						if(arr[i].charAt(j)!=arr[i].charAt(arr[i].length()-1-j)){//ͷβ��Ȳ�������һ�����ֲ���Ⱦ�����
							str="no";
							break;
						}
						if(j==sign-1){//������еıȽ�֮����ȣ����ǻ�����
							str="yes";
						}
					}
					System.out.println(str);
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}	
	}

}
