package multi.java21.main;

import multi.java21.board.BoardDAO;
import multi.java21.board.BoardDAOImpl;
import multi.java21.board.BoardVO;
import multi.java21.comment.CommentsDAO;
import multi.java21.comment.CommentsDAOImpl;
import multi.java21.comment.CommentsVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CommentsMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CommentsDAO commentsDAO = new CommentsDAOImpl();
        BoardDAO boardDAO = new BoardDAOImpl();

        while (true) {
            System.out.println("메뉴를 선택하세요");
            System.out.println("1. 댓글 입력, 2. 댓글 수정, 3. 댓글 삭제, 4. 댓글 조회, 5. 게시글의 모든 댓글 조회, 6. 게시글과 해당 게시글의 모든 댓글 조회, 7. 모든 게시글 조회, x. 종료");
            String menu = br.readLine();
            System.out.println("==========================");

            if (menu.equals("1")) {
                System.out.println("게시글 번호:");
                int bnum = Integer.parseInt(br.readLine());
                System.out.println("댓글 내용:");
                String contents = br.readLine();
                System.out.println("작성자:");
                String writer = br.readLine();

                CommentsVO vo = new CommentsVO();
                vo.setBnum(bnum);
                vo.setContents(contents);
                vo.setWriter(writer);

                int result = commentsDAO.insert(vo);
                System.out.println("result: " + result);
                if (result == 1) {
                    System.out.println("insert succeeded...");
                } else {
                    System.out.println("insert failed...");
                }
                System.out.println("=================");

            } else if (menu.equals("2")) {
                System.out.println("댓글 번호:");
                int num = Integer.parseInt(br.readLine());
                System.out.println("게시글 번호:");
                int bnum = Integer.parseInt(br.readLine());
                System.out.println("댓글 내용:");
                String contents = br.readLine();
                System.out.println("작성자:");
                String writer = br.readLine();

                CommentsVO vo = new CommentsVO();
                vo.setNum(num);
                vo.setBnum(bnum);
                vo.setContents(contents);
                vo.setWriter(writer);

                int result = commentsDAO.update(vo);
                System.out.println("result: " + result);
                if (result == 1) {
                    System.out.println("update succeeded...");
                } else {
                    System.out.println("update failed...");
                }
                System.out.println("=================");

            } else if (menu.equals("3")) {
                System.out.println("댓글 번호:");
                int num = Integer.parseInt(br.readLine());

                CommentsVO vo = new CommentsVO();
                vo.setNum(num);

                int result = commentsDAO.delete(vo);
                System.out.println("result: " + result);
                if (result == 1) {
                    System.out.println("delete succeeded...");
                } else {
                    System.out.println("delete failed...");
                }
                System.out.println("=================");

            } else if (menu.equals("4")) {
                System.out.println("댓글 번호:");
                int num = Integer.parseInt(br.readLine());

                CommentsVO vo = commentsDAO.selectOne(num);
                if (vo != null) {
                    System.out.println(vo);
                    System.out.println("selectOne succeeded...");
                } else {
                    System.out.println("selectOne failed...");
                }
                System.out.println("=================");

            } else if (menu.equals("5")) {
                System.out.println("게시글 번호:");
                int bnum = Integer.parseInt(br.readLine());

                List<CommentsVO> list = commentsDAO.selectAll(bnum);
                System.out.println("댓글 번호   내용                  작성자");
                for (int i = 0; i < list.size(); i++) {
                    CommentsVO x = list.get(i);
                    System.out.println(x.getNum() + "   " + x.getContents() + "   " + x.getWriter());
                }
                System.out.println("=================");

            } else if (menu.equals("6")) {
                System.out.println("게시글 번호:");
                int bnum = Integer.parseInt(br.readLine());

                // 게시글 조회
                BoardVO board = boardDAO.selectOne(bnum);
                if (board != null) {
                    System.out.println("게시글 정보:");
                    System.out.println("번호: " + board.getBnum());
                    System.out.println("제목: " + board.getTitle());
                    System.out.println("내용: " + board.getContent());
                    System.out.println("작성자: " + board.getWriter());
                    System.out.println("=================");

                    // 댓글 조회
                    List<CommentsVO> commentsList = commentsDAO.selectAll(bnum);
                    System.out.println("댓글 번호   내용    작성자");
                    for (int i = 0; i < commentsList.size(); i++) {
                        CommentsVO comment = commentsList.get(i);
                        System.out.println(comment.getNum() + "   " + comment.getContents() + "   " + comment.getWriter());
                    }
                } else {
                    System.out.println("게시글을 찾을 수 없습니다.");
                }
                System.out.println("=================");

            } else if (menu.equals("7")) {
                // 모든 게시글 조회
                List<BoardVO> list = boardDAO.selectAll();
                System.out.println("번호   제목   내용   작성자");
                for (int i = 0; i < list.size(); i++) {
                    BoardVO board = list.get(i);
                    System.out.println(board.getBnum() + "   " + board.getTitle() + "   " + board.getContent() + "   " + board.getWriter());
                }
                System.out.println("=================");

            } else if (menu.equals("x")) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
