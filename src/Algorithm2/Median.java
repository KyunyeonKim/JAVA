package Algorithm2;

import java.util.Scanner;

public class Median {

    static int median(int a , int b , int c){
        if (a >= b)
            if(b>=c)
            return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b>c)
            return c;
        else
            return b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("세수의 중앙값을 구하시오");
        System.out.println("a의수를 넣으시오");
        int a = sc.nextInt();
        System.out.println("b의수를 넣으시오");
        int b = sc.nextInt();
        System.out.println("c의수를 넣으시오");
        int c = sc.nextInt();

        System.out.println("3수의 중압값은"+median(a,b,c));

    }
}
