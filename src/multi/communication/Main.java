package multi.communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BoardDaoImpl boardDao = new BoardDaoImpl();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("옵션을 선택하세요: ");
                System.out.println("1: 삽입");
                System.out.println("2: 업데이트");
                System.out.println("3: 삭제");
                System.out.println("4: 선택");
                System.out.println("5: 검색");
                System.out.println("6: 모두 선택");
                System.out.println("7: 종료");

                int option = Integer.parseInt(reader.readLine());

                switch (option) {
                    case 1:
                        System.out.println("번호를 입력하세요:");
                        int num = Integer.parseInt(reader.readLine());
                        System.out.println("작성자를 입력하세요:");
                        String writer = reader.readLine();
                        System.out.println("내용을 입력하세요:");
                        String content = reader.readLine();
                        boardDao.insert(new BoardVO(num, writer, content));
                        break;

                    case 2:
                        System.out.println("업데이트할 번호를 입력하세요:");
                        num = Integer.parseInt(reader.readLine());
                        System.out.println("새 작성자를 입력하세요:");
                        writer = reader.readLine();
                        System.out.println("새 내용을 입력하세요:");
                        content = reader.readLine();
                        boardDao.update(new BoardVO(num, writer, content));
                        break;

                    case 3:
                        System.out.println("삭제할 번호를 입력하세요:");
                        num = Integer.parseInt(reader.readLine());
                        boardDao.delete(num);
                        break;

                    case 4:
                        System.out.println("선택할 번호를 입력하세요:");
                        num = Integer.parseInt(reader.readLine());
                        BoardVO selected = boardDao.select(num);
                        if (selected != null) {
                            System.out.println("선택된 항목: " + selected);
                        } else {
                            System.out.println("해당 번호의 항목이 없습니다: " + num);
                        }
                        break;

                    case 5:
                        System.out.println("게시글내역을 검색해주세요 (name/content):");
                        String searchKey = reader.readLine();
                        System.out.println("검색어를 입력하세요:");
                        String searchWord = reader.readLine();
                        List<BoardVO> results = boardDao.searchList(searchKey, searchWord);
                        if (!results.isEmpty()) {
                            results.forEach(System.out::println);
                        } else {
                            System.out.println("일치하는 항목이 없습니다.");
                        }
                        break;

                    case 6:
                        List<BoardVO> allRecords = boardDao.selectall();
                        if (!allRecords.isEmpty()) {
                            allRecords.forEach(System.out::println);
                        } else {
                            System.out.println("항목이 없습니다.");
                        }
                        break;

                    case 7:
                        System.out.println("종료합니다...");
                        reader.close();
                        return;

                    default:
                        System.out.println("잘못된 옵션입니다. 다시 선택하세요.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("입력 오류: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자 형식 오류: " + e.getMessage());
            }
        }
    }
}
