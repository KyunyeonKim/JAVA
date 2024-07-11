package multi.java13innerclass;

public class Main01 {
    public static void main(String[] args) {

        //1. 익명내부클래스 - 변수할당가능,함수인자전달
        Father f = new Father() {
            @Override
            public void work() {
                System.out.println("work()");
            }
        };
        f.work();

        test(f);
        test(new Father() {
            @Override
            public void work() {
                System.out.println("work2");
            }
        });

    }

    public static void test(Father f){
        f.work();
    }

    public static Father test2(){
        return new Father() {
            @Override
            public void work() {
                System.out.println("work3...");
            }
        };
    };
}
