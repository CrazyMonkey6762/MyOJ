package cn.Fan.prictice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
 * @ClassName_Main1196
 * @author_Stone6762
 * @CreationTime_2015年9月3日 下午3:36:41
 * @Description_
 */
public class Main1196 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new InputStreamReader(
				System.in));

		PrintWriter out = new PrintWriter(System.out);

		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) in.nval;
			if (n == 0) {
				break;
			}
			int result = 1;
			while (n % 2 == 0) {
				result *= 2;
				n /= 2;
			}
			out.println(result);
			out.flush();
		}
	}
}
