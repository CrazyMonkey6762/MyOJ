package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-20
 * @Describe 
 * 		����һ�������Ŀ�ʼ��ÿ������һ�����ģ�֪��������Գ������е���Ϊֹ
 */
public class Main2028 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			int n=scan.nextInt();
			if(n>0){
				
				int arr[]=new int[n];
				int max=0;
				//ʵ�����ݵ����룬��������ֵ
				for (int i = 0; i < arr.length; i++) {
					arr[i]=scan.nextInt();
					//������ֵ����Сֵ
					if(arr[i]>max){
						max=arr[i];
					}
				}
				//�����ֵ��ʼ��������,ȷ�����԰����е�������
				for (int i=max;;i=i+max) {
					boolean flag=true;
					for (int j=0; j <n; j++) {
						if(i%arr[j]!=0){
							flag=false;//�����һ�����ܳ������Ͳ�������ѭ����Ҳ������� i
							break;
						}
					}
					if(flag){//ֻ�е����еĶ����㣬�����Գ���ʱ���Ż�����ѭ���壬�Ż����
						System.out.println(i);
						break;
					}
					
					
				}

				
				
				
				
			}
		}
	}

}
