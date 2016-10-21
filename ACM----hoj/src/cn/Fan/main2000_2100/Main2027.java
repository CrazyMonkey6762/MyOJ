package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-20
 * @Describe 统计每一个字符串中元音字母的个数
 */
public class Main2027 {
 
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			int n=scan.nextInt();
			String sign=scan.nextLine();//吸收掉回车符产生的效果
			
			if(n>0){	
				String arr[]=new String[n];
				//获取所有的数据
				for (int j = 0; j < arr.length; j++) {
					arr[j]=scan.nextLine();	
				}
				
				//对每一个数据进行分析
				for (int j = 0; j < arr.length; j++) {
					int a,e,i,o,u;
					a=e=i=o=u=0;
					//分别取字符串中的每一个字符
					for (int m = 0; m <arr[j].length(); m++) {
						switch(arr[j].charAt(m)){
						case 'a':
							a++;
							break;
						case 'e':
							e++;
							break;
						case 'i':
							i++;
							break;
						case 'o':
							o++;
							break;
						case 'u':
							u++;
							break;
						}
					}
					System.out.println("a:"+a);
					System.out.println("e:"+e);
					System.out.println("i:"+i);
					System.out.println("o:"+o);
					System.out.println("u:"+u);
					if(j<n-1){
						System.out.println();
					}
				}
				
			}
		}
	}

}
