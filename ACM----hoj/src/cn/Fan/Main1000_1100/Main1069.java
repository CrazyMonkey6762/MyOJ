package cn.Fan.Main1000_1100;

import java.util.Scanner;
/**
 * 
 * @2014-5-19����09:19:14
 * @Author:������
 * @description
 */
public class Main1069 {
	private int x;
	private int y;
	private int z;
	public Main1069(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	private static int max(int a, int b) {
		return a > b ? a : b;
	}
	private static int min(int a, int b) {
		return a > b ? b : a;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;//��ʶ���ڼ�������ʵ��
		while (scan.hasNext()) {
			count++;
			int n = scan.nextInt();//��ʶ�м���ľ��
			if (n <= 0) {
				break;
			}
			Main1069 blocks[] = new Main1069[n * 3];//��ʶ�����Ե�ľ�������
			int maxH[]=new int [n*3];//��i��ľ�������֮�󣬸߶ȵ����ֵ
			// 1.������������ݣ�������ÿ�ε����룬������ܵ�����������
			/*
			 * ��Ϊÿ��ľ��ĸ����������޵ģ������κ�һ�����ݶ����Կ����ǳ���ߣ�
			 * ����Ϊÿһ��ľ�鶼ֻ��������ͬ�����
			 * ���Ծͽ�һ�����빹�������ľ�飬�����������޵�ľ�������
			 * ��ʱ�ĳ�����Ѿ�ȷ����z���Ǹߣ�x y�ǵ���ĳ��Ϳ�
			 */
			for (int i = 0, j = 0; i < n; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				int z = scan.nextInt();
				blocks[j] = new Main1069(min(x, y), max(x, y), z);
				blocks[j+1]=new Main1069(min(x,z), max(x,z), y);
				blocks[j+2]=new Main1069(min(y,z), max(y,z), x);
				j+=3;
			}
			// 2.���ݳ����������
			/*
			 * �����Ե��ǣ��������ģ���Ȼ��һ�����������棬����һ���������������
			 * ���ԣ����ճ����������������ͬ�����԰��տ�����
			 */
			int max=0;
			for (int i =0; i < blocks.length-1; i++) {
				max=i;
				for (int j = i+1; j < blocks.length; j++) {
					if(blocks[j].x>blocks[max].x||(blocks[j].x==blocks[max].x&&blocks[j].y>blocks[max].y)){
						max=j;
					}
				}
				Main1069 temp=blocks[max];
				blocks[max]=blocks[i];
				blocks[i]=temp;
			}
			//3.��ʼ����ľ�飬���������ֵ
			/*
			 * �������е�ľ�鶼�ܷ��������棬��ÿ��ľ�������֮��ĸ߶ȵ����ֵ
			 * Ȼ������Щ���ֵ�У����һ�����ֵ
			 */
			int maxHign = 0;
		    for(int i =0;i <blocks.length;i++)//�������е�ľ��
		    {
		            maxH[i] = blocks[i].z;//��ľ�����ȥ֮����С�ĸ߶Ⱦ��Ǳ���ĸ߶ȣ����ǶԸ�ľ�����ȥ֮��߶ȵ����ֵ��һ����ʼ��
		            for(int j=i-1;j>=0;j--){
						if(blocks[j].x > blocks[i].x && blocks[j].y > blocks[i].y)
						{
							/*
							 * �ۼӸ�ľ���������֮�󣬿��Է����ڸ�ľ����������е�ľ��ĸ߶�
							 */
							maxH[i]=maxH[j] + blocks[i].z> maxH[i]?maxH[j] + blocks[i].z:maxH[i];
						}
					}
		            //�����i��ľ������������ʱ������ֵ������ʷ�¸ߣ���ˢ����ʷ�¸�
		           maxHign=maxH[i]>maxHign?maxH[i]:maxHign;
		    }
			System.out.println("Case "+count+": maximum height = "+maxHign);
		}
	}
}
