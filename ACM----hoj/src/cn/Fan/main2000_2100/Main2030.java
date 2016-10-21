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
			String st=scan.nextLine();//消除回车符的影响
			String arr[]=new String [n];
			
			//实现数据的输入
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scan.nextLine();
			}
			
			//遍历数组，处理每一个字符串
			for (int i = 0; i < arr.length; i++) {
				
				int count=0;
				//遍历字符串，判断每一个字符
				for (int j = 0; j <arr[i].length(); j++) {
					/*
					 * 如何判断一个字符是不是汉字？
					 * 因为一个汉字是占两个字节的
					 * 
					 * 首先把单个字符转变成封装的字符对象，然后转成字符串对象，
					 * 然后调用字符串的方法，转成字节数组，看字节数组的长度
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
