package cn.Fan.Utils;

/**
 * @ClassName_Printf
 * @author_Stone6762
 * @CreationTime_2014��10��7�� ����8:17:33
 * @Description_
 */
public class Printf {

	/**
	 * @Title_strArr2Str
	 * @Describe_��һ���ַ���������һ���ַ���_�����ַ����м䴩����ָ�����ַ�
	 * @Author_Stone6762
	 * @param arr�ַ�������
	 * @param signs�м���Ҫ������ַ�
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
