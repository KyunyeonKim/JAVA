package multi.testt;

public class Main01 {

    String name = "kim";
    static String tel ="82"; //null
    static final String ADDR = "SEOUL";

    public void test1(){
        System.out.println("test1()...");
    }

    public void test2(){
        System.out.println("test2()...");
    }

    public void test3(){
        System.out.println("test3()...");
        test1(); //this생략해서 콜
        test4();
    }

    public static void test4(){
        System.out.println("test4()...");
        new Main01().test1();
    }

    public static void main(String[] args) {

        System.out.println("main()..");

        Main01 m = new Main01();
        m.name="lee";
        final int x = 10;

        // x=20

        MemberVO mv = new MemberVO();

        mv.setName("홍길동");
        mv.setAge(30);
        mv.setEmail("honggildong@naver.com");

        System.out.println("이름:"+ mv.getName());
        System.out.println("나이:"+ mv.getAge());
        System.out.println("이메일:"+mv.getEmail());



    }
}
