package cn.Fan.main1300_1400;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-7
 * @Describe
 */
public class Main1389 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int sum = scan.nextInt();
			if(sum<=0){
				break;
			}
			int result[] = new int[sum + 1];
			int temp[]=new int [sum+1];
			for (int i = 0; i <result.length; i++) {
				result[i]=1;
			}
			for (int i =2; i*i<=sum; i++) {
				for (int j = 0; j <=sum; j++) {
					for (int k = 0; k+j <=sum; k+=i*i) {
						temp[j+k]+=result[j];
					}
				}
				
				for (int j = 0; j <=sum; j++) {
					result[j]=temp[j];
					temp[j]=0;
				}

			}
			System.out.println(result[sum]);
			
			
			
			
			
			
			
		}
	}
}
