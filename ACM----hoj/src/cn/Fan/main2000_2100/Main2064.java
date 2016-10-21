package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-5-6
 * @Describe:	
 * 	记i 个 盘子从左到右，需要f（i）次移动，
 * 则，含有 n 个盘子的操作如下
 * 第一步：先将     前  n-1  个从左移到右边.........需要f（n-1）次移动
 * 第二步，将  第 n 个盘子（最大的那个）移动到中间位置.......需要一次移动
 * 第三步：将   前n-1个盘子从右边移动到左边.............需要f（n-1）次移动
 * 第四步：将  第 n 个盘子（最大的那个）移动到右边.......需要一次移动
 * 第五步：将     前  n-1  个从左移到右边.........需要f（n-1）次移动
 * 
 * 所以，n个盘子从左边移动到右边需要的总次数f（n）= 3*f（n-1+2
 */
public class Main2064 {

	public static void main(String[] args) {
		long arr[] = new long[36];
		arr[1] = 2;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] * 3 + 2;
		}
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int N = scan.nextInt();
			System.out.println(arr[N]);
		}
	}

}
