package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-9
 * @Describe 
 */
public class Main2022 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	while(scan.hasNext()){
		int m=scan.nextInt();
		int n=scan.nextInt();
		if (m>0&&n>0) {
			int x=0,y=0;
			int arr[][]=new int [m][n];
			for (int i = 0; i <m; i++) {
				for (int j = 0; j<n; j++) {
					arr[i][j]=scan.nextInt();
					//�ҵ�����ֵ����±�
					if (Math.abs(arr[i][j])>Math.abs(arr[x][y])) {
						x=i;
						y=j;
						//�������ֵ��ͬ���±�ѡ������С�ģ������Ҳ��ͬ��ѡ����С��
					}
				}
			}
		System.out.println((x+1)+" "+(y+1)+" "+arr[x][y]);
			
			}
		}
	}

}
