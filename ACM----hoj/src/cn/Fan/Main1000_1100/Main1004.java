package cn.Fan.Main1000_1100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-5-13
 * @Describe
 */
public class Main1004 {
	private String color;
	private int temp;
	public Main1004(String color) {
		this.color = color;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int count = scan.nextInt();
			if(count<=0){
				break;
			}
			Main1004 colors[]=new Main1004[count];
			//接受这些数据
			for (int i = 0; i < colors.length; i++) {
				colors[i]=new Main1004(scan.next());
			}
			//判断出现的次数
			for (int i =0; i < colors.length-1; i++) {
				for (int j =i+1; j < colors.length; j++) {
					if(colors[i].color.equals(colors[j].color)){
						colors[i].temp++;
					}
				}
			}
			//找到出现最多的那个
			int max=0;
			for (int i =1; i < colors.length; i++) {
				if(colors[i].temp>colors[max].temp){
					max=i;
				}
			}
			System.out.println(colors[max].color);
		}
	}

}
