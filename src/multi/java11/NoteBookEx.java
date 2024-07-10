package multi.java11;

public class NoteBookEx extends Notebook{
    @Override
    public int insert(int x, int y) {
        System.out.println("insert()...");
        return x+y;
    }

    @Override
    public String update(String name) {
        System.out.println("update()....");
        return name+"님 안녕하세요";
    }
}
