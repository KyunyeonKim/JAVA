package multi.test06_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
     * 입력받은(주어진) 문자열을 순정렬해서 출력하는 프로그램을 작성하세요
     *
     * 입력 예시 :
     *
     * 33 22 44 11 111
     *
     * 출력 예시 :
     *
     * 11 22 33 44 111
     *
     *
     */


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
//        String str = "33 22 44 11 111";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        //System.out.println(str);
        String answer = null;

        String[] arr = str.split(" ");
        //System.out.println(Arrays.toString(arr));

        //문자열에대한 정렬인경우 간단하다.
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));//[11, 111, 22, 33, 44]

        //요소타입은 문자열이지만 정수정렬의 결과를 얻고자 한다면 아래와같이...
        Integer[]  sus = new Integer[arr.length];
        for (int i = 0; i < sus.length; i++) {
            sus[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(sus);
        //System.out.println(Arrays.toString(sus));//[11, 22, 33, 44, 111]

        //문자열 배열에 재할당
        for (int i = 0; i < sus.length; i++) {
             arr[i] = String.valueOf(sus[i]);
        }
        //출력용 조인
        answer = String.join(" ",arr);
        
        return answer;
    }
}//end class
