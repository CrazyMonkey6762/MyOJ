package cn.Fan.prictice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName_Main1358
 * @author_Stone6762
 * @CreationTime_2015年9月3日 上午11:45:24
 * @Description_
 */
public class Main1358 {

	private static int[] getNext(String T) {
		int[] next = new int[T.length() + 1];
		int j = 1;
		int k = 0;
		next[0] = -1;
		next[1] = 0;
		while (j < T.length()) {
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

	public static void main(String[] args) throws IOException{
		StreamTokenizer in = new StreamTokenizer(new InputStreamReader(
				System.in));
		PrintWriter out = new PrintWriter(System.out);
		int testNumb = 0;
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			int slength = (int) in.nval;
			if (slength == 0) {
				break;
			}
			testNumb++;
			out.println("Test case #" + testNumb);
			out.flush();
			in.nextToken();
			String str = in.sval;
			int[] Next = getNext(str);
			System.out.println(Arrays.toString(Next));
			for (int j = 1; j <= slength; j++) {
				int ct = j - Next[j];
				if (j % ct == 0 && j / ct > 1) {
					out.println(j + " " + j / ct);
					out.flush();
				}
			}
			out.println();
			out.flush();
		}

	}
}
