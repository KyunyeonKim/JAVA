package Algorithm2;

import java.util.Random;
import java.util.Scanner;

public class maxOfArrayRand {

    static int maxOf(int[] a){
        int max = a[0];
        for (int i = 1; i <a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최댓값을 구하시오");
        System.out.println("사람수를 입력하세요");
        int a= sc.nextInt();
        int[] height = new int[a];

        System.out.println("킷값은 아래와 같습니다.");

        for (int i = 0; i <a; i++) {
            height[i] = 100+rand.nextInt(90);
            System.out.println("height["+i+"] = "+height[i]);
        }

        System.out.println("최댓값은"+maxOf(height)+"입니다");

    }
}