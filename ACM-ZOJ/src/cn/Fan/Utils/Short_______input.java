package cn.Fan.Utils;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
 * @Title_test.java
 * @author_Stone6762
 * @CreationTime_2014��12��1�� ����9:50:30
 * @Description
 */
public class Short_______input {

	public static void main(String[] args) throws IOException {
		
		StreamTokenizer in = new StreamTokenizer(new InputStreamReader(
				System.in));
		
		PrintWriter out = new PrintWriter(System.out);
		
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			// ��һ�������ʱ���ü�in.nextToken();
			long n = (long) in.nval;

			// �Ժ�����붼����in.nextToken();
			in.nextToken();
			int temp = (int) in.nval;// Ĭ�ϵĻ�ȡ����һ��double���͵�����
		
			
			
			
			
			out.println(temp);
			out.flush();//ÿ�ε��������out.flush();
		}
	}
}
