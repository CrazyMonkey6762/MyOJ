package cn.stone.String;

import java.util.Scanner;

/**
 * @Title_Test.java
 * @author_Stone6762
 * @CreationTime_2014年10月20日 下午9:59:35
 * @Description H(1)，C(12)，N(14)，O(16)，F(19)，P(31)，S(32)，K(39)。
 */
public class Test {

	public static void main(String[] args) {
		String str="aba adf  sadfs  df";
		str=str.replaceAll(" +", "%");
		System.out.println(str);
	}
}
