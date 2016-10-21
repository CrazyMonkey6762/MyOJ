package cn.Fan.prictice;

import java.math.BigInteger;
import java.util.Scanner;

/**  
 * @ClassName_Main1002
 * @author_Stone6762  
 * @CreationTime_2015年9月3日 上午8:43:05
 * @Description_
 */
public class Main1002 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()) {
			int tN=scan.nextInt();
			for (int j = 1; j <= tN; j++) {
				BigInteger a=scan.nextBigInteger();
				BigInteger b=scan.nextBigInteger();
				System.out.println("Case "+j+":");
				System.out.println(a+" + "+b+" = "+a.add(b));
				if(j!=tN){
					System.out.println();
				}
			}
			
		}
	}
}
