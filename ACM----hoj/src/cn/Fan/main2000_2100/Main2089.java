package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-26
 * @Describe   		ͳ��һ��������	���ǲ�������	�ĸ�����������4��������62��
 */
public class Main2089 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			//��������
			int n=scan.nextInt();
			int m=scan.nextInt();
			if(m==0&&n==0){
				break;
			}			
			//���������ڵ����������ҵ������������ĸ���
			int count=0;
			if(n<=4){//ѭ���жϲ���һλ�������ԣ������ж�һ��n�ǲ���С�ڵ���4������ǵĻ�����ô���ǲ�������������Ҫ��һ�ˣ����n����4��ô���ò��ò���
				count=-1;
			}
			
			for (int i=n; i <=m; i++) {
				//��Ϊ�޷�ȷ�����	m	����	n�����ж�������һ���򣬱���ķ�������ȥ�����е�λ��̫�鷳�������Կ��Խ�����ת��Ϊ�ַ�������
				String str=""+i;
			
				//�����ַ��������ǲ��ǲ�������
				boolean flag=true;
				for (int j = 0; j <str.length()-1; j++) {//��ΪҪ�ж�62������ֻ�ܱ������ַ����ĵ����ڶ�λ����͵�����һλ�������жϲ���
					if(str.charAt(j)=='4'||str.charAt(j+1)=='4'||(str.charAt(j)=='6'&&str.charAt(j+1)=='2')){
						//ֻҪ����������κ�һ����������ô�������ǲ�����������ô�Ͳ�����ͳ��
						flag=false;
						break;
					}
				}
				if(flag){
					count++;
				}
			}
			System.out.println(count);			
		}
	}

}
