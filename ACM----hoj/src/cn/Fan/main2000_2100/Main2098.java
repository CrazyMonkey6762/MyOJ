package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:			��һ����ż����	���� 		��ֳ�	������	��ͬ��		����
 * @author ������
 * @date 2014-4-23
 * @Describe 
 */
public class Main2098 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n<=0){
				break;
			}else if(n<8){//��������֪����nС��8ʱ������0
				System.out.println(0);
			}else{
				int count=0;
				boolean flage1,flage2;//�ֱ�         ��ʶ         ��Ӧ������          ����                 �ǲ�������
				
				for (int i=3; i <n/2; i=i+2) {//��Ϊ���Ƕ�Ӧ�ģ������ж�һ������ݼ��ɣ�����Ϊ���������������Լ�2
					flage1=flage2=true;
					for (int j=3; j <i; j=j+2) {
						if(i%j==0){   //�κ�һ���������㣬��ô�����Ͳ�������
							flage1=false;
							break;
						}
					}
					if(flage1){//���    С��     �Ǹ�          ��������         ����ô�Ͳ���Ҫ�жϴ����һ����
						for (int j=3; j <n-i; j=j+2) {
							if((n-i)%j==0){
								flage2=false;
								break;
							}
						}
					}
					if(flage1&&flage2){//ֻ�е�������������ʱ����������������ʱ n ��ֵĿ������������Լ�
						count++;
					}
				}
				
				System.out.println(count);
			}
		}
	}

}
