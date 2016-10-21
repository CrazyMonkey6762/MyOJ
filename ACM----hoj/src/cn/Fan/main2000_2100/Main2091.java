package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-29
 * @Describe:	打印空心的图形
 */
public class Main2091 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		while (scan.hasNext()) {
			char sign = scan.next().charAt(0);
			if (sign == '@') {
				break;
			}
			if(count>0){
				System.out.println();
			}
			int n = scan.nextInt();
			// 循环判断每一行，然后输出
			for (int i = 1; i <= n; i++) {
				/*
				 * 经分析易知，除了第一行和最后一行，其他行只输出两个，都在与空格相接触的边缘地区 首先判断第一个 n-i
				 * 是指每一行一开始有n-i个空格，第n-i+1列应该输出标记
				 * 
				 * 然后是第二个 对于每一行而言 首先是n-i个空格，然后是2 * i - 1个标记，正好是第n-i+2 * i - 1个保留
				 */

				// 判断每一行的每一列应该输出什么
				for (int j = 1; j <= n - i + 2 * i - 1; j++) {
					if (j == n - i + 1 || j == n - i + 2 * i - 1 || i == n) {
						System.out.print(sign);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			count++;
		}
	}

}
