package multi.java14;

import java.util.HashSet;
import java.util.Set;

public class Main05 {
    public static void main(String[] args) {

        //SET -HashSet
        //순서가 없고 중복데이터 허용안함
        Set<Integer>set = new HashSet<>();
        set.add(1111);
        set.add(1111);
        set.add(111111);
        System.out.println(set);
        System.out.println("set.size()"+set.size());

        for (Integer x : set){
            System.out.println(x);
        }


        set.remove(1111);
        System.out.println(set);

        set.clear();
        System.out.println(set);

        Set<String> set2 = new HashSet<>();
        //중복된거 말고 하나의 데이터만 들어감
        set2.add("kim1");
        set2.add("kim1");
        set2.add("kim1");
        set2.add("kim1");
        System.out.println(set2);

        Set<Car>set3 = new HashSet<>();
        //Car클래스에서 equals & HashCode메소드를 재정의할려면
        //데이터 클래스로 사용가능하다
        set3.add(new Car());
        set3.add(new Car());
        set3.add(new Car());
        System.out.println(set3);


    }
}
