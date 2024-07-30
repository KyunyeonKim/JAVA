package Algoritm.chap01;

import java.util.Scanner;

public class max4 {
    static int max4(int a ,int b , int c , int d){

        int max = a;

        if(max<b){
            max = b;
        }

        if(max<c){
            max = c;
        }

        if(max<d){
            max = d;
        }

        return max;
    }

    static int min3(int a, int b, int c, int d){
        int min = a;

        if (min > b) {
            min = b;
        }

        if (min > c) {
            min = c;
        }

        if (min == d) {
            min = d;
        }

        return min;
    }


    static int min4(int a, int b,int c, int d){

        int min = a;

        if (min > b) {
            min = b;
        }

        if(min > c){
            min = c;
        }
        if(min > d){
            min = d;
        }

        return min;
    }


    public static void main(String[] args) {

        System.out.println(max4(2,1,3,4));
        System.out.println(min3(5,3,2,4));
        System.out.println(min4(8,3,5,9));

    }
}
