package Algorithm2;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;

        System.out.print("n값: ");
        n = sc.nextInt();
        System.out.print("w값: ");
        w = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*"); // 줄 바꿈 없이 출력
            if (i % w == w - 1) {
                System.out.println();
            }
        }
    }
}