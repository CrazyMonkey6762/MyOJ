package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-18
 * @Describe 
 */
public class Main2026 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			
			//1.获取，并分割
			String str=scan.nextLine();
			String arr[]=str.split(" ");
			
			//对每个单词进行处理，然后组成新的字符串
			String newstr="";
			for (int i = 0; i < arr.length; i++) {
				String s="";//获取每个单词除去首字母以外的字母
				char c;//获取每个单词的首字母的大写			
				
				//获取每个单词的首字母的大写			
				if(arr[i].charAt(0)>='a'&&arr[i].charAt(0)<='z'){
					 c=(char)(arr[i].charAt(0)-32);
				}else{
					 c=arr[i].charAt(0);
				}
				/**
				 * 此时arr[i].charAt(0)获得的是一个字符常量，所以根本无法对其进行赋值，所以只能是进行拼接
				 */
				//获取每个单词除去首字母以外的字母
				for (int j = 1; j <arr[i].length(); j++) {
					s=s+arr[i].charAt(j);
				}
				//拼接成一个完整的单词
				s=c+s;
				
				//拼接成一个完整的，经过处理后的字符串
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
