package Algorithm2;

import java.util.Scanner;

public class Gaus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = (1+a) * (a/2);
        if(a%2 == 1) sum+=(a+1)/2;

        System.out.println("1부터"+a+ "까지의합"+ sum);

    }
}
