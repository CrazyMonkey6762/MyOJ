package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-26
 * @Describe ����һ�����ַ�����	����	ĳ��	���ַ�����		����
 */
public class Main2087 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			//��������
			String str=scan.next();
			if(str.equals("#")){
				break;
			}
			String sign=scan.next();
			
				int count=0;//ͳ��ƥ��ɹ��ĸ�����������������
				for (int i = 0; i <str.length(); i++) {
					boolean flag=true;//�ж��Ƿ�ƥ��ɹ�
					
					//ֱ�Ӵ��ַ����ĳ������ж��Ƿ���ܳ���ƥ������
					if(i+sign.length()>str.length()){
						break;
					}
					//�����ҵ�Ҫƥ����ַ����ĵ�һ���ַ���ͬ��λ��
					if(str.charAt(i)==sign.charAt(0)){
						//����Ҫ�ҵ��ַ���
						for (int j=1; j <sign.length(); j++) {
							//��һ���ַ���������ȶ�����ƥ�䣬��ʶƥ���flag=false������ļ���������û�б�Ҫ�ˣ�����break
							if(str.charAt(i+j)!=sign.charAt(j)){
								flag=false;
								break;
							}
						}
						/*
						 * ����ɹ�ƥ�䣬 
						 * 	�� ��ô��������һ    ��i=i+sign.length()-1;
						 */
						if(flag){
							i=i+sign.length()-1;
							count++;
						}	
					}
				}
				System.out.println(count);					
		}
	}
}
