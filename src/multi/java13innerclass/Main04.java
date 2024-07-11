package multi.java13innerclass;

public class Main04 {
    public static void main(String[] args) {


        final String name ="kim";

        class Inner{
            int num = 10;
            Inner(){
                System.out.println("inner()");
            }
            void test(){
                //메인함수영역의 로컬변수에 접근가능
                System.out.println("test()"+name);
            }
        }
        Inner in = new Inner();
        in.test();
    }
}
