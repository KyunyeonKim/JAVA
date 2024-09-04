package multi.test07_collection;

import java.sql.Array;
import java.util.*;

public class Main {

    /*
     * 입력받은(주어진) 문자열에서 끝에서 3단어를 제거하여 출력하는 프로그램을 작성하세요
     *
     * 입력 예시 :
     *
     * Hello world java html css
     *
     * 출력 예시 :
     *
     * Hello world
     *
     * aa bb cc dd ee ff
     * aa bb cc
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        String str = "Hello world java html css";
        String str = "aa bb cc dd ee ff";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        System.out.println(str);
        String answer = "";

        String[] arr = str.split(" ");
        //System.out.println(Arrays.toString(arr));

        //1.컬렉션을 사용하지 않고 구현
//        for (int i = 0; i < arr.length-3; i++) {
//            answer += arr[i]+" ";
//        }
//        answer = answer.strip();//or trim() 공백제거

        //2. 컬렉션 사용1
//        List<String> list = Arrays.asList(arr);
//        for (int i = 0; i < arr.length-3; i++) {
//            answer += list.get(i)+" ";
//        }
//        answer = answer.strip();//or trim() 공백제거

        //3. 컬렉션 사용2 - remove사용하는 방식
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//        }
//        for (int i = arr.length-1; i >= arr.length-3 ; i--) {
//            list.remove(i);
//        }
//        answer = String.join(" ",list);

        //4.스텍(Stack)을 사용하는 방식
        Stack<String> st = new Stack<>();
        for (int i = 0; i < arr.length-3; i++) {
            st.push(arr[i]);
        }
        answer = String.join(" ",st);

        return answer;
    }
}//end class
