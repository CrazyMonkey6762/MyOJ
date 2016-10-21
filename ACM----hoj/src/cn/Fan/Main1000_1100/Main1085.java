package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * 
 * @2014-5-10上午09:16:13
 * @Author:Fan
 * @description
 */

public class Main1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			//接收这些数据
			int arr[]=new int [6];
			//三种钱币的个数
			arr[1]=scan.nextInt();
			arr[2]=scan.nextInt();
			arr[5]=scan.nextInt();
			if(arr[1]==0&&arr[2]==0&&arr[5]==0){
				break;
			}
			int result[]=new int [100100];//始终存放前面括号里的各项的系数
			int temp[]=new int [100100];//暂时存储相乘后结果的各项的系数
			//确定第一个括号里面的各个项的系数
			
			/**第一个易出错地方————循环条件的起始和终点
			 *  幂必须是0的开始，个数最大必须的等于arr[1]
			 */
			for (int i =0; i <=arr[1]; i++) {//由第一种钱币的个数确定第一个括号内的各项的系数，从
				result[i]=1;
			}
			
			int maxnumber=arr[1]+2*arr[2]+5*arr[5];//在给出所有钱币的个数的同时，我们可以求得能达到的最大的钱币数
			for (int i = 2; i <=3; i++) {//因为总共三个括号，所以是i <=3
				if(i==3){//因为第三种钱币是5分的，为了方便下面的k的递增，所以当i=3时让i=5
					i=5;
				}
				for (int j =0; j <=maxnumber; j++) {
					for (int k = 0,s=0; k+j<=maxnumber&&s<=arr[i];s++,k+=i) {
						/**第二个易出错的地方————表达式的书写
						 * 必须是temp[j+k]+=result[j];
						 * 因为它代表的意义是把    -前面括号中-的第j和-后面括号中-的第k项的乘积与第j+k项的系数相加
						 * （因为后面括号中的第k项的系数是1，所以直接就是把前面括号中的第j项的与第j+k项的系数相加）
						 */
						temp[j+k]+=result[j];
					}
				}
				/**第三个易出错的地方————循环条件的起始和终止
				 * j必须是从等于0开始，从大于maxnumber结束
				 * 因为此步骤代表的是把相乘后的结果赋值给代表着前面系数的数组
				 */
				for (int j = 0; j <=maxnumber; j++) {
					result[j]=temp[j];
					temp[j]=0;
				}
			}
			for (int i =1; i <=maxnumber; i++) {	
				System.out.println(result[i]);
				if(result[i]==0){
					System.out.println(i);
					break;
				}else if(i==maxnumber){
					System.out.println(maxnumber+1);
				}
			}
		}
	}
}
