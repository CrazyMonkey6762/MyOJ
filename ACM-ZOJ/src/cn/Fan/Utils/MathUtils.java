package cn.Fan.Utils;


/**
 * @ClassName_Math
 * @author_Stone6762
 * @CreationTime_2014-8-25 下午07:06:10
 * @Description_
 */
public class MathUtils {
	
	/** 
	 * @Title_isSu
	 * @Describe_判断一个数是不是素数
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
	 * @Describe_保留一个double的指定小数点位数
	 * @Author_Stone6762
	 * @param src源double
	 * @param length保留的小数点位数
	 * @param isUp是否四舍五入
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
