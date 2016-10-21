package cn.Fan.Utils;

/**
 * @ClassName_Printf
 * @author_Stone6762
 * @CreationTime_2014年10月7日 下午8:17:33
 * @Description_
 */
public class Printf {

	/**
	 * @Title_strArr2Str
	 * @Describe_将一个字符串数组变成一个字符串_两个字符串中间穿插上指定的字符
	 * @Author_Stone6762
	 * @param arr字符串数组
	 * @param signs中间想要插入的字符
	 * @return
	 */
	public static String arr2String( Object[] arr, String signs) {
		String aim = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				aim += arr[i].toString();
				continue;
			}
			aim += signs + arr[i];
		}

		return aim;
	}
	
	
	
	private static String intArr2String( int[] arr) {
		String aim = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				aim += arr[i];
				continue;
			}
			aim += " "+ arr[i];
		}

		return aim;
	}
	
	
	
	
}
