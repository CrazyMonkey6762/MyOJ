package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * 
 * @2014-5-7����10:09:23
 * @Author:Fan
 * @Description��
 * ���������һ���Ի��˵��⣬�ʵ�������Ч�ʣ���ָ�ĵ�����Ч�ʣ�������һ������ѧ���ſΣ���Ȼ����һ�ţ�
 * ֻҪ������ѧ�Ľ�������򵥵���һ�ţ�������Ч�ʾ�һ������ߵģ��Ҳ����ӵ��ӵ���
 * 
 */

public class Main2078 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();//�ж������������
			for (int i = 0; i < count; i++) {
				int sumCourt=scan.nextInt();//�ܵĿ�Ŀ��
				int inCourt=scan.nextInt();//һ�������ѧ�Ŀ�Ŀ.....���갡����ȫû�ð������
				int min=101;//���һ��������С��һ���Ѷ�
				for (int j = 0; j <sumCourt; j++) {
					int temp=scan.nextInt();//����ÿһ�ſε��Ѷ�ֵ
					min=(temp<min)?temp:min;
				}
				System.out.println((100-min)*(100-min));
			}
		}
	}

}
