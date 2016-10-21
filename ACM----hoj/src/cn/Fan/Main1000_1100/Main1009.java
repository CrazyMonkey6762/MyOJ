package cn.Fan.Main1000_1100;
import java.util.Scanner;
/**
 * 
 * @2014-5-13ÏÂÎç03:07:50
 * @Author:Fan
 * @description
 */

public class Main1009 {
	private int number;
	private int need;
	private double bl;
	
	public Main1009(int number, int need) {
		this.number = number;
		this.need = need;
		this.bl =  need/(double)number;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int sum=scan.nextInt();
			int count=scan.nextInt();
			if(sum==-1&&count==-1){
				break;
			}
			Main1009 rooms[]=new Main1009[count];
			for (int i = 0; i < rooms.length; i++) {
				rooms[i]=new Main1009(scan.nextInt(), scan.nextInt());
			}
			int min=0;
			
			for (int i =0; i < rooms.length; i++) {
				min=i;
				for (int j=i; j < rooms.length; j++) {
					if(rooms[j].bl<rooms[min].bl){
						min=j;
					}
				}
				Main1009 temp=rooms[i];
				rooms[i]=rooms[min];
				rooms[min]=temp;
			}
			double max=0;
			for (int i = 0; i < rooms.length; i++) {
				if(sum>=rooms[i].need){
					sum=sum-rooms[i].need;
					max=max+rooms[i].number;
				}else{
					max=max+(double) (sum/rooms[i].bl);
					break;
				}
			}
			
			
			System.out.printf("%.3f\r\n",max);
		}
	}
}
