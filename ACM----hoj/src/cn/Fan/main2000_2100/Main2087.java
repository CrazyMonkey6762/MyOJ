package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-26
 * @Describe 看在一个长字符串中	出现	某段	短字符串的		次数
 */
public class Main2087 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			//数据输入
			String str=scan.next();
			if(str.equals("#")){
				break;
			}
			String sign=scan.next();
			
				int count=0;//统计匹配成功的个数————计数器
				for (int i = 0; i <str.length(); i++) {
					boolean flag=true;//判断是否匹配成功
					
					//直接从字符串的长度来判断是否可能出现匹配的情况
					if(i+sign.length()>str.length()){
						break;
					}
					//首先找到要匹配的字符串的第一个字符相同的位置
					if(str.charAt(i)==sign.charAt(0)){
						//遍历要找的字符串
						for (int j=1; j <sign.length(); j++) {
							//有一个字符不满足相等都不算匹配，标识匹配的flag=false，下面的继续遍历就没有必要了，所以break
							if(str.charAt(i+j)!=sign.charAt(j)){
								flag=false;
								break;
							}
						}
						/*
						 * 如果成功匹配， 
						 * 	① 那么计数器加一    ②i=i+sign.length()-1;
						 */
						if(flag){
							i=i+sign.length()-1;
							count++;
						}	
					}
				}
				System.out.println(count);					
		}
	}
}
