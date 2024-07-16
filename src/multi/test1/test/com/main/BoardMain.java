package multi.test1.test.com.main;

import test.com.board.BoardVO;

import java.util.ArrayList;

public class BoardMain {
    public static void main(String[] args) {
        ArrayList<BoardVO> boards = new ArrayList<>();
        boards.add(new BoardVO(1, "제목1", "내용1"));
        boards.add(new BoardVO(2, "제목2", "내용2"));

        System.out.println("번호\t제목\t내용");
        for (BoardVO board : boards) {
            System.out.println(board.getId() + "\t" + board.getTitle() + "\t" + board.getContent());
        }
    }
}