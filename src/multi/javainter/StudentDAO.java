package multi.javainter;

public interface StudentDAO {

    public int insert(int num,String name,int kor,int eng, int math);
    public int update(int num,String name,int kor,int eng, int math);
    public int delete(int num,String name,int kor,int eng, int math);
    public StudentVO selectOne(StudentVO vo);
    public StudentVO[] selectAll();
    public StudentVO[] searchList(String searchkey,String searchWorld);




}
