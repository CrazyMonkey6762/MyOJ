package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * 
 * @2014-5-18����10:27:23
 * @Author:������
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
			int count = scan.nextInt();// �������ݵĸ���
			for (int n = 0; n < count; n++) {
				int N = scan.nextInt();
				Main1051 woods[] = new Main1051[N];
				// ������Щ����
				for (int i = 0; i < woods.length; i++) {
					woods[i] = new Main1051(scan.nextInt(), scan.nextInt(), true);
				}
				// ���ճ��ȶ�ÿ��ľ����������,�������һ�������������
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
				// ������������������ˣ��Ͳ���һ��ֱ�����еĶ���ѡ����
				int temp = 0, minTimes = 0;
				int sum=N;
				while(true) {
					temp=0;
					while (!woods[temp].canChoose) {//�ҵ�һ��û��ѡ���ĳߴ�Ϊ��һ�����ӹ���ľ������Ϊ��׼
						temp++;
					}
					for (int j = 0;j+temp <woods.length; j++) {
						int s1=temp+j;//�ҵ�һ�����Ⱥ�������С��ǰһ����ľ��
						if (woods[s1].canChoose&& woods[s1].weight >= woods[temp].weight) {
							woods[s1].canChoose = false;//���ҵ��ĸ�ľ����ǳ��Ѿ����ӹ��˵�
							sum--;//ʣ��ľ����һ
							temp = temp + j;//�Ըñ���ǵ�ľ��Ϊ��׼
							j = 0;//Ѱ����һ��ľ��
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