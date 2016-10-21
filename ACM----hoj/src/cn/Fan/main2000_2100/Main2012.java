package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:对于表达式n^2+n+41，当n在（x,y）范围内取整数值时（包括x,y）(-39<=x<y<=50)，判定该表达式的值是否都为素数。
 * @author 范威振
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
