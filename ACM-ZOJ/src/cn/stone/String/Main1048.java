package cn.stone.String;

import java.util.Scanner;

/**
 * @ClassName_Main1048--�ַ�����ת
 * @author_Stone6762
 * @CreationTime_2014��12��1�� ����11:26:13
 * @Description_
 */
public class Main1048 {
	
	/**
	 * @Describe_��һ���ַ���������һ���ַ���_�����ַ����м䴩����ָ�����ַ�
	 * @Author_Stone6762
	 * @param arr�ַ�������
	 * @param c�м���Ҫ������ַ�
	 * @return
	 */
	private static String strArr2Str(String[] arr, char c) {
		String aim = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				aim += arr[i];
				continue;
			}
			aim += c + arr[i];
		}

		return aim;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			String ts = scan.nextLine();
		
			for (int nl = 0; nl < n; nl++) {
				String aim = "";
				String[] arr = scan.nextLine().split(" ");
			
				for (int i = 0; i < arr.length; i++) {
					String t = "";
				
					for (int j = arr[i].length() - 1; j >= 0; j--) {
						t += arr[i].charAt(j);
					}
					
					arr[i] = t;
				}
		
				System.out.println(strArr2Str(arr, ' '));
			}
		}
	}

}
