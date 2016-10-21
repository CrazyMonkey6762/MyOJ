package cn.Fan.Utils;


/**
 * @ClassName_Math
 * @author_Stone6762
 * @CreationTime_2014-8-25 ����07:06:10
 * @Description_
 */
public class MathUtils {
	
	/** 
	 * @Title_isSu
	 * @Describe_�ж�һ�����ǲ�������
	 * @Author_Stone6762
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		int signs=(int) Math.sqrt(n);
		for (int i = 2; i <=signs; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	/** 
	 * @Title_double2ExactDouble
	 * @Describe_����һ��double��ָ��С����λ��
	 * @Author_Stone6762
	 * @param srcԴdouble
	 * @param length������С����λ��
	 * @param isUp�Ƿ���������
	 * @return
	 */
	public static double double2ExactDouble(double src,int length ,boolean isUp){
		long temp=(long) Math.pow(10, length);
		double temp2=src*temp;
		if(isUp){
			temp2+=0.5;
		}
		return Math.ceil(temp2)/temp;
	}
	
	
	public static void main(String[] args) {
		int a=6;
		System.out.println(isPrime(a));
		
	}
	
	
}
