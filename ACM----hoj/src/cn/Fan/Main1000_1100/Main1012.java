package cn.Fan.Main1000_1100;

/**
 * @Title:
 * @author ·¶ÍþÕñ
 * @date 2014-5-13
 * @Describe 
 */
public class Main1012 {

	public static void main(String[] args) {
		System.out.println("n e");
		System.out.println("- -----------");
		System.out.println("0 1");
		System.out.println("1 2");
		System.out.println("2 2.5");
		double sum=2.5;
		for (int i =3; i <=9; i++) {
			int temp=1;
			for (int j =1; j <=i; j++) {
				 temp*=j;
			}
			sum+=1.0/temp;
			System.out.print(i+" ");
			System.out.printf("%.9f\r\n",sum);
		}
		
		
		
		
		
	}

}
