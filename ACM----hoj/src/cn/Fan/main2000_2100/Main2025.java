package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-18
 * @Describe    
 * 
 * ��Ҫ���ַ����в���ĳ���ַ���
 * 
 * һ�������ĳ���ַ�Ϊ��ʶ    
 *  ֻ����ͨ�������ַ��������е��ַ���ƥ���
 *  �����µ��ַ���
 *
 * ���������ĳ���ַ���Ϊ��ʶ
 *	����ֱ���滻����  ����ʶ+Ҫ������ַ����� ���滻����ʶ�� 
 */
public class Main2025 {
	private static final String sigh="(max)";

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String str=scan.next();
			int max=0;
			//�ҵ��ַ�������ĸ�����ֵ
			for (int i=0; i <str.length(); i++) {
				if(str.charAt(i)>str.charAt(max)){
					max=i;
				}
			}
			//�����������ַ�������ĸ�����ֵʱ������һ��(max);
			String newstr="";
			for (int i = 0; i <str.length(); i++) {
				if(str.charAt(i)==str.charAt(max)){
					newstr=newstr+str.charAt(i)+sigh;
				}else{
					newstr=newstr+str.charAt(i);
				}
			}
			System.out.println(newstr);
			
		}
	}

}
