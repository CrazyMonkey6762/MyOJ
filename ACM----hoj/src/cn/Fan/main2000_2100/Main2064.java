package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-5-6
 * @Describe:	
 * 	��i �� ���Ӵ����ң���Ҫf��i�����ƶ���
 * �򣬺��� n �����ӵĲ�������
 * ��һ�����Ƚ�     ǰ  n-1  �������Ƶ��ұ�.........��Ҫf��n-1�����ƶ�
 * �ڶ�������  �� n �����ӣ������Ǹ����ƶ����м�λ��.......��Ҫһ���ƶ�
 * ����������   ǰn-1�����Ӵ��ұ��ƶ������.............��Ҫf��n-1�����ƶ�
 * ���Ĳ�����  �� n �����ӣ������Ǹ����ƶ����ұ�.......��Ҫһ���ƶ�
 * ���岽����     ǰ  n-1  �������Ƶ��ұ�.........��Ҫf��n-1�����ƶ�
 * 
 * ���ԣ�n�����Ӵ�����ƶ����ұ���Ҫ���ܴ���f��n��= 3*f��n-1+2
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
