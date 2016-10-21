package cn.Fan.main2100_2200;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-6-6
 * @Describe 100000 60488378454
 */
public class Main2132 {

	public static void main(String[] args) {
		BigInteger arr[] = new BigInteger[100003];
		arr[0] = BigInteger.ZERO;
		for (int i = 1; i < arr.length; i++) {
			if (i % 3 == 0) {
				BigInteger temp = BigInteger.valueOf(i)
						.multiply(BigInteger.valueOf(i))
						.multiply(BigInteger.valueOf(i));
				arr[i] = arr[i - 1].add(temp);
			} else {
				arr[i] = arr[i - 1].add(BigInteger.valueOf(i));
			}

		}
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n < 0) {
				break;
			}
			System.out.println(arr[n]);

		}
	}

}
