package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1039-------词组缩写
 * @author_Stone6762
 * @CreationTime_2014年12月1日 下午11:22:26
 * @Description_一个词组中每个单词的首字母的大写组合称为该词组的缩写
 */
public class Main1039 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			
			String s = scan.nextLine();
		
			for (int nl = 0; nl < n; nl++) {
				String str = scan.nextLine();
				String arr[] = str.split(" +");
				String aim = "";
			
				for (int i = 0; i < arr.length; i++) {
					aim += arr[i].charAt(0);
				}
				
				System.out.println(aim.toUpperCase());
			}
		}
	}
}
