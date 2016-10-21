package cn.Fan.main2200_2300;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

/**
 * @ClassName_Main2222
 * @author_Stone6762
 * @CreationTime_2015年1月28日 上午11:05:56
 * @Description_
 */
public class Main2222 {

	private static int[] getNext(String T) {
		int[] next = new int[T.length() + 3];
		int j = 1;
		int k = 0;
		next[0] = -1;
		next[1] = 0;
		int length = T.length();
		while (j < length - 1) {
			if (T.charAt(j) == T.charAt(k)) {
				next[j + 1] = k + 1;
				j++;
				k++;
			} else if (k == 0) {
				next[j + 1] = 0;
				j++;
			} else {
				k = next[k];
			}
		}
		return next;
	}

	public static boolean hasApp(String S, String T) {
		int[] next = getNext(T);
		int i = 0;
		int j = 0;
		int sLength = S.length();
		int tLength = T.length();
		while (i < sLength && j < tLength) {
			if (j == -1 || S.charAt(i) == T.charAt(j)) {
				i++;
				j++;
			} else {
				j = next[j];
			}
		}
		if (j < tLength) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new InputStreamReader(
				System.in));
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			
			int tnumber = (int) in.nval;
			for (int l = 0; l < tnumber; l++) {
				in.nextToken();
				int keyNumber = (int) in.nval;
				String key[] = new String[keyNumber];
				for (int i = 0; i < keyNumber; i++) {
					in.nextToken();
					key[i] = in.sval;
				}
				in.nextToken();
				String signs = in.sval;
				int count = 0;
				for (int i = 0; i < keyNumber; i++) {
					if (hasApp(signs, key[i])) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}
