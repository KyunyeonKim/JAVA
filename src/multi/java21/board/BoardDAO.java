package multi.java21.board;

import java.util.List;

public interface BoardDAO {


        int insert(BoardVO vo);
        int update(BoardVO vo);
        int delete(BoardVO vo);
        BoardVO selectOne(int bnum);
        List<BoardVO> selectAll();
        List<BoardVO> searchList(String searchKey, String searchWord);
}
