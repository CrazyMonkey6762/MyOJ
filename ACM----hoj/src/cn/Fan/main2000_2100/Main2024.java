package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-18
 * @Describe    c���Ա�ʶ��ֻ������ĸ�����֣��»���
 * 						���ֲ��ܿ�ͷ
 * 
 * 
 * ��һ�����ж����ַ��ǲ�����ĸ���»���
 * �ڶ�����������ǣ����б������ж��ǲ�����ĸ�����֣��»���
 */
public class Main2024 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n>0){
				String arr[]=new String[n];
				String s=scan.nextLine();//�����س���
				//ʵ�����ݵ�����
				for (int i = 0; i < arr.length; i++) {
					arr[i]=scan.nextLine();
				}
				//����
				for (int i = 0; i < arr.length; i++) {
					
					if(!Character.isLetter(arr[i].charAt(0))&&arr[i].charAt(0)!='_'){
						System.out.println("no");
					}else{
						for (int j = 0; j <arr[i].length(); j++) {
							char ch=arr[i].charAt(j);
							if(!(Character.isLetterOrDigit(ch)||ch=='_')){
								System.out.println("no");
								break;
							}
							if(j==arr[i].length()-1){
								System.out.println("yes");
							}
						}
					}
				}
				
			}
		}
		
	}

}
