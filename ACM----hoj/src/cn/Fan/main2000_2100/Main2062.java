package cn.Fan.main2000_2100;
import java.util.Scanner;
/**
 * 
 * @2014-5-20����04:50:51
 * @Author:������
 * @description
 */
public class Main2062 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long g[] = new long[21];// ����i��Ԫ��ʱ��ÿ���Ԫ������
		for (int i = 1; i < g.length; i++) {
			g[i] = (i - 1) * g[i - 1] + 1;
		}
		while (scan.hasNext()) {
			int n = scan.nextInt();
			long m = scan.nextLong();
			long s[] = new long[n + 3];// ��ʱ����ÿһ��Ӧ�������ֵ�������м���������һ��ý��
			for (int i = 0; i < s.length; i++) {
				s[i] = i;// ÿѭ��һ�ξ����¹�λÿ����Ԫ��
			}
			int t;
			while (n > 0 && m > 0) {
				t = (int) (m / g[n] + (m % g[n] > 0 ? 1 : 0));// �ж��ڵڼ�������
				if (t > 0)// �õ���m���Ӽ��ڷ����ĵ�t��,��t>0
				{
					System.out.print(s[t]);// ���ÿһ�η���ʱ�����ţ������飩
					for (int i = t; i <= n; i++) {
						s[i] = s[i + 1];// ��s[i]+=1,���Ƿ���:��n���У���2��Ԫ���ڵ�n��ʱ��Ϊ������һ����
					}
					m -= ((t - 1) * g[n] + 1);// ��ȥ(t-1�����Ӽ���+1��,m��Ϊ��ʾ��ʣ���Ӽ���λ�ڵڼ���
					if(m!=0){
						System.out.print(" ");						
					}
				}
				n--;// ���εݼ�,ֱ��ִ�������if������˳�
			}
			System.out.println();
		}
	}
}