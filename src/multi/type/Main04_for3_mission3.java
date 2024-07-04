package multi.type;

import java.util.Scanner;

public class Main04_for3_mission3 {
    public static void main(String[] args)  {
        System.out.println("hello");

        Scanner s = new Scanner(System.in);

        //이전미션처럼 반복문을 3번사용하되 메뉴5가 입력되면 반복문 탈출하도록 하세요

        for(int i = 0; i <3; i++) {
            //메뉴를 입력하세요
            //메뉴선택 [1.입력 2.수정 3.삭제 4.검색 5.종료]
            System.out.println("메뉴선택 [1.입력 2.수정 3.삭제 4.검색 5.종료]");
            int menu = s.nextInt();
            //어떤번호를 선택했는지에 따라서 분기처리
            if (menu == 1) {
                //1번 선택 : 입력 이라고 출력
                System.out.println("입력");
            } else if (menu == 2) {
                //2번 선택 : 수정 이라고 출력
                System.out.println("수정");
            } else if (menu == 3) {
                //3번 선택 : 삭제 이라고 출력
                System.out.println("삭제");
            } else if (menu == 4) {
                //4번 선택 : 검색  이라고 출력
                System.out.println("검색");
            } else if (menu == 5) {
                //5번 선택 : 프로그램을 종료합니다  라고 출력
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }

        System.out.println("end main....");
    }//end main
}//end class
