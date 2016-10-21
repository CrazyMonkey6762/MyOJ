package cn.Fan.main2000_2100;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-23
 * @Describe
 */
public class Main2094 {
	private static class Person {
		String name;
		int sorce;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			Person persons[]=new Person[2*n];
			int count=0;
			// 1.把所有的信息先保存到程序中,并确定的到底有多少选手
			String arr[][] = new String[n][2];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 2; j++) {
					arr[i][j] = scan.next();
					boolean flag=true;
					for (int x = 0; x < i; x++) {
						for (int y = 0; y < 2; y++) {
							if (arr[i][j].equals(arr[x][y])) {
								flag=false;
								break;
							}
						}
					}
					if(flag){
						count++;
						persons[i].name=arr[i][j];
					}
				}
			}
			for (int i = 0;i<n; i++) {
				int min=0,max=0;
				for (int j = 0; j <count; j++) {
					if(arr[i][0].equals(persons[j].name)){
						max=j;
					}
					if(arr[i][1].equals(persons[j].name)){
						min=j;
					}
					persons[max].sorce=persons[min].sorce+1;
					persons[min].sorce--;
					
				}
			}
			
			
			
			
			
			
			
			
			
			
			

		}

	}

}
