package multi.test03_substring;

import java.util.Scanner;

public class Main3 {
    /*
     * 입력받은(주어진) 문자열의 입력받은 알파벳 한개(처음발생하는c)부터 끝까지를 뽑아서
     * 출력하는 프로그램을 작성하세요
     * abcdefg 인경우 cdefg 가 출력됨
     *
     *
     * 첫줄의 문자는 1개의 알파벳,2번째줄에는 여러문자열을 입력받는다.
     *
     * 입력 예시 :
     *
     * c
     *
     * abc def gccc ddd
     *
     * 출력 예시 :
     *
     * c def gccc ddd
     *
     *
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
//        String str1 = "c";
//        String str2 = "abc def gccc ddd";


        System.out.println(solution(str1,str2));
    }//end main

    private static String solution(String str1,String str2){
        String answer = str2.substring(str2.indexOf(str1));

        return answer;
    }
}//end class
