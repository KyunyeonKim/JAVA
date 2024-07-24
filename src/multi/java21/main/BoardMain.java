package multi.java21.main;

import multi.java21.board.BoardDAO;
import multi.java21.board.BoardDAOImpl;
import multi.java21.board.BoardVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BoardDAO dao = new BoardDAOImpl();

        while(true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, 6.검색어검색, x. 종료");
            String menu = br.readLine();
            System.out.println("==========================");

            if(menu.equals("1")){
                System.out.println("title:");
                String title = br.readLine();
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();

                BoardVO vo = new BoardVO();
                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);

                int result = dao.insert(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("insert succeeded...");
                } else {
                    System.out.println("insert failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("2")){
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());
                System.out.println("title:");
                String title = br.readLine();
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();

                BoardVO vo = new BoardVO();
                vo.setBnum(num);
                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);

                int result = dao.update(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("update succeeded...");
                } else {
                    System.out.println("update failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("3")){
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                BoardVO vo = new BoardVO();
                vo.setBnum(num);

                int result = dao.delete(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("delete succeeded...");
                } else {
                    System.out.println("delete failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("4")){
                System.out.println("num:");
                int num = Integer.parseInt(br.readLine());

                BoardVO vo = dao.selectOne(num);
                if(vo != null){
                    System.out.println(vo);
                    System.out.println("selectOne succeeded...");
                } else {
                    System.out.println("selectOne failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("5")){
                List<BoardVO> list = dao.selectAll();
                System.out.printf("%3s %5s %8s %10s \n", "번호", "제목", "내용", "작성자");
                for(BoardVO x : list){
                    System.out.printf("%3d %10s %10s %10s \n",
                            x.getBnum(), x.getTitle(), x.getContent(), x.getWriter());
                }
                System.out.println("=================");

            } else if(menu.equals("6")){
                System.out.println("searchKey[title or content]:");
                String searchKey = br.readLine();

                System.out.println("searchWord:");
                String searchWord = br.readLine();

                List<BoardVO> list = dao.searchList(searchKey, searchWord);
                System.out.printf("%3s %5s %8s %10s \n", "번호", "제목", "내용", "작성자");
                for(BoardVO x : list){
                    System.out.printf("%3d %10s %10s %10s \n",
                            x.getBnum(), x.getTitle(), x.getContent(), x.getWriter());
                }
                System.out.println("=================");

            } else if(menu.equals("x")){
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
