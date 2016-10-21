package cn.stone.simulate;

import java.util.Scanner;

/**  
 * @ClassName_Main1012
 * @author_Stone6762  
 * @CreationTime_2014年12月13日 下午11:31:10
 * @Description_
 */
public class Main1012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double curr=scan.nextDouble();
			double max=0,t;
			for (int i = 0; i < 12; i++) {
				t=scan.nextDouble();
				if(t>max){
					max=t;
				}
			}
			curr*=max;
			System.out.printf("%.2f\n",curr);
		}
	}

}
