package Algoritm.chap01;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;


        System.out.println("왼쪽 아래가 직각인 이등변사각형을 출력합니다.");

        do{
            System.out.println("몇 단 삼각형입니까?");
            n=sc.nextInt();
        }while (n<=0);


        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
        spira(n);
        npira(n);

//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++)
//                System.out.print("*");
//            System.out.println();
//        }



    }

    static void triangleLB(int n){
        System.out.println("왼쪽 아레가 직각인 이등변 삼각형 출력");

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i;  j++)
                System.out.print("*");
                System.out.println();

        }

    }

    static void triangleLU(int n){
        System.out.println("왼쪽 위가 직각인 이등변삼각형을 출력");

        for (int i = 0; i < n; i++) {  // i는 0부터 n-1까지
            for (int j = 0; j < n - i; j++) {  // j는 0부터 n-i-1까지
                System.out.print("*");
            }
            System.out.println();  // 줄 바꿈
        }
    }

    static void triangleRU(int n){
        System.out.println("오른쪽 위가 직각인 이등변삼각형 출력");
        for (int i = 0; i < n; i++) {  // i는 0부터 n-1까지
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();  // 줄 바꿈
        }
    }

    static void triangleRB(int n){
        System.out.println("오른쪽 아래가 직각인 이등변삼각형을 출력");
        for (int i = 0; i < n; i++) {  // i는 0부터 n-1까지
            // 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();  // 줄 바꿈
        }
    }

    static void spira(int n){
        for (int i = 0; i <n; i++) {

            //공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            //별 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void npira(int n){
        for (int i = 0; i <n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(i%10 +1);
            }
            System.out.println();
        }
    }




}


