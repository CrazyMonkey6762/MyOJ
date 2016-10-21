package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-9
 * @Describe 
 */
public class Main2022 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext()){
		int m=scan.nextInt();
		int n=scan.nextInt();
		if (m>0&&n>0) {
			int x=0,y=0;
			int arr[][]=new int [m][n];
			for (int i = 0; i <m; i++) {
				for (int j = 0; j<n; j++) {
					arr[i][j]=scan.nextInt();
					//找到绝对值大的下标
					if (Math.abs(arr[i][j])>Math.abs(arr[x][y])) {
						x=i;
						y=j;
						//如果绝对值相同，下标选择行最小的，如果行也相同，选列最小的
					}
				}
			}
		System.out.println((x+1)+" "+(y+1)+" "+arr[x][y]);
			
			}
		}
	}

}
