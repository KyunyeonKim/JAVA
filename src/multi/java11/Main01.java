package multi.java11;

public class Main01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.model);
        System.out.println(car.price);
        car.start();

        System.out.println("=========");

        //버스 - 카운트,버스요금 : 문열기
        Bus bus = new Bus();
        System.out.println(bus.count);
        System.out.println(bus.pay);
        bus.open();
        System.out.println("=========");

        //자동차를 상속받고난 이후에는 자동차의 자원(멤버) 사용가능
        System.out.println(bus.model);
        System.out.println(bus.price);
        bus.start();
        System.out.println("=========");


        //자동차와 버스가 상속관계인 경우 다형성을이용한 객체생성가능
        //다형성 - 부모타입 변수초기화시 자식타입의 생성자로 객체생성가능
        //      -단, 자원사용 제한(부모자원만 사용가능)
        Car car2 = new Bus();
        System.out.println(car2.model);
        System.out.println(car2.price);
        car2.start();
        System.out.println("=========");

        //자동상속 - extends라는 예약어없고 클래스이름도 없이 상속관계가 성립
        //다형성 + 내부클래스
        Car car3 = new Car(){
            //이름없는 내부클래스영역,Car클래스를 자동상속
            String status;
            public void sleep(){
                System.out.println("sleep()...");
                System.out.println(status);
                System.out.println(model);
                System.out.println(price);
            }
        };
        System.out.println(car3.model);
        System.out.println(car3.price);
        car3.start();
        System.out.println("=========");


        //택시 - 분야,택시요금 : 정지기능
        Taxi taxi = new Taxi();
        System.out.println(taxi.part);
        System.out.println(taxi.pay);
        taxi.stop();

        System.out.println(taxi.price);
        System.out.println(taxi.model);

        //익명 내부 클래스 구현 및 자동상속 다형성 출력
        Car car5 = new Car(){
            String test = "test";
            public void aaa(){
                System.out.println("aaa");
            }
        };




        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        p.sleep();
        System.out.println("========");



        Man m = new Man();
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.eye);
        System.out.println(m.monet);

        m.sleep();
        m.eat();
        System.out.println("========");

        Person p2 = new Man();
        System.out.println(p2.name);
        System.out.println(p2.age);

        p2.sleep();

        Person p3 = new Person(){
          String id= "admin";
          public void insert(){
              System.out.println("inner insert()");
          }

          @Override
            public void sleep(){
              System.out.println("innersleep()...");
              insert();
          }
        };
        p3.sleep();


        Student st = new Student();
        System.out.println(st.name);
        System.out.println(st.age);
        System.out.println(st.kor);
        System.out.println(st.eng);
        System.out.println(st.math);
        st.study();
        st.sleep();
        
        //다형성 객체생성
        Person p4 = new Student();
        System.out.println(p4.name);
        System.out.println(p4.age);
        p4.sleep();

        Person p5 = new Person(){

            @Override
            public void sleep(){
                System.out.println("inner sleep");
            }
        };
        System.out.println(p5.name);
        System.out.println(p5.age);
        p5.sleep();

    }
}
