package Algorithm2;

import java.util.Scanner;

public class MaxOfArray {

    static int maxOf(int[] a){
        int max = a[0];
        for (int i = 0; i <a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다");
        System.out.println("사람 수");
        int a =sc.nextInt();

        int[] height = new int[a];

        for (int i = 0; i <a; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println("최대값은"+maxOf(height));
    }
}
