package multi.java18Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //제네릭 - Generic
        //타입을 특정해줌으로써 가동성,명확성을 높여준다

        //<> 기호안에 여러타입을 담을 수 있다 - 단 객체타입만 가능
        //리스트에서 제네릭을 사용하지않으면 서로 다른 타입을 담을수 있도록 허용한다
        List arr = new ArrayList();
        arr.add(111);
        arr.add("kim");
        arr.add(new Thread());

        //javascript = arr = [11,"kim",[33,44],{name:"lee"},,,]
        List arr2 = Arrays.asList(222,"lee",new Integer[]{11,22},new Thread());
        System.out.println(arr2.get(0).getClass());
        System.out.println(arr2.get(0).getClass().getName());
        System.out.println(arr2.get(1).getClass());
        System.out.println(arr2.get(1).getClass().getName());
        System.out.println(arr2.get(2).getClass());
        System.out.println(arr2.get(2).getClass().getName());

        //위와 같이 사용하는것은 프로그램 유지보수 및 개발에 불편하더라
        //jdk5버전이후로는 타입을 특정지울수있도록 제네릭 문법 지원
        //List<E>
        //T:Type , E:Element,K:key,V:Value,N:Number

        List<Object>list1 = Arrays.asList(222,"lee",new Integer[]{11,22},new Thread());
        List<?>list2 = Arrays.asList(222,"lee",new Integer[]{11,22},new Thread());
        List<Thread>list3 = Arrays.asList(new Thread());
        List<Integer>list4 = Arrays.asList(222);
        List<String>list5 = Arrays.asList("lee");
        List<Integer> list6 = Arrays.asList(33,33);
        List<Number>list7 = Arrays.asList(222,33,33);

    }
}
