package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-18
 * @Describe 
 */
public class Main2026 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			
			//1.��ȡ�����ָ�
			String str=scan.nextLine();
			String arr[]=str.split(" ");
			
			//��ÿ�����ʽ��д���Ȼ������µ��ַ���
			String newstr="";
			for (int i = 0; i < arr.length; i++) {
				String s="";//��ȡÿ�����ʳ�ȥ����ĸ�������ĸ
				char c;//��ȡÿ�����ʵ�����ĸ�Ĵ�д			
				
				//��ȡÿ�����ʵ�����ĸ�Ĵ�д			
				if(arr[i].charAt(0)>='a'&&arr[i].charAt(0)<='z'){
					 c=(char)(arr[i].charAt(0)-32);
				}else{
					 c=arr[i].charAt(0);
				}
				/**
				 * ��ʱarr[i].charAt(0)��õ���һ���ַ����������Ը����޷�������и�ֵ������ֻ���ǽ���ƴ��
				 */
				//��ȡÿ�����ʳ�ȥ����ĸ�������ĸ
				for (int j = 1; j <arr[i].length(); j++) {
					s=s+arr[i].charAt(j);
				}
				//ƴ�ӳ�һ�������ĵ���
				s=c+s;
				
				//ƴ�ӳ�һ�������ģ������������ַ���
				if(i==0){
					newstr=s;
				}else{
					newstr=newstr+" "+s;
				}
			}
			System.out.println(newstr);
		}
	}

}
