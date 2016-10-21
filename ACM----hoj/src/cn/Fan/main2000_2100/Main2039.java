package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-21
 * @Describe 
 */
public class Main2039 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int M=scan.nextInt();
			if(M>0){
				int a[]=new int[M];
				int b[]=new int[M];
				int c[]=new int[M];
				//数据输入
				for (int i = 0; i <M; i++) {
					a[i]=scan.nextInt();
					b[i]=scan.nextInt();
					c[i]=scan.nextInt();
				}
				//数据判断
				for (int i = 0; i <M; i++) {
					if(a[i]<=0||b[i]<=0||c[i]<=0||a[i]>=1000||b[i]>=100||c[i]>=1000){
						System.out.println("NO");
					}else{
						if(a[i]+b[i]>c[i]&&a[i]-b[i]<c[i]&&a[i]+c[i]>b[i]&&a[i]-c[i]<b[i]&&c[i]+b[i]>a[i]&&c[i]-b[i]<a[i]){
							System.out.println("YES");
						}else{
							System.out.println("NO");
						}
					}
				}
			}
	
		}
	}

}
