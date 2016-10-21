package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1048--字符串反转
 * @author_Stone6762
 * @CreationTime_2014年12月1日 下午11:26:13
 * @Description_
 */
public class Main1048 {
	
	/**
	 * @Describe_将一个字符串数组变成一个字符串_两个字符串中间穿插上指定的字符
	 * @Author_Stone6762
	 * @param arr字符串数组
	 * @param c中间想要插入的字符
	 * @return
	 */
	private static String strArr2Str(String[] arr, char c) {
		String aim = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				aim += arr[i];
				continue;
			}
			aim += c + arr[i];
		}

		return aim;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			String ts = scan.nextLine();
		
			for (int nl = 0; nl < n; nl++) {
				String aim = "";
				String[] arr = scan.nextLine().split(" ");
			
				for (int i = 0; i < arr.length; i++) {
					String t = "";
				
					for (int j = arr[i].length() - 1; j >= 0; j--) {
						t += arr[i].charAt(j);
					}
					
					arr[i] = t;
				}
		
				System.out.println(strArr2Str(arr, ' '));
			}
		}
	}

}
