package multi.javainter;

public class StudentDaoImpl implements StudentDAO{


    @Override
    public int insert(int num, String name, int kor, int eng, int math) {
        return 0;
    }

    @Override
    public int update(int num, String name, int kor, int eng, int math) {
        return 0;
    }

    @Override
    public int delete(int num, String name, int kor, int eng, int math) {
        return 0;
    }

    @Override
    public StudentVO selectOne(StudentVO vo) {
        return null;
    }

    @Override
    public StudentVO[] selectAll() {
        return new StudentVO[0];
    }

    @Override
    public StudentVO[] searchList(String searchkey, String searchWorld) {
        return new StudentVO[0];
    }
}
