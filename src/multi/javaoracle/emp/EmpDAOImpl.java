package multi.javaoracle.emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDAOImpl implements EmpDAO {

    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "hr";
    private static final String PASSWORD = "hi123456";
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public EmpDAOImpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load driver", e);
        }
    }

    @Override
    public int insert(EmpVO vo) {
        String sql = "INSERT INTO EMP (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getEmployeeId());
            pstmt.setString(2, vo.getFirstName());
            pstmt.setString(3, vo.getLastName());
            pstmt.setString(4, vo.getEmail());
            pstmt.setString(5, vo.getPhoneNumber());
            pstmt.setString(7, vo.getJobId());
            pstmt.setDouble(8, vo.getSalary());
            pstmt.setDouble(9, vo.getCommissionPct());
            pstmt.setInt(10, vo.getManagerId());
            pstmt.setInt(11, vo.getDepartmentId());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during insert", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public int update(EmpVO vo) {
        String sql = "UPDATE EMP SET FIRST_NAME = ?, LAST_NAME = ?, EMAIL = ?, PHONE_NUMBER = ?, HIRE_DATE = ?, JOB_ID = ?, SALARY = ?, COMMISSION_PCT = ?, MANAGER_ID = ?, DEPARTMENT_ID = ? WHERE EMPLOYEE_ID = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getFirstName());
            pstmt.setString(2, vo.getLastName());
            pstmt.setString(3, vo.getEmail());
            pstmt.setString(4, vo.getPhoneNumber());
            pstmt.setString(6, vo.getJobId());
            pstmt.setDouble(7, vo.getSalary());
            pstmt.setDouble(8, vo.getCommissionPct());
            pstmt.setInt(9, vo.getManagerId());
            pstmt.setInt(10, vo.getDepartmentId());
            pstmt.setInt(11, vo.getEmployeeId());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during update", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public int delete(EmpVO vo) {
        String sql = "DELETE FROM EMP WHERE EMPLOYEE_ID = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getEmployeeId());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during delete", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public EmpVO selectOne(int employeeId) {
        String sql = "SELECT * FROM EMP WHERE EMPLOYEE_ID = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, employeeId);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                EmpVO vo = new EmpVO();
                vo.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
                vo.setFirstName(rs.getString("FIRST_NAME"));
                vo.setLastName(rs.getString("LAST_NAME"));
                vo.setEmail(rs.getString("EMAIL"));
                vo.setPhoneNumber(rs.getString("PHONE_NUMBER"));
                vo.setHireDate(rs.getDate("HIRE_DATE"));
                vo.setJobId(rs.getString("JOB_ID"));
                vo.setSalary(rs.getDouble("SALARY"));
                vo.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
                vo.setManagerId(rs.getInt("MANAGER_ID"));
                vo.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
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
    public List<EmpVO> selectAll() {
        List<EmpVO> resultList = new ArrayList<>();
        String sql = "SELECT * FROM EMP";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                EmpVO vo = new EmpVO();
                vo.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
                vo.setFirstName(rs.getString("FIRST_NAME"));
                vo.setLastName(rs.getString("LAST_NAME"));
                vo.setEmail(rs.getString("EMAIL"));
                vo.setPhoneNumber(rs.getString("PHONE_NUMBER"));
                vo.setHireDate(rs.getDate("HIRE_DATE"));
                vo.setJobId(rs.getString("JOB_ID"));
                vo.setSalary(rs.getDouble("SALARY"));
                vo.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
                vo.setManagerId(rs.getInt("MANAGER_ID"));
                vo.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
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
