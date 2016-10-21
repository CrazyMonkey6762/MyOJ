package cn.Fan.Main1000_1100;

import java.util.Scanner;
/**
 * 
 * @2014-5-19上午09:19:14
 * @Author:范威振
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
		int count = 0;//标识，第几个测试实例
		while (scan.hasNext()) {
			count++;
			int n = scan.nextInt();//标识有几种木块
			if (n <= 0) {
				break;
			}
			Main1069 blocks[] = new Main1069[n * 3];//标识，所以的木块的总数
			int maxH[]=new int [n*3];//第i个木块放上面之后，高度的最大值
			// 1.接受输入的数据，并根据每次的输入，构造可能的三个三角形
			/*
			 * 因为每个木块的个数都是无限的，所以任何一个数据都可以看做是长宽高，
			 * 又因为每一个木块都只有三个不同的面积
			 * 所以就将一个输入构造出三个木块，来当做是无限的木块的问题
			 * 此时的长宽高已经确定，z就是高，x y是底面的长和宽
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
			// 2.根据长宽进行排序
			/*
			 * 很明显的是，长度最大的，虽然不一定放在最下面，但是一定不会放置在上面
			 * 所以，按照长度排序，如果长度相同，可以按照宽排序
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
			//3.开始放置木块，并求其最大值
			/*
			 * 假设所有的木块都能放置在上面，求每个木块放上面之后的高度的最大值
			 * 然后，在这些最大值中，求出一个最大值
			 */
			int maxHign = 0;
		    for(int i =0;i <blocks.length;i++)//遍历所有的木块
		    {
		            maxH[i] = blocks[i].z;//该木块放上去之后，最小的高度就是本身的高度，算是对该木块放上去之后高度的最大值的一个初始化
		            for(int j=i-1;j>=0;j--){
						if(blocks[j].x > blocks[i].x && blocks[j].y > blocks[i].y)
						{
							/*
							 * 累加该木块放在上面之后，可以放置在该木块下面的所有的木块的高度
							 */
							maxH[i]=maxH[j] + blocks[i].z> maxH[i]?maxH[j] + blocks[i].z:maxH[i];
						}
					}
		            //如果第i个木块放置在上面的时候的最大值大于历史新高，就刷新历史新高
		           maxHign=maxH[i]>maxHign?maxH[i]:maxHign;
		    }
			System.out.println("Case "+count+": maximum height = "+maxHign);
		}
	}
}
