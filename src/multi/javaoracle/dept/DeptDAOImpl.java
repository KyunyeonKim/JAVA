package multi.javaoracle.dept;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOImpl implements DeptDAO {

    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "hr";
    private static final String PASSWORD = "hi123456";
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public DeptDAOImpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load driver", e);
        }
    }

    @Override
    public int insert(DeptVO vo) {
        String sql = "INSERT INTO DEPT (DEP_NUM, SCH_NUM, DEP_NAME, DEP_PHONENUMBER, DEP_DATE) VALUES (?, ?, ?, ?, ?)";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getDepNum());
            pstmt.setInt(2, vo.getSchNum());
            pstmt.setString(3, vo.getDepName());
            pstmt.setInt(4, vo.getDepPhoneNumber());
            pstmt.setDate(5, vo.getDepDate());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during insert", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public int update(DeptVO vo) {
        String sql = "UPDATE DEPT SET SCH_NUM = ?, DEP_NAME = ?, DEP_PHONENUMBER = ?, DEP_DATE = ? WHERE DEP_NUM = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getSchNum());
            pstmt.setString(2, vo.getDepName());
            pstmt.setInt(3, vo.getDepPhoneNumber());
            pstmt.setDate(4, vo.getDepDate());
            pstmt.setInt(5, vo.getDepNum());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during update", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public int delete(DeptVO vo) {
        String sql = "DELETE FROM DEPT WHERE DEP_NUM = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getDepNum());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during delete", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public DeptVO selectOne(int depNum) {
        String sql = "SELECT * FROM DEPT WHERE DEP_NUM = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, depNum);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                DeptVO vo = new DeptVO();
                vo.setDepNum(rs.getInt("DEP_NUM"));
                vo.setSchNum(rs.getInt("SCH_NUM"));
                vo.setDepName(rs.getString("DEP_NAME"));
                vo.setDepPhoneNumber(rs.getInt("DEP_PHONENUMBER"));
                vo.setDepDate(rs.getDate("DEP_DATE"));
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
    public List<DeptVO> selectAll() {
        List<DeptVO> resultList = new ArrayList<>();
        String sql = "SELECT * FROM DEPT";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                DeptVO vo = new DeptVO();
                vo.setDepNum(rs.getInt("DEP_NUM"));
                vo.setSchNum(rs.getInt("SCH_NUM"));
                vo.setDepName(rs.getString("DEP_NAME"));
                vo.setDepPhoneNumber(rs.getInt("DEP_PHONENUMBER"));
                vo.setDepDate(rs.getDate("DEP_DATE"));
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
