package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-21
 * @Describe 
 * 			   因为目标是看最多的节目，所以下一个节目的安排时间(开始的时间)必须取决于前一个节目的结束时间，
 *           所以，对节目的结束时间进行排序，排完序后看下一个节目的开始时间是不是小于本次节目的结束时间
 *           如果大于，则该节目不可能被安排，则看下下个节目的开始时间是不是小于本次节目的结束时间 
 *           直到找到一个节目的起始时间小于本次节目的结束时间
 *           然后以这个满足天见的节目为基准来继续上面的操作，直到最后一个节目
 * 
 * 
 */
public class Main2037 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();// 表示有多少组数据
			if (n <= 0) {
				break;
			}

			int start[] = new int[n];
			int end[] = new int[n];

			// 接受数据
			for (int i = 0; i < n; i++) {
				start[i] = scan.nextInt();
				end[i] = scan.nextInt();
			}
			// 按照结束的时间，对数组进行排序
			for (int i = 0; i < n; i++) {
				int min = i;
				for (int j = i; j < n; j++) {
					if (end[j] < end[min]) {
						min = j;
					}
				}
				// 按照结束时间的先后顺序，对数组进行排序
				int temp = end[min];
				end[min] = end[i];
				end[i] = temp;
				int temp2 = start[min];
				start[min] = start[i];
				start[i] = temp2;
			}

			int count = 1;// 能看的节目总数
			int signs = 0;// 标识已经被采纳的节目的结束时间的数组下标
			for (int i = 0; i < n - 1; i++) {
				if (start[i + 1] >= end[signs]) {
					count++;
					signs = i + 1;
				}
			}
			System.out.println(count);
		}
	}
}
