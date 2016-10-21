package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-4-20
 * @Describe 
 */
public class Main2007 {

	/**
	 * @Describe 
	 * @date 2014-4-20
	 * @param args
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int m=scan.nextInt();
			int n=scan.nextInt();
			int temp;
			if(n<m){
				temp=n;
				n=m;
				m=temp;
			}
			
				int x=0,y=0;
				for (int i = m; i <=n; i++) {
					if(i%2==0){
						x=x+i*i;
					}else if(i%2==1){
						y=y+i*i*i;
					}
				}	
				
			System.out.println(x+" "+y);
			
		}	
	}

}
