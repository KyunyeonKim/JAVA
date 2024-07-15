package multi.thread;

public class User02 extends Thread{

    private Calculator cal;

    public void setCal(Calculator cal) {
        this.cal = cal;
        //스레드 이릅 변경
        this.setName("User02...");
    }

    @Override
    public void run() {
        System.out.println("User02....run()....");
        cal.setMemory(50);
        System.out.println("=========");
    }
}
