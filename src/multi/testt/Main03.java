package multi.testt;

import java.util.Arrays;
import java.util.Date;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        Date date = new Date();
        System.out.println(date);

        java.sql.Date sd = new java.sql.Date(0);


        String txt = "abcdef";
        System.out.println(txt.indexOf("a")); // 1
        System.out.println(txt.startsWith("ab"));
        System.out.println(txt.endsWith("ab"));

        String txt2="A";
        System.out.println(txt2.hashCode());
        String txt3="AA";
        System.out.println(txt3.hashCode());
        String txt4="java javascript html css";
        System.out.println(txt4.replace("java","JAVA"));

        //1.반복되는 문자열 처리 : repeat()
        System.out.println("*".repeat(5));
        System.out.println("abc".repeat(5));

        //2.공백제거
        String str = " ";
        System.out.println(str);
        System.out.println("\u2005");
        System.out.println(str.equals("\u2005"));

        str = "\t\n\t  hello   \u2005";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.trim());//공백제거
        System.out.println(str.trim().length());//공백제거
        System.out.println(str.strip());//공백제거 jdk11
        System.out.println(str.strip().length());//공백제거 jdk11

        //선행공백제거
        System.out.println(str.stripLeading());

        //후행공백제거
        System.out.println(str.stripTrailing());

        //빈공백문자열 확인메소드
        System.out.println("       \n\t\u2005".isBlank());

        //문자열의 길이가 0인지확인
        System.out.println("       \n\t\u2005".isEmpty());

        str = "java\nhtml\n  \n css\n string";
        System.out.println(Arrays.toString(str.split("\n")));
        System.out.println(str.split("\n").length);
        System.out.println(str.lines().count());
        


    }
}
