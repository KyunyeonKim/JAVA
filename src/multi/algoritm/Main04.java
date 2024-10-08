package multi.algoritm;

import java.util.stream.IntStream;

public class Main04 {

    public static void main(String[] args) {
        System.out.println("hello...");

        //IntStream객체로 스트림 범위지정 할 수 있다.
        //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(IntStream.range(0,10).boxed().toList());

        //forEach함수를 사용하여 출력방법을 달리할 수 있다.
        IntStream.range(0,10).boxed().forEach(System.out::print);//한줄출력 : 0123456789
        IntStream.range(0,10).boxed().forEach(System.out::println);//개행하면서 출력

        //filter + forEach : 0~9 정수들중 2의배수들만 출력하세요
        IntStream.range(0,10).boxed().filter(x->x%2==0).forEach(System.out::println);
        
        //map + forEach : 0~9 정수들을 모두10배 증가시켜서 출력하세요
        IntStream.range(0,10).boxed().map(x->x*10).forEach(System.out::println);

    }//end main


}//end class
