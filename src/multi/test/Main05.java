package multi.test;

import multi.test2.NoteBook;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("hello");

        //패키지가 다른 경우에도 객체 생성을 할 수 있도록 하려면
        //생성자 정의시 public 선언을 해줘야한다.
        NoteBook nb = new NoteBook();

        nb = new NoteBook("TT", 3,'1' );


    }
}
