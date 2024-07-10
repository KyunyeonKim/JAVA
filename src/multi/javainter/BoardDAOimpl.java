package multi.javainter;

public class BoardDAOimpl implements BoardDAO,BoardDAO2{
    @Override
    public int insert() {
        System.out.println("BoardDaoimpl insert()..");
        return 0;
    }

    @Override
    public int update() {
        System.out.println("BoardImpl update()..");
        return 0;
    }
}
