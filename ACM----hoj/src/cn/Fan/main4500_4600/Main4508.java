package cn.Fan.main4500_4600;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-5-23
 * @Describe
 */
public class Main4508 {

	private static class Food {
		private int happy;
		private int hot;

		public Food(int happy, int hot) {
			super();
			this.happy = happy;
			this.hot = hot;
		}

	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();
			Food food[] = new Food[count];
			for (int i = 0; i < food.length; i++) {
				food[i] = new Food(scan.nextInt(), scan.nextInt());
			}
			int maxHot = scan.nextInt();
			int d[] = new int[maxHot + 4];// 每一份热量幸福的最大值

			for (int i = 0; i < food.length; i++) {
				for (int j = food[i].hot; j <= maxHot; j++) {
					d[j] = max(d[j], d[j - food[i].hot] + food[i].happy);
				}
			}
			System.out.println(d[maxHot]);
		}
	}

}
