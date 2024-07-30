package Algoritm.chap01;

import java.util.Scanner;

//3개의 값중 최댓값 구하기
public class Max3 {
    public static void main(String[] args) {
        //scanner 사용 정수값 입력받는다
        Scanner scanner = new Scanner(System.in);

        System.out.println("세게의 정수값 최대값을 구합니다");
        System.out.println("a의 값: "); int a = scanner.nextInt();
        System.out.println("b의 값: "); int b = scanner.nextInt();
        System.out.println("c의 값: "); int c = scanner.nextInt();


        //max에 a값 할당
        int max = a;

        //a값을 가지고있는 max 와 b를 비교하고 크면 max=b대입
        if(b > max)max = b;
        //b값을 가지고있는 max 와 c를 비교하고 크면 max=c대입
        if(c > max)max = c;

        //3개의 데이터에서 걸러진값 max 출력
        System.out.println("최대값은" + max + "입니다");

    }
}
