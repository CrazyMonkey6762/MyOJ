package cn.Fan.main2100_2200;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

/**
 * @Title_Main2138_2.java 
 * @author_Stone6762  
 * @CreationTime_2014年12月1日 下午9:47:28
 * @Description
 */
public class Main2138_2  {
    private static boolean SuShu(int temp) {
        if (temp ==1||temp==0) {
            return false;
        }
        int signs=(int) Math.sqrt(temp);
        for (int i = 2; i <=signs ; i++) {
            if (temp % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new InputStreamReader(
                System.in));
        PrintWriter out =new PrintWriter(System.out);
        while (in.nextToken() != StreamTokenizer.TT_EOF) {
            long n = (long)in.nval;
            if(n<=0){
                break;
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                in.nextToken();
                int temp = (int)in.nval;
                if (SuShu(temp)) {
                    sum++;
                }
            }
            out.println(sum);
            out.flush();
        }
    }

}
