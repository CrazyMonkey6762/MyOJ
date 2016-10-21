package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-21
 * @Describe 
 */
public class Main2040 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int M=scan.nextInt();
			if(M>0){
				int a[]=new int[M];
				int b[]=new int[M];
				//数据输入
				for (int i = 0; i <M; i++) {
					a[i]=scan.nextInt();
					b[i]=scan.nextInt();
				}
				
				//遍历进行判断
				for (int i = 0; i <M; i++) {
					//判断a的所有约数的和
					int sum=0;
					for (int j = 1; j <a[i]; j++) {
						if(a[i]%j==0){
							sum=sum+j;
						}
					}
					
					if (sum==b[i]) {
						//判断b的所有约数的
						sum=0;
						for (int j = 1; j <b[i]; j++) {
							if(b[i]%j==0){
								sum=sum+j;
							}
						}
						if(sum==a[i]){
							System.out.println("YES");
						}else{
							System.out.println("NO");
						}
						
						
						
						
						
						
						
					} else {
						System.out.println("NO");
					}
					
					
					
					
					
					
					
					
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
	}

}
