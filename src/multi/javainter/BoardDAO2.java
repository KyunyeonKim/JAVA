package multi.javainter;

public interface BoardDAO2 {
    String ADDR = "seoul";

    int update();

    public default int one(){
        System.out.println("one...");
     return 1;
    }

    public static int two(){
        System.out.println("two...");
        return 1;
    }
}
