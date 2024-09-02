package test.com;

import java.util.Arrays;
import java.util.List;

public class Main03 {

    public static void main(String[] args) {
        System.out.println("hello...");

        List<Double> list = Arrays.asList(1.1,2.2,3.3,4.4);
        //실수요소들에 대한 min,max,sum 을 쉽게 획득할수 있다.
        System.out.println(list.stream().mapToDouble(x->x).min());//OptionalDouble[1.1]
        System.out.println(list.stream().mapToDouble(x->x).min().getAsDouble());//1.1
        System.out.println(list.stream().mapToDouble(x->x).max().getAsDouble());//4.4
        System.out.println(list.stream().mapToDouble(x->x).sum());//11.0

        ///////////////////////

        List<Integer> list2 = Arrays.asList(11,22,33);
        //정수요소들에 대한 min,max,sum 을 쉽게 획득할수 있다.
        System.out.println(list2.stream().mapToInt(x->x).min());
        System.out.println(list2.stream().mapToInt(x->x).min().getAsInt());
        System.out.println(list2.stream().mapToInt(x->x).max().getAsInt());
        System.out.println(list2.stream().mapToInt(x->x).sum());


        //////기본타입배열을 사용할 경우/////////////////
        int[] sus = new int[]{44,55,66};
        System.out.println(Arrays.stream(sus).mapToLong(x->x).min().getAsLong());
        System.out.println(Arrays.stream(sus).mapToLong(x->x).max().getAsLong());
        System.out.println(Arrays.stream(sus).mapToLong(x->x).sum());

    }//end main


}//end class
