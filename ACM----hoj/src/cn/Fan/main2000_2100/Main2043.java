package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-22
 * @Describe ~,!,@,#,$,%,^;
 */
public class Main2043 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int M=scan.nextInt();
//			String str=scan.nextLine();
			if(M>0){
				String arr[]=new String[M];
				//实现数据的输入
				for (int i = 0; i <M; i++) {
//					arr[i]=scan.nextLine();
					arr[i]=scan.next();
				}
				
				//遍历判断每一个字符串
				for (int i = 0; i < arr.length; i++) {
					if(arr[i].length()>=8&&arr[i].length()<=16){		
						boolean signs[]=new boolean[4];
						for (int j = 0; j <arr[i].length(); j++) {						
							if(Character.isLowerCase(arr[i].charAt(j))){
								signs[0]=true;
							}else if(Character.isUpperCase(arr[i].charAt(j))){
								signs[1]=true;
							}else if(Character.isDigit(arr[i].charAt(j))){
								signs[2]=true;
							}else if(arr[i].charAt(j)=='~'||arr[i].charAt(j)=='!'||arr[i].charAt(j)=='@'||arr[i].charAt(j)=='#'||arr[i].charAt(j)=='$'||arr[i].charAt(j)=='%'||arr[i].charAt(j)=='^'){
								signs[3]=true;
							}
						}
						int count=0;//判断种类
						for (int j=0; j<4; j++) {
							if(signs[j]){
								count++;
							}
						}
						if(count>=3){
							System.out.println("YES");
						}else{
							System.out.println("NO");
						}
						
						
					}else{
						System.out.println("NO");
					}
					
				}
			}
		}
	}
}
