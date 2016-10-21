package cn.Fan.Utils;

/**
 * @ClassName_StringUtils
 * @author_Stone6762
 * @CreationTime_2014��10��6�� ����10:58:51
 * @Description_
 */
public class StringUtils {

	/**
	 * @Title_strArr2Str
	 * @Describe_��һ���ַ���������һ���ַ���_�����ַ����м䴩����ָ�����ַ�
	 * @Author_Stone6762
	 * @param arr�ַ�������
	 * @param signs�м���Ҫ������ַ�
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
	 * @Title_inversin�ַ�������
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
	 * @Describe_��һ���ַ������뵽��һ���ַ�����ָ��λ��
	 * @Author_Stone6762
	 * @param byAim��������ַ���
	 * @param aim��Ҫ������ַ���
	 * @param indexλ��
	 * @return
	 */
	public static String insert2index(String byAim, String aim, int index) {
		index--;
		String reslut = byAim.substring(0, index) + aim
				+ byAim.substring(index, byAim.length());
		return reslut;
	}

}
