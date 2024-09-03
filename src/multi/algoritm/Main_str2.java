package multi.algoritm;

import java.util.Scanner;

public class Main_str2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }


    private static int solution(String str){
        System.out.println(str);
       int answer = str.length();

        return answer;
    }

}
