package multi.java17;

public class Main05 {
    public static void main(String[] args) {



        try {
            MyException my = new MyException(33);
            System.out.println(my);
            throw my;
        } catch (Exception e) {
            System.out.println("catch...");
        }
    }
}
