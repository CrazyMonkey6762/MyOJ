package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1
 * @author_Stone6762
 * @CreationTime_2014年10月17日 下午9:58:36
 * @Description_
 */
public class Main1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()) {
			int count=scan.nextInt();
			for (int i = 0; i < count; i++) {
				String str=scan.next();
				str=str.replaceAll("#", " ");
				int start=0,end=0;
				for (int j = 0; j <str.length(); j++) {
					start=end=i;
					while(str.charAt(end)>'0'&&str.charAt(end)<'9'){
						end++;
					}
					String s=str.substring(start, end);
				
				}
				System.out.println(str);
			}
		}
	}
}
