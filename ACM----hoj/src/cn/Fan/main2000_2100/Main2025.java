package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-18
 * @Describe    
 * 
 * 想要在字符串中插入某个字符串
 * 
 * 一、如果以某个字符为标识    
 *  只能是通过遍历字符串中所有的字符，匹配后
 *  生成新的字符串
 *
 * 二、如果以某个字符串为标识
 *	可以直接替换，以  “标识+要插入的字符串” 来替换“标识” 
 */
public class Main2025 {
	private static final String sigh="(max)";

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String str=scan.next();
			int max=0;
			//找到字符串中字母的最大值
			for (int i=0; i <str.length(); i++) {
				if(str.charAt(i)>str.charAt(max)){
					max=i;
				}
			}
			//遍历，遇到字符串中字母的最大值时，插入一个(max);
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
