package Algoritm.chap01;

import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("1부터n까지의 합을 구합니다.");

        do {
            System.out.print("n값:");
            n=sc.nextInt();
        }while (n <= 0);

        int sum = 0;

        for (int i = 0; i <n ; i++) {
            System.out.print(i+ "+");
            sum += i;
        }

        System.out.print(n + "=");
        sum += n;
        System.out.println(sum);
    }
}
