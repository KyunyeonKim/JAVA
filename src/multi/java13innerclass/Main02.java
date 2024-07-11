package multi.java13innerclass;

public class Main02 {
    public static void main(String[] args) {

        Car c = new Car() {
            @Override
            public void drive() {
                System.out.println("start");
            }
        };
        c.drive();


    }
}
