package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-20
 * @Describe ʮ����ת�����������Ƶ���ʽ
 */
public class Main2031 {

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			int N=scan.nextInt();
			int R=scan.nextInt();
			if(R>=2&&R<=16&&R!=10){
				
				String signs="";
				if (N<0){
					N=-N;
					signs="-";
				}
				String Rstr="";
				int temp=N%R;//ȡ����
				N=N/R;//���̽����ظ�����
				//�����������жϣ��������10�����С��10��
				if(temp<10){
					Rstr=temp+Rstr;
				}else{
					temp=temp-10;
					char c=(char)('A'+temp);
					Rstr=c+Rstr;
				}
				while(N!=0){
					 temp=N%R;//ȡ����
					N=N/R;//���̽����ظ�����
					//�����������жϣ��������10�����С��10��
					if(temp<10){
						Rstr=temp+Rstr;
					}else{
						temp=temp-10;
						char c=(char)('A'+temp);
						Rstr=c+Rstr;
					}			
				}
				System.out.println(signs+Rstr);
			}
		}
	}

}
