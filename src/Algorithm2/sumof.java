package Algorithm2;

import java.util.Scanner;

public class sumof {

    // a와 b 사이의 정수 합을 계산하는 메서드
    static int sumof(int a, int b) {
        int sum = 0;

        // a가 b보다 큰 경우를 처리하여 항상 작은 값부터 큰 값까지 계산
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {  // a부터 b까지 포함하여 합산
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a를 입력하세요:");
        int a = sc.nextInt();

        System.out.println("b를 입력하세요:");
        int b = sc.nextInt();

        System.out.println("a와 b 사이의 정수 합은: " + sumof(a, b));
    }
}
