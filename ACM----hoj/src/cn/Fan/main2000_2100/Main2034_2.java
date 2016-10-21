package cn.Fan.main2000_2100;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Describe    
 * @author ·¶ÍþÕñ
 * @date 2014-4-20
 * 
 */
public class Main2034_2 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			int n=scan.nextInt();
			int m=scan.nextInt();
			
			if((n>=0&&n<=100)&&(!(m==0&&n==0))&&(m>=0&&m<=100)){
				int arrn[]=new int [n];
				int arrm[]=new int [m];
				//ÊµÏÖÊäÈë
				for (int i = 0; i <n; i++) {
					arrn[i]=scan.nextInt();
				}
				
				for (int i = 0; i <m; i++) {
					arrm[i]=scan.nextInt();
				}
				
				Arrays.sort(arrn);
				int count=0;
				
				for (int i = 0; i <n; i++) {
					for (int j = 0; j <m; j++) {
						if(arrn[i]==arrm[j]){
							break;
						}		
						if(j==m-1){
							count++;
							System.out.print(arrn[i]+" ");
						}
						
					}
				}
				
				if (count==0) {
					System.out.println("NULL");
				} else {
					System.out.println();
				}
				
				
			}
		}
	}
}
