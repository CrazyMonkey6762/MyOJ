package cn.Fan.Sort;

import java.util.Arrays;

/**
 * @title����
 * @2014-6-10����12:18:23
 * @Author:������
 * @description
 */
public class QuickSort {

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	/**
	 * @Author:������
	 * @description��һ���������ĵ�Ԫ��ֵ��������Ԫ�طŵ�ĩβ��ǰһ��
	 */
	private static int midIndex(int[] arr, int left, int right) {
		/**
		 * ���Ƚ�����Ԫ�أ���߶˵㣬�ұ߶˵㣬������������� ��� ��� < ���� < �ұ�
		 */
		int center = (left + right) / 2;
		if (arr[left] > arr[center]) {
			swap(arr, left, center);
		}
		if (arr[right] < arr[center]) {
			swap(arr, right, center);
		}
		if (arr[right] < arr[left]) {
			swap(arr, right, left);
		}
		/**
		 * ������Ԫ�طŵ��Ҷ˵��ǰһ����Ȼ���   left+1 ��    right-2  �ڵ����е�Ԫ�ؽ��д����������� 
		 */
		swap(arr, center, right - 1);
		
		return arr[right - 1];
	}

	/**
	 * @titleʵ��һ���򵥵�����
	 * @description���ָ������䳤��С����ֱ�Ӿ��ø�����ķ���������
	 */
	private static void sort(int[] arr, int left, int right) {
		for (int p = left + 1; p <= right; p++) {
			int tmp = arr[p];
			int j;
			for (j = p; j > left && tmp - (arr[j - 1]) < 0; j--)
				arr[j] = arr[j - 1];
			arr[j] = tmp;
		}
	}

	/**
	 * @title����
	 * @description�����ʵ��
	 */
	private static void quickSort(int[] arr, int left, int right) {
		if (left + 3 <= right) {
			/**
			 * �����䳤�ȵĴ�С���ж��Ƿ��б�Ҫ������ȥ ������䳤��С�ڵ������� ֱ�ӾͿ����������������� �������ĳ��ȴ�����������ȥ�ÿ���
			 */
			// �м�ֵ������������׼���ж�ĳһ��Ԫ��Ӧ�÷����м�ֵ����߻����ұ�
			int center = midIndex(arr, left, right);
			int leftFinal = left;
			int rightFinal = right - 1;
			for (;;) {
				/**
				 * 1�����м�ֵ����������Ѱ��һ�����м�ֵС��ֵ 
				 * 2�����м�ֵ����������Ѱ��һ�����м�ֵ���ֵ
				 * 3����������ֵ
				 */
				while (arr[++leftFinal] - center < 0) {
				}
				while (arr[--rightFinal] - center > 0) {
				}
				// �ж�һ�����ߵ��α��Ƿ��Ѿ������غϣ����û�У���ֱ�Ӱ�������ġ�С��������������ġ���ֵ������
				if (leftFinal < rightFinal) {
					swap(arr, leftFinal, rightFinal);
				} else {
				// ������α�����α귢���غϣ���˵���������Ѿ���������򣬾�û�б�Ҫ�ټ�����ȥ�ˣ�ֱ����������
					break;
				}
			}
			/**
			 * �ڰѸ������ڵ�Ԫ�ض����������ٽ�����Ԫ�شӺ���������
			 */
			swap(arr, leftFinal, right - 1);

			// �м�ֵ��������ݹ鱾����
			quickSort(arr, left, leftFinal - 1);
			// �м�ֵ��������ݹ鱾����
			quickSort(arr, leftFinal, right);

		} else {
			// ������䳤��С�ڵ���������ֱ�����򣬾�����
			sort(arr, left, right);
		}

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 20, 15, 25, 39, 1, -8, 4, 7, 6, 0, -1, 99 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

		
	}

	
	
	
	
	
	
	
}











