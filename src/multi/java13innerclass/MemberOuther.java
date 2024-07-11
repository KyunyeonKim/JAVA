package multi.java13innerclass;

public class MemberOuther {

    String name = "kim";
    static String title = "java";

    MemberOuther(){
        new Inner().work();
    }

    class Inner extends Father implements Mother{
        int kor = 10;
        static int eng = 99;
        void test(){
            System.out.println("test");
        }

        @Override
        public void play() {

        }

        @Override
        public void work() {

        }
    }
//static내부클래스
    static class staticInner{
        int kor = 10;
        static int eng = 99;
        static void start(){
            System.out.println("start");
            System.out.println(title);
        }
    }
}
