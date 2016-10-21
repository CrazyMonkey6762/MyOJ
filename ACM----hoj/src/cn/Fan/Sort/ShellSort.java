
package cn.Fan.Sort;

import java.util.Arrays;

/**
 * @titleϣ������
 * @2014-6-10����10:38:20
 * @Author:������
 * @description
 */

public class ShellSort {

	/**
	 *@descriptionϣ������
	 *����������ֳɺܶ���죬ÿ�μ��ٿ�ĳ��ȣ��ӵ�i����ʼ��ÿk����һ��  
	 *���統    ��ĳ���Ϊ  4 ʱ����ʼ�����1 ��ô  
	 *    1  5   9   13   17.���϶���һ��
	 *ͬ��    2  6   10  14   18.�����϶���һ��
	 *������Ҳһ����	
	 *
	 *Ȼ�����      ����    ��ֱ�Ӳ������򣬶�ÿһ�鶼����
	 *Ȼ���ټ��ٿ�ĳ���ÿ���۰룬
	 *�ŵ㣺
	 *����ѭ���Ĵ�������һ��ʼ��ʱ��ͰѺܶ������ݷֵ��˺��棬��С�����ݷֵ���ǰ�棬
	 *�Դﵽ�ڿ�ĳ��Ⱥ�С��ʱ����Ҫ�ƶ��Ĵ���������
	 *
	 */
	private static void shellSort(int[] arr) {
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int temp = arr[i];
				int j = 0;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
					arr[j] = arr[j - gap];
				}
				arr[j] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = new int[] { 20, 15, 25, 39, 1, -8, 4, 7, 6, 0, -1, 99 };
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
