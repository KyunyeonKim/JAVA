package multi.java11;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("Hello");


        //추상클래스와 객체 생성 - 상속관계의 다형성으로만 생성가능
        TestAbs abs = new TestAbs() {
            @Override
            public void sleep() {
                System.out.println("ineer sleep");
            }
        };
        abs.test();
        abs.sleep();
        System.out.println("=============");
        TestAbsEx tex = new TestAbsEx();
        tex.test();
        tex.sleep();
    }
}
