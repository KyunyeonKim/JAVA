package multi.java11;

public class Taxi extends Car{
    public String part;

    public String pay;

    public void stop() {
        System.out.println(part);
        System.out.println(pay);
    }
}
