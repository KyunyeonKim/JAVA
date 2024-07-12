package multi.java14;

import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberDAO memberDAO = new MemberDaoImpl();

        while (true){
            System.out.println("1.입력,2.수정,3.삭제,4.이름검색,5.아이디검색,6.");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("순번 아이디 비번 이름 전화번호를 입력하세요");
                    int num=scanner.nextInt();
                    scanner.nextLine();
                    String id=scanner.nextLine();
                    String pw=scanner.nextLine();
                    String name=scanner.nextLine();
                    String tel=scanner.nextLine();
                    MemberVO memberVO = new MemberVO(num,id,pw,name,tel);
                            break;
                case 2:
                    System.out.println("수정할 아이디를 입력하세요");

            }
        }
    }
}
