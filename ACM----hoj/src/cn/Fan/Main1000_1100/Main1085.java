package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * 
 * @2014-5-10����09:16:13
 * @Author:Fan
 * @description
 */

public class Main1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			//������Щ����
			int arr[]=new int [6];
			//����Ǯ�ҵĸ���
			arr[1]=scan.nextInt();
			arr[2]=scan.nextInt();
			arr[5]=scan.nextInt();
			if(arr[1]==0&&arr[2]==0&&arr[5]==0){
				break;
			}
			int result[]=new int [100100];//ʼ�մ��ǰ��������ĸ����ϵ��
			int temp[]=new int [100100];//��ʱ�洢��˺����ĸ����ϵ��
			//ȷ����һ����������ĸ������ϵ��
			
			/**��һ���׳���ط���������ѭ����������ʼ���յ�
			 *  �ݱ�����0�Ŀ�ʼ������������ĵ���arr[1]
			 */
			for (int i =0; i <=arr[1]; i++) {//�ɵ�һ��Ǯ�ҵĸ���ȷ����һ�������ڵĸ����ϵ������
				result[i]=1;
			}
			
			int maxnumber=arr[1]+2*arr[2]+5*arr[5];//�ڸ�������Ǯ�ҵĸ�����ͬʱ�����ǿ�������ܴﵽ������Ǯ����
			for (int i = 2; i <=3; i++) {//��Ϊ�ܹ��������ţ�������i <=3
				if(i==3){//��Ϊ������Ǯ����5�ֵģ�Ϊ�˷��������k�ĵ��������Ե�i=3ʱ��i=5
					i=5;
				}
				for (int j =0; j <=maxnumber; j++) {
					for (int k = 0,s=0; k+j<=maxnumber&&s<=arr[i];s++,k+=i) {
						/**�ڶ����׳���ĵط������������ʽ����д
						 * ������temp[j+k]+=result[j];
						 * ��Ϊ������������ǰ�    -ǰ��������-�ĵ�j��-����������-�ĵ�k��ĳ˻����j+k���ϵ�����
						 * ����Ϊ���������еĵ�k���ϵ����1������ֱ�Ӿ��ǰ�ǰ�������еĵ�j������j+k���ϵ����ӣ�
						 */
						temp[j+k]+=result[j];
					}
				}
				/**�������׳���ĵط���������ѭ����������ʼ����ֹ
				 * j�����Ǵӵ���0��ʼ���Ӵ���maxnumber����
				 * ��Ϊ�˲��������ǰ���˺�Ľ����ֵ��������ǰ��ϵ��������
				 */
				for (int j = 0; j <=maxnumber; j++) {
					result[j]=temp[j];
					temp[j]=0;
				}
			}
			for (int i =1; i <=maxnumber; i++) {	
				System.out.println(result[i]);
				if(result[i]==0){
					System.out.println(i);
					break;
				}else if(i==maxnumber){
					System.out.println(maxnumber+1);
				}
			}
		}
	}
}
