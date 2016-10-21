package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
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
				//实现数据的输入
				for (int i = 0; i < arr.length; i++) {
					arr[i]=scan.next();
				}
				
				//遍历数组，对每一个字符串进行处理和判断
				for (int i = 0; i <arr.length; i++) {
					
					int sign=arr[i].length()/2;//确定比较的次数
					//遍历字符串
					for (int j = 0; j <sign; j++) {
						if(arr[i].charAt(j)!=arr[i].charAt(arr[i].length()-1-j)){//头尾相等不做处理，一旦出现不相等就跳出
							str="no";
							break;
						}
						if(j==sign-1){//如果所有的比较之后都相等，就是回文数
							str="yes";
						}
					}
					System.out.println(str);
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}	
	}

}
