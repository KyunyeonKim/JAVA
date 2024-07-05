package multi.test;


import multi.test2.Person;

import java.util.Random;


//import aaa.com.Person; //error
public class Main {
    public static void main(String[] args) {

        //자동 import 설정하기
        String s = new String();
//        Object obj = new Object();
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);

        //동일 클래스명을 한곳에서 모두 사용하고자 한다

        System.out.println(Person.tel);

        Person.tel = "010";
        System.out.println(Person.tel);

        //객체 생성후에 값변경


        Random r = new Random();

        for(int i = 0; i<5; i++){
            System.out.println(r.nextInt());
            System.out.println(r.nextBoolean());
            System.out.println(r.nextDouble());
        }

    }
}
