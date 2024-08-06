package Algoritm.chap01;

import java.util.Scanner;

public class TwoDigists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.println("2자리 양수를 입력하시오");

        do{
            System.out.print("no값:");
            no=sc.nextInt();
        }while (no < 10 || no > 99);

        System.out.println("변수 no값은"+ no + "이돠었습니다");

    }
}
