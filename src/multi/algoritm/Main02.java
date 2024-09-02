package test.com;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main02 {

    public static void main(String[] args) {
        System.out.println("hello...");

        //List<Double> list = Arrays.asList(1.1,2.2,3.3,4.4);//OK
        //List<Double> list = Arrays.asList(new double[]{1.1,2.2,3.3,4.4});//기본타입배열 Error
        List<Double> list = Arrays.asList(new Double[]{1.1,2.2,3.3,4.4});//랩퍼타입배열 OK

        //3이상인 요소들은 몇개? 스트림으로 작성
        System.out.println(list.stream().filter((x)->x>=3.0).count());

        //각요소에 10배를 했을때 20 이상인 요소는 몇개?
        System.out.println(list.stream().filter((x)->x*10 >= 20).count());

        //필터링결과 타입이 stream타입을 리스트 컬렉션으로 변환 >> .toList()
        System.out.println(list.stream().filter((x)->x*10 >= 20).toList());

        //기본타입배열인 경우는 아래와 같이 사용가능
        System.out.println(Arrays.stream(new double[]{1.1,2.2,3.3,4.4}).filter((x)->x*10 >= 20).count());

        //필터링결과 타입이 DoubleStream타입을 리스트 컬렉션으로 변환 >> boxed().toList()
        System.out.println(Arrays.stream(new double[]{1.1,2.2,3.3,4.4}).filter((x)->x*10 >= 20).boxed().toList());

        System.out.println("==========================");

        //정수타입배열도 확인해볼께요
        int[] sus1 = new int[]{11,22,33};
        Integer[] sus2 = new Integer[]{11,22,33};

        //20보다 작은 요소들만 출력
        System.out.println(Arrays.stream(sus1).filter((x)->x<20).boxed().toList());
        System.out.println(Arrays.asList(sus2).stream().filter((x)->x<20).toList());

    }//end main


}//end class
