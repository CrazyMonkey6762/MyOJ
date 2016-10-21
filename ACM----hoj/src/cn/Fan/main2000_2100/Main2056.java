package cn.Fan.main2000_2100;
import java.util.Scanner;
/**
 * 
 * @2014-5-20ÉÏÎç09:49:34
 * @Author:·¶ÍþÕñ
 * @description
 */
public class Main2056 {
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	public Main2056(double x1, double y1, double x2, double y2) {
		this.x1 = x1>x2?x2:x1;
		this.y1 = y1>y2?y2:y1;
		this.x2 = x1>x2?x1:x2;
		this.y2 = y1>y2?y1:y2;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			Main2056 r1 = new Main2056(scan.nextDouble(),
					scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
			Main2056 r2 = new Main2056(scan.nextDouble(),
					scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
			double xx1=(r1.x2>r2.x2)?r2.x2:r1.x2;
			double xx2=r1.x1>r2.x1?r1.x1:r2.x1;
			double x = xx1-xx2;
			double yy1=r1.y2>r2.y2?r2.y2:r1.y2;
			double yy2=r1.y1>r2.y1?r1.y1:r2.y1;
			double y = yy1- yy2;
			if (x <=0|| y<=0) {
				System.out.println("0.00");
			} else {
				System.out.printf("%.2f", x * y);
				System.out.println();
			}
		}
	}

}
