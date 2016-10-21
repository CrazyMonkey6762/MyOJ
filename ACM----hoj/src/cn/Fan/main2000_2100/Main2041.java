package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-22
 * @Describe 假设，我在第   M 个 阶梯上，那么我可能是从第 M-1  上来的，也可能是从   M-2上来的，
 * 			所以，我到第   M个阶梯上的 方法总数===f（M-1）+f（M-2）
 * 
 * 			方法一、调用函数，也就是递归，好写，时间长
 * 			方法二、用数组 存储到  第   i  个阶梯的方法
 * 			
 */
public class Main2041 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int N=scan.nextInt();
			if (N>0) {
			int arr[]=new int[N];	
			//实现数据的输入
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scan.nextInt();
			}
			//遍历，对每个数据进行处理	
			for (int i = 0; i < arr.length; i++) {
				int ars[]=new int[arr[i]+1];
				for (int j =1; j <=arr[i]; j++) {
					if(j==1||j==2){
						ars[j]=1;
					}else{
						ars[j]=ars[j-1]+ars[j-2];
					}
				}
				System.out.println(ars[arr[i]]);

			}

			}
		}
	}
}
