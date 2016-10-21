package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-26
 * @Describe 统计一片文章中，不同单词的总数
 */
public class Main2072 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String str=scan.nextLine();
			if(str.equals("#")){
				break;
			}else{
				//1.去掉开头的空格
				int sign=0;//标识第一个字母出现的位置
				for (int i = 0; i <str.length(); i++) {
					if(Character.isLetter(str.charAt(i))){
						sign=i;
						break;
					}
				}
				if(sign>=str.length()-1){
				//该行根本没有字母,不做任何处理
				}else{
					
					String newstr="";//这是去掉前面空格后的新字符串
					for (int i =sign; i <str.length(); i++) {
						newstr=newstr+str.charAt(i);
					}
					//2.以空格为标示符来分割,得到单词数组
					String regex=" +";
					String arr[]=newstr.split(regex);
					//3.遍历字符串数组，把相同的单词只保留一个
						for (int i = 0; i<arr.length-1; i++) {
							for (int j= i+1; j<arr.length; j++) {		
								if(arr[i].equals(arr[j])){
									arr[j]="#";//不能直接将arr[j]赋值为空，因为上面的判断中null不能调用方法
								}
							}
						}		
						//4.统计数组中未被标记的单词的个数
						int count=0;
						for (int i = 0; i < arr.length; i++) {
							if(!arr[i].equals("#")){
								count++;
							}
						}
						System.out.println(count);
					
										
				}
			}
		}
	}
}
