package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:���ڱ��ʽn^2+n+41����n�ڣ�x,y����Χ��ȡ����ֵʱ������x,y��(-39<=x<y<=50)���ж��ñ��ʽ��ֵ�Ƿ�Ϊ������
 * @author ������
 * @date 2014-4-20
 * @Describe 
 */
public class Main2012 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int x=scan.nextInt();
			int y=scan.nextInt();
			if(!(x==0&&y==0)&&(x>=-39&&y<=50&&x<y)){
				int count=0;				
				for (int i = x; i <=y; i++) {
					int signs=i*i+i+41;
					for (int j=2; j <signs; j++) {					
						if(signs%j==0){
							break;
							}
						if(j==signs-1){
							count++;
						}
					}
				}
				if(count==y-x+1){
					System.out.println("OK");
				}else{
					System.out.println("Sorry");
				}
			}	
		}	
	}

}
