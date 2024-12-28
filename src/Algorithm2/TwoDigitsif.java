package Algorithm2;

import java.util.Scanner;

public class TwoDigitsif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("2자리 양수르 입력하세요");
        no = sc.nextInt();
        if (no >= 10 && no <= 99){
            System.out.println("2자리양수"+ no+"입니다");
        }else {
            System.out.println("2자리 양수가 아닙니다");
        }
    }
}
