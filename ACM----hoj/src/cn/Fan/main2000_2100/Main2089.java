package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:
 * @author 范威振
 * @date 2014-4-26
 * @Describe   		统计一个区间内	不是不吉利数	的个数（不包含4，不包含62）
 */
public class Main2089 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext()){
			//数据输入
			int n=scan.nextInt();
			int m=scan.nextInt();
			if(m==0&&n==0){
				break;
			}			
			//遍历区间内的所有数，找到不吉利的数的个数
			int count=0;
			if(n<=4){//循环判断不了一位数，所以，在这判断一下n是不是小于等于4，如果是的话，那么不是不吉利的总数就要减一了，如果n大于4那么正好不用操作
				count=-1;
			}
			
			for (int i=n; i <=m; i++) {
				//因为无法确定你的	m	或者	n到底有多大（最大是一百万，笨点的方法就是去找所有的位，太麻烦），所以可以将数字转化为字符串处理
				String str=""+i;
			
				//遍历字符串，看是不是不吉利数
				boolean flag=true;
				for (int j = 0; j <str.length()-1; j++) {//因为要判断62，所以只能遍历到字符串的倒数第二位，这就导致了一位数的数判断不了
					if(str.charAt(j)=='4'||str.charAt(j+1)=='4'||(str.charAt(j)=='6'&&str.charAt(j+1)=='2')){
						//只要满足上面的任何一个条件，那么该数都是不吉利数，那么就不加以统计
						flag=false;
						break;
					}
				}
				if(flag){
					count++;
				}
			}
			System.out.println(count);			
		}
	}

}
