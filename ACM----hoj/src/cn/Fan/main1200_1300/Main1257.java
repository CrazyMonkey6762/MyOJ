package cn.Fan.main1200_1300;

import java.util.Scanner;

/**
 * 
 * @2014-5-20下午08:23:31
 * @Author:范威振
 * @description
 */

public class Main1257 {

	private static class huo {

		private int high;
		private boolean can;

		public huo(int high, boolean can) {
			super();
			this.high = high;
			this.can = can;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();
			huo arr[] = new huo[count];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new huo(scan.nextInt(), true);
			}
			int sum = 0;// 需要的拦截系统的个数
			int max = 0;
			int t = 0;
			int temp = 0;
			int signs=0;
			boolean flage=false;
			for (int i = 0; i < arr.length; i++) {
				sum++;
				signs=temp;
				while (!arr[signs].can) {
					signs++;
				}
				arr[signs].can=false;
				for (int j = 0; j +signs< arr.length; j++) {
					if(arr[signs+j].can&&arr[signs+j].high<=arr[signs].high){
						arr[j].can=false;
						signs=signs+j;
						j=0;
					}else{
						t++;
						if(t==1){
							temp=j;
						}
					}
				}
				
				
				
				
			}
			System.out.println(sum);
		}
	}

}
