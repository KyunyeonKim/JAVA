package multi.java17singleton;

public class PrintSpool {

    //1.전역변수(스태틱,접근최소)
    private static PrintSpool singletoon = new PrintSpool();

    //2.싱글톤객체를 리턴해주는 스태틱메서드
    public static PrintSpool getInstance(){
        return singletoon;
    }

    //인자없는 생성자 - private
    private PrintSpool(){

        //멀티스레드 테스트용 스립..
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("thread");
        }
    }


    public void print(String txt){
        System.out.println("print()...");
        System.out.println(txt);
    }
}
