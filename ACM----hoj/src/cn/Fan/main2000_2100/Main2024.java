package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-18
 * @Describe    c语言标识：只能是字母，数字，下划线
 * 						数字不能开头
 * 
 * 
 * 第一步：判断首字符是不是字母和下划线
 * 第二步：如果不是，进行遍历，判断是不是字母，数字，下划线
 */
public class Main2024 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n>0){
				String arr[]=new String[n];
				String s=scan.nextLine();//消除回车符
				//实现数据的输入
				for (int i = 0; i < arr.length; i++) {
					arr[i]=scan.nextLine();
				}
				//遍历
				for (int i = 0; i < arr.length; i++) {
					
					if(!Character.isLetter(arr[i].charAt(0))&&arr[i].charAt(0)!='_'){
						System.out.println("no");
					}else{
						for (int j = 0; j <arr[i].length(); j++) {
							char ch=arr[i].charAt(j);
							if(!(Character.isLetterOrDigit(ch)||ch=='_')){
								System.out.println("no");
								break;
							}
							if(j==arr[i].length()-1){
								System.out.println("yes");
							}
						}
					}
				}
				
			}
		}
		
	}

}
