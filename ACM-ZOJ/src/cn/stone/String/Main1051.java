package cn.stone.String;

import java.util.Scanner;

/**  
 * @ClassName_Main1051
 * @author_Stone6762  
 * @CreationTime_2015��1��24�� ����9:14:11
 * @Description_
 * ��1����1��Ϊ��A����2��Ϊ��B����...��26��Ϊ��Z����
��2������#����Ϊһ���ո�
��3�����ԡ�-����ԭʼ�ż��С�-�����������ָ����֡�
 */
public class Main1051 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n=scan.nextInt();
			for (int i = 0; i <n; i++) {
				String temp=scan.next();
				String re=trans(temp);
				System.out.println(re);
			}
		}
	}

	/** 
	 * @Description: TODO( ����һ���ַ�����ת�� )
	 * @param str
	 * @return
	 */
	private static String trans(String str) {
		char c1=' ',c2=' ';
		for (int i = 0; i < str.length(); i++) {
			c1=str.charAt(i);
			if(Character.isDigit(c1)){
				if(i+1<str.length()&&(Character.isDigit(c2=str.charAt(i+1)))){
					str=trans2Letter(str,""+c1+c2);
				}else{
					str=trans2Letter(str,""+c1);
				}
			}
		}
		str=str.replaceAll("#", " ").replaceAll("-", "");
		return str;
	}

	/** 
	 * @Description: TODO(�������滻�ɵ����ַ�  )
	 * @param strs
	 * @param st
	 * @return
	 */
	private static String trans2Letter(String strs, String st) {
		int signs=Integer.valueOf(st)-1;
		char result=(char) ('A'+signs);
		return strs.replaceFirst(st, ""+result);
	}

}
