package cn.Fan.main2000_2100;

import java.util.Scanner;

/**
 * @Title:			求一个正偶数，	可以 		拆分成	多少种	不同的		素数
 * @author 范威振
 * @date 2014-4-23
 * @Describe 
 */
public class Main2098 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n<=0){
				break;
			}else if(n<8){//经分析易知，当n小于8时，都是0
				System.out.println(0);
			}else{
				int count=0;
				boolean flage1,flage2;//分别         标识         相应的两个          奇数                 是不是素数
				
				for (int i=3; i <n/2; i=i+2) {//因为都是对应的，所有判断一半的数据即可，又因为都是奇数，所以自加2
					flage1=flage2=true;
					for (int j=3; j <i; j=j+2) {
						if(i%j==0){   //任何一个可以满足，那么该数就不是素数
							flage1=false;
							break;
						}
					}
					if(flage1){//如果    小的     那个          不是素数         ，那么就不需要判断大的那一个了
						for (int j=3; j <n-i; j=j+2) {
							if((n-i)%j==0){
								flage2=false;
								break;
							}
						}
					}
					if(flage1&&flage2){//只有当两个都是素数时，才满足条件，此时 n 拆分的可能性总数才自加
						count++;
					}
				}
				
				System.out.println(count);
			}
		}
	}

}
