package cn.stone.String;

import java.util.Scanner;

/**  
 * @ClassName_Main1058--寻找独一无二的数
 * @author_Stone6762  
 * @CreationTime_2014年12月1日 下午11:33:36
 * @Description_
 */
public class Main1058 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		while (scan.hasNext()) {
			int n = scan.nextInt();
			
			if(n==0){
				break;
			}
		
			int sum=0;
			
			for (int nl = 0; nl < n; nl++) {
				sum^=scan.nextInt();
			}
			
			System.out.println(sum);
		}
	}
}
