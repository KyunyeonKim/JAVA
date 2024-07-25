package multi.javaoracle.job;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JobDAOImpl implements JobDAO {

    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "hr";
    private static final String PASSWORD = "hi123456";
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public JobDAOImpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load driver", e);
        }
    }

    @Override
    public int insert(JobVO vo) {
        String sql = "INSERT INTO JOB (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) VALUES (?, ?, ?, ?)";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getJobId());
            pstmt.setString(2, vo.getJobTitle());
            pstmt.setInt(3, vo.getMinSalary());
            pstmt.setInt(4, vo.getMaxSalary());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during insert", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public int update(JobVO vo) {
        String sql = "UPDATE JOB SET JOB_TITLE = ?, MIN_SALARY = ?, MAX_SALARY = ? WHERE JOB_ID = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getJobTitle());
            pstmt.setInt(2, vo.getMinSalary());
            pstmt.setInt(3, vo.getMaxSalary());
            pstmt.setString(4, vo.getJobId());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during update", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public int delete(JobVO vo) {
        String sql = "DELETE FROM JOB WHERE JOB_ID = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getJobId());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during delete", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public JobVO selectOne(String jobId) {
        String sql = "SELECT * FROM JOB WHERE JOB_ID = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, jobId);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                JobVO vo = new JobVO();
                vo.setJobId(rs.getString("JOB_ID"));
                vo.setJobTitle(rs.getString("JOB_TITLE"));
                vo.setMinSalary(rs.getInt("MIN_SALARY"));
                vo.setMaxSalary(rs.getInt("MAX_SALARY"));
                return vo;
            }
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during selectOne", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public List<JobVO> selectAll() {
        List<JobVO> resultList = new ArrayList<>();
        String sql = "SELECT * FROM JOB";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                JobVO vo = new JobVO();
                vo.setJobId(rs.getString("JOB_ID"));
                vo.setJobTitle(rs.getString("JOB_TITLE"));
                vo.setMinSalary(rs.getInt("MIN_SALARY"));
                vo.setMaxSalary(rs.getInt("MAX_SALARY"));
                resultList.add(vo);
            }
            return resultList;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during selectAll", e);
        } finally {
            closeResources();
        }
    }

    private void closeResources() {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
