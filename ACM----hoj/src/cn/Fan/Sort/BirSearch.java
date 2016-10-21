package cn.Fan.Sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName_BirSearch-----���ö��ַ���һ���Ǽ����������һ�����ݵ�λ�ã�����ж����Ҫ����ʾ��
 * @author_Stone6762
 * @CreationTime_2014��11��19�� ����10:04:21
 * @Description_
 */
public class BirSearch {

	/**
	 * @Title_searchByBir���ַ�����һ������
	 * @Describe_
	 * @Author_Stone6762
	 * @param arr
	 * @param signs
	 * @return
	 */
	private static int searchByBir(int[] arr, int signs) {
		int low = 0;
		int high = arr.length - 1;
		int center = 0;
		while (high >= low) {
			center = (low + high) / 2;
			if (arr[center] == signs) {
				return center + 1;
			} else if (arr[center] > signs) {
				high = center - 1;
			} else {
				low = center + 1;
			}
			/*
			 * UML��java
			 */
		}
		return 0;
	}

	/**
	 * @Title_getStart
	 * @Describe_�����Ѿ����ҵ����������ڵ�λ��_ȷ�����������ȵ�������ʼλ��
	 * @Author_Stone6762
	 * @param arr--�ܵ�����
	 * @param index--�Ѿ����ҵ������ݵ�λ��
	 * @return
	 */
	private static int getStart(int[] arr, int index) {
		index--;//--���������ڵ�λ��ת����������±�
		int signs=arr[index];
		
		while (index >= 0 && arr[index] == signs) {
			index--;
		}
		//��Ϊ��ʼ��һ��while��һ��ѭ����һ�����˶����Ӷ������ñ������λ��
		return index + 2;
	}

	/**
	 * @Title_getEnd
	 * @Describe_�����Ѿ����ҵ����������ڵ�λ��_ȷ�����������ȵ�������ʼλ��
	 * @Author_Stone6762
	 * @param arr---�ܵ�����
	 * @param index--�Ѿ���ѯ�������ݵ�λ��
	 * @return
	 */
	private static int getEnd(int[] arr, int index) {
		index--;
		int signs=arr[index];
		while (index < arr.length && arr[index] == signs) {
			index++;
		}
		//��Ϊ��ʼ��һ��while��һ�μ�һ�����ò��ñ仯���Ѿ������ݵ�λ����
		return index ;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = { 11, 22, 33, 33, 44, 55, 55, 77 };
		while (scan.hasNext()) {
			int signs = scan.nextInt();
			int index = searchByBir(arr, signs);
			if (index == 0) {
				System.out.println(Arrays.toString(arr));
				System.out.println("��Ҫ�ҵ����ݲ�����");
			} else {
				System.out.println(Arrays.toString(arr));
				System.out.println("��Ҫ�ҵ����ݵ�λ��Ϊ��");
				int start = getStart(arr, index);
				int end = getEnd(arr, index);
				for (int i = start; i <= end; i++) {
					System.out.println(i);
				}
			}
		}
	}
}
