package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * 
 * @2014-5-18上午10:27:23
 * @Author:范威振
 * @description
 */
public class Main1051 {
	private int length;
	private int weight;
	private boolean canChoose;
	public Main1051(int length, int weight, boolean canChoose) {
		super();
		this.length = length;
		this.weight = weight;
		this.canChoose = canChoose;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();// 测试数据的个数
			for (int n = 0; n < count; n++) {
				int N = scan.nextInt();
				Main1051 woods[] = new Main1051[N];
				// 接收这些数据
				for (int i = 0; i < woods.length; i++) {
					woods[i] = new Main1051(scan.nextInt(), scan.nextInt(), true);
				}
				// 按照长度对每个木棒进行排序,如果长度一样，按宽的排序
				int min = 0;
				for (int i = 0; i < woods.length - 1; i++) {
					min = i;
					for (int j = i + 1; j < woods.length; j++) {
						if (woods[j].length < woods[min].length||(woods[j].length == woods[min].length
								&& woods[j].weight < woods[min].weight)) {
							min = j;
						}
					}
					Main1051 temp = woods[min];
					woods[min] = woods[i];
					woods[i] = temp;
				}
				// 遍历，如果长宽都可以了，就不加一，直到所有的都被选中了
				int temp = 0, minTimes = 0;
				int sum=N;
				while(true) {
					temp=0;
					while (!woods[temp].canChoose) {//找到一个没有选过的尺寸为第一个被加工的木棒，作为标准
						temp++;
					}
					for (int j = 0;j+temp <woods.length; j++) {
						int s1=temp+j;//找到一个长度和重量都小于前一个的木棒
						if (woods[s1].canChoose&& woods[s1].weight >= woods[temp].weight) {
							woods[s1].canChoose = false;//把找到的该木棒标记成已经被加工了的
							sum--;//剩余木棒减一
							temp = temp + j;//以该被标记的木棒为标准
							j = 0;//寻找下一个木棒
						} 
					}
					minTimes++;
					if (sum<=0) {
						break;
					}
				}
				System.out.println(minTimes);
			}
		}
	}
}