package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-20
 * @Describe 
 * 		方法一、从最大的开始，每次增加一个最大的，知道满足可以除尽所有的数为止
 */
public class Main2028 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			int n=scan.nextInt();
			if(n>0){
				
				int arr[]=new int[n];
				int max=0;
				//实现数据的输入，并求得最大值
				for (int i = 0; i < arr.length; i++) {
					arr[i]=scan.nextInt();
					//求得最大值和最小值
					if(arr[i]>max){
						max=arr[i];
					}
				}
				//从最大值开始依次增加,确保可以把所有的数除尽
				for (int i=max;;i=i+max) {
					boolean flag=true;
					for (int j=0; j <n; j++) {
						if(i%arr[j]!=0){
							flag=false;//如果有一个不能除尽，就不会跳出循环，也不会输出 i
							break;
						}
					}
					if(flag){//只有当所有的都满足，都可以除尽时，才会跳出循环体，才会输出
						System.out.println(i);
						break;
					}
					
					
				}

				
				
				
				
			}
		}
	}

}
