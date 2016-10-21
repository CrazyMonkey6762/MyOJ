package cn.Fan.main2000_2100;
import java.util.Scanner;
/**
 * 
 * @2014-5-20下午04:50:51
 * @Author:范威振
 * @description
 */
public class Main2062 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long g[] = new long[21];// 当有i个元素时，每组的元素总数
		for (int i = 1; i < g.length; i++) {
			g[i] = (i - 1) * g[i - 1] + 1;
		}
		while (scan.hasNext()) {
			int n = scan.nextInt();
			long m = scan.nextLong();
			long s[] = new long[n + 3];// 暂时保持每一次应该输出的值，算是中间运算结果的一个媒介
			for (int i = 0; i < s.length; i++) {
				s[i] = i;// 每循环一次就重新归位每组首元素
			}
			int t;
			while (n > 0 && m > 0) {
				t = (int) (m / g[n] + (m % g[n] > 0 ? 1 : 0));// 判断在第几组里面
				if (t > 0)// 得到第m个子集在分组后的第t组,若t>0
				{
					System.out.print(s[t]);// 输出每一次分组时候的组号（组中组）
					for (int i = t; i <= n; i++) {
						s[i] = s[i + 1];// 或s[i]+=1,我们发现:第n组中，第2个元素在第n个时变为它的下一个数
					}
					m -= ((t - 1) * g[n] + 1);// 减去(t-1组总子集数+1）,m变为表示在剩余子集中位于第几个
					if(m!=0){
						System.out.print(" ");						
					}
				}
				n--;// 依次递减,直到执行上面的if代码或退出
			}
			System.out.println();
		}
	}
}