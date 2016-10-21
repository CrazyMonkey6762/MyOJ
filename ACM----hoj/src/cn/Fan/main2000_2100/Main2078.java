package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * 
 * @2014-5-7上午10:09:23
 * @Author:Fan
 * @Description：
 * 这尼玛就是一个迷惑人的题，问的是最大的效率，是指的单个的效率，无论他一晚上能学几门课（当然起码一门）
 * 只要假设他学的仅仅是最简单的那一门，那他的效率就一定是最高的，我擦，坑爹坑爹啊
 * 
 */

public class Main2078 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();//有多少组测试数据
			for (int i = 0; i < count; i++) {
				int sumCourt=scan.nextInt();//总的科目数
				int inCourt=scan.nextInt();//一晚上最多学的科目.....尼玛啊，完全没用啊，完成
				int min=101;//标记一个困难最小的一个难度
				for (int j = 0; j <sumCourt; j++) {
					int temp=scan.nextInt();//接收每一门课的难度值
					min=(temp<min)?temp:min;
				}
				System.out.println((100-min)*(100-min));
			}
		}
	}

}
