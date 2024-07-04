package multi.type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<3; i++) {
            System.out.println("메뉴를 입력하세요");
            System.out.println("메뉴 선택[1.입력,2.수정,3.삭제,4.검색,5.종료]");
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("입력");
                    break;

                case 2:
                    System.out.println("수정");
                    break;

                case 3:
                    System.out.println("삭제");
                    break;

                case 4:
                    System.out.println("검색");
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다");
                    break;
                default:

            }
        }
    }//end main
}//end class