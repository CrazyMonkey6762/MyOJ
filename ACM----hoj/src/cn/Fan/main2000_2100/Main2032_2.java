package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ������
 * @date 2014-4-20
 * @Describe ��ӡ�������
 */
public class Main2032_2 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			int n=scan.nextInt();
				//���ÿһ��
				for (int i=1; i<=n; i++) {
					for (int j=1; j<=i; j++) {
							System.out.print(f(i,j)+" ");
					}
					System.out.println();
				}
				System.out.println();
			
		}
	}
	private static int f(int i, int j) {
		int sign=i/2+1;
		if(j==1||j==i){
			return 1;
		}else if(j<=sign){			
			return f(i-1,j)+f(i-1,j-1);
		}else {
			return f(i,i+1-j);
		}
	}

}
