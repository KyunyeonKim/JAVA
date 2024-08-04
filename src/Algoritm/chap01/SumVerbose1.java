package Algoritm.chap01;

import java.util.Scanner;

public class SumVerbose1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("1부터n까지의 합을 구합니다.");

        do {
            System.out.print("n값:");
            n=sc.nextInt();
        }while (n <= 0);

        int sum = 0;

        for (int i = 0; i <=n; i++) {
            if (i < n)
                System.out.print(i+"+");
                else
                System.out.print(i+"=");
                sum +=i;
        }
        System.out.println(sum);
    }
}
