package cn.stone.simulate;

import java.util.Scanner;

/**  
 * @ClassName_Main1013
 * @author_Stone6762  
 * @CreationTime_2014��12��13�� ����11:40:05
 * @Description_�ѻ�ľ
 * С����ϲ�����ľһ�죬��������ľ������˺ö�߶Ȳ�ͬ�Ķѣ�ÿһ�Ѷ���һ����һ������ʽ��
 * Ȼ����ʱ�����������Щ��ľ�ѱ�ɸ߶���ͬ�ġ�
 * �����������������ƶ����ٵĻ�ľ����ʵ����һĿ�꣬���ܰ�������
 * @����_
 * ����ƽ����
 * ��ÿһ�����ľ���ֵ���
 * �۳��Զ�����
 */
public class Main1013 {

	private static int abbs(int a){
		return a>0?a:(-a);
	}
	
	public static void main(String[] args) {
		int t=0;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n=scan.nextInt();
			if(n==0){
				break;
			}
			int arr[]=new int [n];
			int max=0,avg=0;
			//1.�������벢��ƽ����
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scan.nextInt();
				max+=arr[i];
			}
			avg=max/n;
			
			//�����ж���ƽ�����Ĳ�ľ���ֵ�ĺ�
			max=0;
			for (int i = 0; i < arr.length; i++) {
				max+=abbs(arr[i]-avg);
			}
			if(t==1){
				System.out.println();
			}
			System.out.println(max/2);
			t=1;
		}
	}

}
