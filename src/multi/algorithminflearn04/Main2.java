package multi.algorithminflearn04;

import java.util.Scanner;

public class Main2 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
            String str = "found7, time: study; Yduts; emit, 7Dnuof";

            System.out.println(solution(str));


        }//end main

        private static String solution(String str) {
            System.out.println(str);
            String answer = "NO";

            //1.알파벳 검증
//		System.out.println(String.valueOf(str.charAt(0)).matches("[a-zA-Z]"));
//		System.out.println(str.replaceAll("[a-zA-Z]", "A"));
//		System.out.println(str.replaceAll("[^a-zA-Z]", "A"));
//		System.out.println(str.replaceAll("[^a-zA-Z]", ""));

            //2.알파벳이 아닌 모든 문자를 빈문자로 변경해서 재할당
            str = str.replaceAll("[^a-zA-Z]", "");//foundtimestudyYdutsemitDnuof

            //3.회문문자 검증 : 주어진 문자열과 뒤집은 문자열을 비교(대소문자 구분없이)
            if(str.equalsIgnoreCase(
                    new StringBuffer(str).reverse().toString())) {
                answer = "YES";
            }

            return answer;
        }

    }//end class
