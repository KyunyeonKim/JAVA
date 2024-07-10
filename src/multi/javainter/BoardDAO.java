package multi.javainter;

public interface BoardDAO {
    //public static final
    String Name = "kim";

    public int insert();

    public default int delete(){
        System.out.println("daefault delete");
        return 1;
    }

    public static int selectOne(){
        System.out.println("selectOne");
     return 0;
    }
}
