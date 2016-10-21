package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-20
 * @Describe 两个时间相加
 */
public class Main2033 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int N = scan.nextInt();
			if (N > 0) {
				// 实现数据的输入，并把和的结果放在A 中
				for (int i = 0; i < N; i++) {
					int AH = scan.nextInt();
					int AM = scan.nextInt();
					int AS = scan.nextInt();
					int BH = scan.nextInt();
					int BM = scan.nextInt();
					int BS = scan.nextInt();
					AH += BH;
					AM += BM;
					AS += BS;
					if (AS >= 60) {
						AS %= 60;
						AM++;
					}
					if (AM >= 60) {
						AM %= 60;
						AH++;
					}
					// 只要求分 和秒在（0~59）之间，没要求小时，所以不用处理，也不能处理
					System.out.println(AH + " " + AM + " " + AS);
				}
				// 输出
			}
		}
	}

}
