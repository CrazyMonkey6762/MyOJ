package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-5-5
 * @Describe
 */
public class Main2058 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int max = scan.nextInt();
			int sum = scan.nextInt();
			if (max == 0 && sum == 0) {
				break;
			}			
			/**
			 * 外层根据这个序列的长度进行循环判断
			 * 1  2  3  4  5 .........sum/2
			 * 内存循环中心数，从1 2 3 4 5 ....max/2+1
			 */
			if(sum<max){
				System.out.println("["+sum+","+sum+"]");
			}
			int tem=0;
			int signs=sum/2+1;
			for (int i=1; i <=sum/2; i++) {
				for (int j=1;j <=signs; j++) {
					tem=(j+j+i-1)*i/2;
					if(tem==sum){
						System.out.println("["+j+","+(j+i-1)+"]");
						signs=j+i-1;
						break;
					}
				}
			}

		}
	}

}
