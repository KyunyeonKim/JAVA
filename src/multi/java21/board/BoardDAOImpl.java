package multi.java21.board;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements BoardDAO {

    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "hr";
    private static final String PASSWORD = "hi123456";
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public BoardDAOImpl() {
        try {
            Class.forName(DRIVER_NAME);
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load driver", e);
        }
    }

    @Override
    public int insert(BoardVO vo) {
        String sql = "INSERT INTO board (bnum, title, content, writer) VALUES (board_seq.NEXTVAL, ?, ?, ?)";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getTitle());
            pstmt.setString(2, vo.getContent());
            pstmt.setString(3, vo.getWriter());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during insert", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public int update(BoardVO vo) {
        String sql = "UPDATE board SET title = ?, content = ?, writer = ? WHERE bnum = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getTitle());
            pstmt.setString(2, vo.getContent());
            pstmt.setString(3, vo.getWriter());
            pstmt.setInt(4, vo.getBnum());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during update", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public int delete(BoardVO vo) {
        String sql = "DELETE FROM board WHERE bnum = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getBnum());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during delete", e);
        } finally {
            closeResources();
        }
    }

    @Override
    public BoardVO selectOne(int bnum) {
        String sql = "SELECT * FROM board WHERE bnum = ?";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bnum);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                BoardVO resultVo = new BoardVO();
                resultVo.setBnum(rs.getInt("bnum"));
                resultVo.setTitle(rs.getString("title"));
                resultVo.setContent(rs.getString("content"));
                resultVo.setWriter(rs.getString("writer"));
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
    public List<BoardVO> selectAll() {
        List<BoardVO> resultList = new ArrayList<>();
        String sql = "SELECT * FROM board";
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                BoardVO vo = new BoardVO();
                vo.setBnum(rs.getInt("bnum"));
                vo.setTitle(rs.getString("title"));
                vo.setContent(rs.getString("content"));
                vo.setWriter(rs.getString("writer"));
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

    @Override
    public List<BoardVO> searchList(String searchKey, String searchWord) {
        String sql = "SELECT * FROM board WHERE " + searchKey + " LIKE ?";
        List<BoardVO> resultList = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + searchWord + "%");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                BoardVO vo = new BoardVO();
                vo.setBnum(rs.getInt("bnum"));
                vo.setTitle(rs.getString("title"));
                vo.setContent(rs.getString("content"));
                vo.setWriter(rs.getString("writer"));
                resultList.add(vo);
            }
            return resultList;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database error during searchList", e);
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
