package cn.Fan.prictice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

/**
 * @ClassName_Main1205
 * @author_Stone6762
 * @CreationTime_2015年9月3日 下午5:19:00
 * @Description_
 */
public class Main1205 {
	public static void main(String[] args) throws IOException{
		StreamTokenizer in = new StreamTokenizer(new InputStreamReader(
				System.in));		
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			int testNumber = (int) in.nval;
			for (int t = 0; t < testNumber; t++) {
				in.nextToken();
				int n = (int) in.nval;
				long sum = 0;
				long max = -1;
				for (int i = 0; i < n; i++) {
					in.nextToken();
					long temp = (long) in.nval;
					max = max > temp ? max : temp;
					sum += temp;
				}
				sum -= max;
				if (sum + 1 >= max) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
