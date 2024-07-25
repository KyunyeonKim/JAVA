package multi.javaoracle.emp;

import java.util.List;

public interface EmpDAO {
    int insert(EmpVO vo);
    int update(EmpVO vo);
    int delete(EmpVO vo);
    EmpVO selectOne(int employeeId);
    List<EmpVO> selectAll();
}
