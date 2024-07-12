package multi.communication;

import java.util.ArrayList;
import java.util.List;

public class BoardDaoImpl implements BoardDao{

    private List<BoardVO> board = new ArrayList<>();

    @Override
    public void insert(BoardVO vo) {
        board.add(vo);
        System.out.println("insert"+vo);
    }

    @Override
    public void update(BoardVO vo) {
        for (int i = 0; i < board.size(); i++) {
            BoardVO b = board.get(i);
            if(b.getNum() == vo.getNum()){
                b.setWriter(vo.getWriter());
                b.setContent(vo.getContent());
                System.out.println("update"+vo);
                return;
            }

        }
    }

    @Override
    public void delete(int num) {
        for (int i = 0; i < board.size(); i++) {
            BoardVO vo = board.get(i);
            if(board.get(i).getNum() == vo.getNum()){
                board.remove(i);
                System.out.println("delete"+vo);
                return;
            }
        }

    }

    @Override
    public BoardVO select(int num) {
        for (int i = 0; i <board.size(); i++) {
            BoardVO vo = board.get(i);
            if(vo.getNum() == num){
                return vo;
            }
        }
        return null;
    }

    @Override
    public List<BoardVO> searchList(String searchKey, String searchWord) {
        if (searchKey.equals("name")){
            List<BoardVO> vo = new ArrayList<>();
            for (int i = 0; i < board.size(); i++) {
                if(board.get(i).getWriter().contains(searchWord)){
                    vo.add(board.get(i));
                }
            }
            return vo;
        }else {
            List<BoardVO> vo = new ArrayList<>();
            for (int i = 0; i <board.size() ; i++) {
                if((board.get(i).getContent().equals(searchWord))){
                    vo.add(board.get(i));
                }
            }
            return vo;
        }
    }

    @Override
    public List<BoardVO> selectall() {
        return new ArrayList<>();
    }
}
