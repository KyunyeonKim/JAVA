package multi.javaoracle.dept;

import java.util.List;

public interface DeptDAO {
    int insert(DeptVO vo);
    int update(DeptVO vo);
    int delete(DeptVO vo);
    DeptVO selectOne(int depNum);
    List<DeptVO> selectAll();
}
