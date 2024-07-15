package multi.thread;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");
        //스레드 제어해보자....


        //2.인터럽트 + 슬립(0.001초)
        PrintThread2 pt = new PrintThread2();
        pt.start();

        //1초간 일시정지
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //인터럽트 메소드 활용 해서 종료시키기
        pt.interrupt();

        System.out.println("end main........");
    }//end main

}//end class
