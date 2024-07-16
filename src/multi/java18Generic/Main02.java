package multi.java18Generic;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {


        //상속관계를 표현한 제네릭
        //상속관계의 객체가 필요하다
        //Car <---Bus <----BigBus
        //Car <-----Taxi<-----BigTaxi


        List<Car> cars = new ArrayList<>();
        cars.add(new BigBus()); // BigBus는 Car의 서브 클래스이므로 추가 가능
        cars.add(new Taxi()); // Taxi도 Car의 서브 클래스이므로 추가 가능
        cars.add(new BigTaxi()); // BigTaxi도 Car의 서브 클래스이므로 추가 가능
        cars.add(new Bus());


        List<BigBus> cars4 = new ArrayList<>();
        cars4.add(new BigBus()); // BigBus는 Car의 서브 클래스이므로 추가 가능


    }
}
