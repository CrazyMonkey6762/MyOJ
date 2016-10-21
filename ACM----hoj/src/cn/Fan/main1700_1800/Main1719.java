package cn.Fan.main1700_1800;

import java.util.Scanner;
public class Main1719 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0) {
                System.out.println("NO!");
                continue;
            }
            n += 1;
            while (n % 2 == 0 || n % 3 == 0) {
                if (n % 2 == 0) {
                    n /= 2;
                }
                if (n % 3 == 0) {
                    n /= 3;
                }
            }
            if (n == 1) {
                System.out.println("YES!");
            } else {
                System.out.println("NO!");
            }

        }
    }
}
