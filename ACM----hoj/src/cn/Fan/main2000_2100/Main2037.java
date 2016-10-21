package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-21
 * @Describe 
 * 			   ��ΪĿ���ǿ����Ľ�Ŀ��������һ����Ŀ�İ���ʱ��(��ʼ��ʱ��)����ȡ����ǰһ����Ŀ�Ľ���ʱ�䣬
 *           ���ԣ��Խ�Ŀ�Ľ���ʱ������������������һ����Ŀ�Ŀ�ʼʱ���ǲ���С�ڱ��ν�Ŀ�Ľ���ʱ��
 *           ������ڣ���ý�Ŀ�����ܱ����ţ������¸���Ŀ�Ŀ�ʼʱ���ǲ���С�ڱ��ν�Ŀ�Ľ���ʱ�� 
 *           ֱ���ҵ�һ����Ŀ����ʼʱ��С�ڱ��ν�Ŀ�Ľ���ʱ��
 *           Ȼ���������������Ľ�ĿΪ��׼����������Ĳ�����ֱ�����һ����Ŀ
 * 
 * 
 */
public class Main2037 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();// ��ʾ�ж���������
			if (n <= 0) {
				break;
			}

			int start[] = new int[n];
			int end[] = new int[n];

			// ��������
			for (int i = 0; i < n; i++) {
				start[i] = scan.nextInt();
				end[i] = scan.nextInt();
			}
			// ���ս�����ʱ�䣬�������������
			for (int i = 0; i < n; i++) {
				int min = i;
				for (int j = i; j < n; j++) {
					if (end[j] < end[min]) {
						min = j;
					}
				}
				// ���ս���ʱ����Ⱥ�˳�򣬶������������
				int temp = end[min];
				end[min] = end[i];
				end[i] = temp;
				int temp2 = start[min];
				start[min] = start[i];
				start[i] = temp2;
			}

			int count = 1;// �ܿ��Ľ�Ŀ����
			int signs = 0;// ��ʶ�Ѿ������ɵĽ�Ŀ�Ľ���ʱ��������±�
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
