package Algoritm.chap01;

import java.util.Scanner;

public class SeqSearch {

    static int seqSearch1(int[] a , int n, int key){
        int i = 0;

        while (true){
            if (i == n)
                return -1;
            if (a[i] == key)
                return i;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        System.out.println("요솟수");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i <num ; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = sc.nextInt();
        }

        System.out.println("검색할값");
        int key = sc.nextInt();
        int idx = seqSearch1(x,num,key);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다");
            else
            System.out.println("그 값은x["+idx+"]에 있습니다");

    }
}