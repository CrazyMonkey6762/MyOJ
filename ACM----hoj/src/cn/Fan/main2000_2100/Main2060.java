package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * 
 * @2014-5-20ÉÏÎç10:46:41
 * @Author:·¶ÍþÕñ
 * @description
 */

public class Main2060 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();
			for (int m = 0; m < count; m++) {
				int left = scan.nextInt();
				int score = scan.nextInt();
				int max = scan.nextInt();
				if (left > 6) {
					score += (left - 6) * 8 + 2 + 3 + 4 + 5 + 6 + 7;
				} else if (left <= 6) {
					switch (left) {
					case 6:
						score += 2 + 3 + 4 + 5 + 6 + 7;
						break;
					case 5:
						score += 3 + 4 + 5 + 6 + 7;
						break;
					case 4:
						score += 4 + 5 + 6 + 7;
						break;
					case 3:
						score += 5 + 6 + 7;
						break;
					case 2:
						score += 6 + 7;
						break;
					case 1:
						score += 7;
						break;
					default:
						break;
					}
				}
				if(score>=max){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
				
				
				
				
				
				
				
				
			}
		}
	}
}
