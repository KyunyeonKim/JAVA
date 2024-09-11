package Algoritm.chap01;

import java.util.Scanner;

public class cardConv {
    static int cardConv(int x , int r , char[] d){
        int digists = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digists] = dchar.charAt(x % r);
            x/=r;
        }while (x!=0);

        for (int i = 0; i < digists / 2; i++) {
            char t = d[i];
            d[i] = d[digists - i - 1];
            d[digists - i - 1] = t;
        }
        return digists;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다");
        do {
            do {
                System.out.println("변환하는 음이 아닌 정수:");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.println("어떤 진수로 변환할까요? (2~36)");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.println(cd + "진수로");
            for (int i = 0; i < dno; i++)
                System.out.println(cno[i]);
            System.out.println("입니다.");

            System.out.println("한 번 더 할까요? 1.예 2.아니오");
            retry = sc.nextInt();
        }while (retry == 1);
    }
}
