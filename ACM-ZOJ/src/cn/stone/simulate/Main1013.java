package cn.stone.simulate;

import java.util.Scanner;

/**  
 * @ClassName_Main1013
 * @author_Stone6762  
 * @CreationTime_2014年12月13日 下午11:40:05
 * @Description_堆积木
 * 小明很喜欢玩积木一天，他把许多积木块组成了好多高度不同的堆，每一堆都是一个摞一个的形式。
 * 然而此时，他又想把这些积木堆变成高度相同的。
 * 但是他很懒，他想移动最少的积木块来实现这一目标，你能帮助他吗？
 * @分析_
 * ①求平均数
 * ②每一堆求差的绝对值相加
 * ③除以二即可
 */
public class Main1013 {

	private static int abbs(int a){
		return a>0?a:(-a);
	}
	
	public static void main(String[] args) {
		int t=0;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n=scan.nextInt();
			if(n==0){
				break;
			}
			int arr[]=new int [n];
			int max=0,avg=0;
			//1.数据输入并求平均数
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scan.nextInt();
				max+=arr[i];
			}
			avg=max/n;
			
			//求所有堆与平均数的差的绝对值的和
			max=0;
			for (int i = 0; i < arr.length; i++) {
				max+=abbs(arr[i]-avg);
			}
			if(t==1){
				System.out.println();
			}
			System.out.println(max/2);
			t=1;
		}
	}

}
