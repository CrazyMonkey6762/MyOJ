package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-22
 * @Describe ���裬���ڵ�   M �� �����ϣ���ô�ҿ����Ǵӵ� M-1  �����ģ�Ҳ�����Ǵ�   M-2�����ģ�
 * 			���ԣ��ҵ���   M�������ϵ� ��������===f��M-1��+f��M-2��
 * 
 * 			����һ�����ú�����Ҳ���ǵݹ飬��д��ʱ�䳤
 * 			�������������� �洢��  ��   i  �����ݵķ���
 * 			
 */
public class Main2041 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int N=scan.nextInt();
			if (N>0) {
			int arr[]=new int[N];	
			//ʵ�����ݵ�����
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scan.nextInt();
			}
			//��������ÿ�����ݽ��д���	
			for (int i = 0; i < arr.length; i++) {
				int ars[]=new int[arr[i]+1];
				for (int j =1; j <=arr[i]; j++) {
					if(j==1||j==2){
						ars[j]=1;
					}else{
						ars[j]=ars[j-1]+ars[j-2];
					}
				}
				System.out.println(ars[arr[i]]);

			}

			}
		}
	}
}
