package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-4-29
 * @Describe 
 */
public class Main2074 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			char inSigns=scan.next().charAt(0);
			char outSigns=scan.next().charAt(0);
			
			int count=(n-1)/2;
			for (int i =-count; i <=count; i++) {
				for (int j =-count; j <=count; j++) {
					if(j%2==0||i%2==0){
						System.out.print(inSigns);
					}
					if(j%2==1||i%2==1){
						System.out.print(outSigns);
					}
				}
				System.out.println();
			}
			
		}
	}

}
