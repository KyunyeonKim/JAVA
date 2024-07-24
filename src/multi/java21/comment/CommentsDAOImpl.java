package multi.java21.comment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CommentsDAOImpl implements CommentsDAO {

    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "hr";
    private static final String PASSWORD = "hi123456";
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public CommentsDAOImpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load driver", e);
        }
    }

    @Override
    public int insert(CommentsVO vo) {
        String sql = "INSERT INTO comments (num, contents, writer, bnum) VALUES (comments_seq.NEXTVAL, ?, ?, ?)";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getContents());
            pstmt.setString(2, vo.getWriter());
            pstmt.setInt(3, vo.getBnum());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during insert", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public int update(CommentsVO vo) {
        String sql = "UPDATE comments SET contents = ?, writer = ?, bnum = ? WHERE num = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getContents());
            pstmt.setString(2, vo.getWriter());
            pstmt.setInt(3, vo.getBnum());
            pstmt.setInt(4, vo.getNum());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during update", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public int delete(CommentsVO vo) {
        String sql = "DELETE FROM comments WHERE num = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getNum());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during delete", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public CommentsVO selectOne(int num) {
        String sql = "SELECT * FROM comments WHERE num = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                CommentsVO resultVo = new CommentsVO();
                resultVo.setNum(rs.getInt("num"));
                resultVo.setContents(rs.getString("contents"));
                resultVo.setWriter(rs.getString("writer"));
                resultVo.setBnum(rs.getInt("bnum"));
                return resultVo;
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
    public List<CommentsVO> selectAll(int bnum) {
        List<CommentsVO> resultList = new ArrayList<>();
        String sql = "SELECT * FROM comments WHERE bnum = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bnum);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                CommentsVO vo = new CommentsVO();
                vo.setNum(rs.getInt("num"));
                vo.setContents(rs.getString("contents"));
                vo.setWriter(rs.getString("writer"));
                vo.setBnum(rs.getInt("bnum"));
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
