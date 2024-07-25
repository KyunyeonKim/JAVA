package multi.javaoracle.job;

import java.util.List;

public interface JobDAO {
    int insert(JobVO vo);
    int update(JobVO vo);
    int delete(JobVO vo);
    JobVO selectOne(String jobId);
    List<JobVO> selectAll();
}
