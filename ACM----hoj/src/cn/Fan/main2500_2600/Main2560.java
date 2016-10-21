package cn.Fan.main2500_2600;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *@2014-5-17ионГ08:58:57
 *@Author:Fan
 *@description
 */

public class Main2560 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int count=scan.nextInt();
			for (int i = 0; i <count; i++) {
				int N=scan.nextInt();
				int min=0;
				int arr[]=new int [N];
				for (int n = 0; n <N; n++) {
					arr[n]=scan.nextInt();
				}
				Arrays.sort(arr);
				System.out.println(arr[1]);
			}
		}
	}

}
