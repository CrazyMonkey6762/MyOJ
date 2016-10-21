package cn.stone.Math;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * @ClassName_Main1068_2
 * @author_Stone6762
 * @CreationTime_2015年1月24日 下午11:09:28
 * @Description_
 */
public class Main1068_2 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new InputStreamReader(
				System.in));
		PrintWriter out = new PrintWriter(System.out);
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) in.nval;
			in.nextToken();
			int m = (int) in.nval + n;
			int arr[] = new int[m];
			for (int i = 0; i < m; i++) {
				in.nextToken();
				arr[i] = (int) in.nval;
			}
			Arrays.sort(arr);
			out.print(arr[0]);
			out.flush();
			for (int i = 1; i < m; i++) {
				if (arr[i] != arr[i - 1]) {
					out.print(" " + arr[i]);
					out.flush();
				}
			}
			out.println();
			out.flush();
		}
	}
}
