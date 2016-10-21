package cn.Fan.Utils;

/**
 * @ClassName_StringUtils
 * @author_Stone6762
 * @CreationTime_2014年10月6日 下午10:58:51
 * @Description_
 */
public class StringUtils {

	/**
	 * @Title_strArr2Str
	 * @Describe_将一个字符串数组变成一个字符串_两个字符串中间穿插上指定的字符
	 * @Author_Stone6762
	 * @param arr字符串数组
	 * @param signs中间想要插入的字符
	 * @return
	 */
	public static String strArr2Str(String[] arr, String signs) {
		String aim = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				aim += arr[i];
				continue;
			}
			aim += signs + arr[i];
		}

		return aim;
	}

	/**
	 * @Title_inversin字符串倒置
	 * @Describe_
	 * @Author_Stone6762
	 * @param sings
	 * @return
	 */
	public static String inversin(String sings) {
		String aim = "";
		for (int i = sings.length() - 1; i >= 0; i--) {
			aim += sings.charAt(i);
		}
		return aim;
	}

	/**
	 * @Title_insert2index
	 * @Describe_将一个字符串插入到另一个字符串的指定位置
	 * @Author_Stone6762
	 * @param byAim被插入的字符串
	 * @param aim想要插入的字符串
	 * @param index位置
	 * @return
	 */
	public static String insert2index(String byAim, String aim, int index) {
		index--;
		String reslut = byAim.substring(0, index) + aim
				+ byAim.substring(index, byAim.length());
		return reslut;
	}

}
