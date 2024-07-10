package multi.java11;

public abstract class TestAbs {

    String name = "kim";
    int age = 33;

    public TestAbs(){
        System.out.println("TestAbs()...");
    }


    public void test(){
        System.out.println("TestAbs...test()...");
    }
    //추상메서드 - 메소드 실행블럭없이 선언만된 메서드
    public abstract void sleep();
}
