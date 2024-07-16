package multi.java17singleton;

public class Main01 {
    public static void main(String[] args) {

        //싱글톤 패턴 (프로그램 개발 디자인 패턴 )
        //클래스에서 만들수 있는 인스턴스가 오직 하나일 경우
        //이 객체의 접근은 어디서든지 하나로만 통일해서 제공하도록 객체생성하는 기법

        //컨셉:특정시스템에 많은 프린트 기능이 있더라고 하고 프린터스폴은 하나이어야함


        new Thread(){
          @Override
          public void run(){
              System.out.println("thread..1");
              PrintSpool ps2 = PrintSpool.getInstance();
              System.out.println(ps2);
              ps2.print("hello222");
          }
        }.start();



        new Thread(){
            @Override
            public void run(){
                System.out.println("thread..1");
                PrintSpool ps1 = PrintSpool.getInstance();
                System.out.println(ps1);
                ps1.print("hello222");
            }
        }.start();

    }
}
