package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-23
 * @Describe һ����֪������λ�������ܱ�һ������������������������������β��
 */
public class Main2099 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			//��������
			int a=scan.nextInt();
			int b=scan.nextInt();
				
			if(!(a==0&&b==0)){
				int temp=a*100;
				int count=0;
				for (int i = 0;i<100; i++) {
					int signs=temp+i;
					//�������������
					if(signs%b==0){
						count++;
					if(count==1){
						System.out.printf("%02d",i);
					}else if(count>1){
						System.out.print(" ");
						System.out.printf("%02d",i);
						}
							
					}
				}
					System.out.println();
			}
			
		}
	}

}
