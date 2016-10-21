package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-9
 * @Describe 100 50 10 5 2 1
 */
public class Main2021 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int count = 0;//因为不是成员属性，所以如果想对其进行操作，必须对其进行赋值，因为赋值的过程也是分配空间的过程，如果不赋值，只是声明了一个int类型的引用
		while(scan.hasNext()){
		int n=scan.nextInt();
		if(n>0){
			int arr[]=new int[n];
			for (int i = 0; i <n; i++) {
				arr[i]=scan.nextInt();
				int bai=arr[i]/100;
				int wushi=arr[i]%100/50;
				int shi=arr[i]%50/10;
				int wu=arr[i]%10/5;
				int er=arr[i]%10%5/2;
				int yi=arr[i]%10%5%2;
				count=bai+wushi+shi+wu+er+yi+count;
			}
			System.out.println(count);	
		}
		}
		
	}

}
