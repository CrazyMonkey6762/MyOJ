package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-26
 * @Describe ͳ��һƬ�����У���ͬ���ʵ�����
 */
public class Main2072 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String str=scan.nextLine();
			if(str.equals("#")){
				break;
			}else{
				//1.ȥ����ͷ�Ŀո�
				int sign=0;//��ʶ��һ����ĸ���ֵ�λ��
				for (int i = 0; i <str.length(); i++) {
					if(Character.isLetter(str.charAt(i))){
						sign=i;
						break;
					}
				}
				if(sign>=str.length()-1){
				//���и���û����ĸ,�����κδ���
				}else{
					
					String newstr="";//����ȥ��ǰ��ո������ַ���
					for (int i =sign; i <str.length(); i++) {
						newstr=newstr+str.charAt(i);
					}
					//2.�Կո�Ϊ��ʾ�����ָ�,�õ���������
					String regex=" +";
					String arr[]=newstr.split(regex);
					//3.�����ַ������飬����ͬ�ĵ���ֻ����һ��
						for (int i = 0; i<arr.length-1; i++) {
							for (int j= i+1; j<arr.length; j++) {		
								if(arr[i].equals(arr[j])){
									arr[j]="#";//����ֱ�ӽ�arr[j]��ֵΪ�գ���Ϊ������ж���null���ܵ��÷���
								}
							}
						}		
						//4.ͳ��������δ����ǵĵ��ʵĸ���
						int count=0;
						for (int i = 0; i < arr.length; i++) {
							if(!arr[i].equals("#")){
								count++;
							}
						}
						System.out.println(count);
					
										
				}
			}
		}
	}
}
