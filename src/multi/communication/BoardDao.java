package multi.communication;

import java.util.List;

public interface BoardDao {

    public void insert(BoardVO vo);

    public void update(BoardVO vo);

    public void delete(int num);

    public BoardVO select(int num);

    public List<BoardVO> searchList(String searchKey,
                                     String searchWord);

    List<BoardVO>selectall();


}
