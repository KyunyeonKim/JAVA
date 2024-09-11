package Algoritm.chap01;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("공간의 합을 입력하시오"+num);

        int [] a = new int[num];

        for(int i=0; i<num; i++){
            System.out.println("입력횟수 =" + i);
            a[i] = sc.nextInt();
        }
        int sum = sumOf(a);
        System.out.println("입력받은 수의 합"+sum);
        int []copy = copy(a);
        System.out.println("b배열내용");
        for (int i = 0; i <copy.length ; i++) {
            System.out.print(copy[i]+"");
        }
        System.out.println(Arrays.toString(copy));

        int []reverse = reverse(a);
        System.out.println(Arrays.toString(reverse));

    }

    static int sumOf(int[] a) {
        int sum = 0;

        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        return sum;
    };

    static int[] copy(int []a ){
        int[] b = new int[a.length];
       for (int i=0; i<a.length; i++){
           b[i] = a[i];
       }

       return b;
    }


    static int[] reverse(int[] a) {
        int[] c = new int[a.length];

        // 배열 a의 마지막 요소부터 시작하여 c 배열의 첫 번째 요소부터 복사
        for (int i = 0; i < a.length; i++) {
            c[i] = a[a.length - 1 - i];
        }

        return c;
    }

}
