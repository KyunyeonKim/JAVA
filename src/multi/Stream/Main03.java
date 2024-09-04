package multi.Stream;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        //System.out.println(str);
        String answer = null;

        answer = Arrays.asList(str.split(" ")).stream().collect(Collectors.joining((CharSequence) Collectors.joining()));
        return answer;
    }
}
