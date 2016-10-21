package cn.Fan.main2000_2100;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-21
 * @Describe 集合的差
 * 
 */
public class Main2034 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			int n=scan.nextInt();
			int m=scan.nextInt();
			
			if((n>=0&&n<=100)&&(!(m==0&&n==0))&&(m>=0&&m<=100)){
				int arrn[]=new int [n];
				int arrm[]=new int [m];
				int max=0;
				double maxnumb=0;
				
				//实现数据的输入，并获得集合    n   中的最大值
				for (int i = 0; i <n; i++) {
					arrn[i]=scan.nextInt();
					if(arrn[i]>arrn[max]){
						max=i;
					}
				}
				if(arrn[max]>0){
					maxnumb=arrn[max];
				}
			
				for (int i = 0; i <m; i++) {
					max=0;
					arrm[i]=scan.nextInt();
					if(arrm[i]>arrm[max]){
						max=i;
					}
				}
				if(arrm[max]>0){
					maxnumb+=arrm[max];
				}
				
				//循环     m   如果一旦 m 中的元素与 n 中的元素相等，让 n 中的该元素等于mn中的最大值之和；
				int count=0;
				for (int i = 0; i <m; i++) {
					for (int j = 0; j <n; j++) {
						if(arrm[i]==arrn[j]){
							arrn[j]=(int)maxnumb;
							count++;
							break;
						}
					}
				}
				
				
				if(count==n){
					System.out.println("NULL");
				}else{					
					Arrays.sort(arrn);
					for (int i = 0; i <n; i++) {
						if(arrn[i]!=maxnumb){
							System.out.print(arrn[i]+" ");
						}
					}
					System.out.println();
				}

				
				
			}
		}
	}

}
