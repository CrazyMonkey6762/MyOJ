package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-21
 * @Describe 
 */
public class Main2040 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int M=scan.nextInt();
			if(M>0){
				int a[]=new int[M];
				int b[]=new int[M];
				//��������
				for (int i = 0; i <M; i++) {
					a[i]=scan.nextInt();
					b[i]=scan.nextInt();
				}
				
				//���������ж�
				for (int i = 0; i <M; i++) {
					//�ж�a������Լ���ĺ�
					int sum=0;
					for (int j = 1; j <a[i]; j++) {
						if(a[i]%j==0){
							sum=sum+j;
						}
					}
					
					if (sum==b[i]) {
						//�ж�b������Լ����
						sum=0;
						for (int j = 1; j <b[i]; j++) {
							if(b[i]%j==0){
								sum=sum+j;
							}
						}
						if(sum==a[i]){
							System.out.println("YES");
						}else{
							System.out.println("NO");
						}
						
						
						
						
						
						
						
					} else {
						System.out.println("NO");
					}
					
					
					
					
					
					
					
					
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
	}

}
