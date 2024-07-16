package multi.test1;

import test.com.main.BoardMain;
import test.com.main.MemberMain;
import test.com.main.ProductMain;

public class Main {
        public static void main(String[] args) {
            System.out.println("게시판 정보:");
            BoardMain.main(args);

            System.out.println("\n회원 정보:");
            MemberMain.main(args);

            System.out.println("\n제품 정보:");
            ProductMain.main(args);
        }

}