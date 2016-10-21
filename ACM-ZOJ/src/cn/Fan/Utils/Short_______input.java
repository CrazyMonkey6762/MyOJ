package cn.Fan.Utils;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
 * @Title_test.java
 * @author_Stone6762
 * @CreationTime_2014年12月1日 下午9:50:30
 * @Description
 */
public class Short_______input {

	public static void main(String[] args) throws IOException {
		
		StreamTokenizer in = new StreamTokenizer(new InputStreamReader(
				System.in));
		
		PrintWriter out = new PrintWriter(System.out);
		
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			// 第一个输入的时候不用加in.nextToken();
			long n = (long) in.nval;

			// 以后的输入都加上in.nextToken();
			in.nextToken();
			int temp = (int) in.nval;// 默认的获取的是一个double类型的数据
		
			
			
			
			
			out.println(temp);
			out.flush();//每次的输出都有out.flush();
		}
	}
}
