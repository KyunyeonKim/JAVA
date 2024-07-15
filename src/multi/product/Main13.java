package multi.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main13 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ProductDAO productDAO = new ProductDAOImpl();

        while (true){
            System.out.println("메뉴를 선택하시오");
            System.out.println("1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색..[x입력시 종료]");
            String menu = br.readLine();
            System.out.println("============================");

            if (menu.equals("1")) {
                //추가
                System.out.println("입력합니다");
                System.out.println("num");
                int num = Integer.parseInt(br.readLine());
                System.out.println("pname");
                String pname = br.readLine();
                System.out.println("model");
                String model = br.readLine();
                System.out.println("price");
                int price = Integer.parseInt(br.readLine());
                System.out.println("count");
                int count = Integer.parseInt(br.readLine());

                ProductVO vo = new ProductVO();
                vo.setNum(num);
                vo.setPname(pname);
                vo.setModel(model);
                vo.setPrice(price);
                vo.setCount(count);

                int result = productDAO.insert(vo);
                System.out.println("result"+result);
                if (result == 1) {
                    System.out.println("insert 메서드 성공");
                    System.out.println("===============================");
                }else {
                    System.out.println("insert 메서드 실패");
                    System.out.println("===============================");
                }
            } else if (menu.equals("2")) {
                //수정
                System.out.println("수정할 번호(num)를 입력하세요:");
                System.out.println("수정번호num");
                System.out.println("수정시작");
                System.out.println("==========================");
                int num = Integer.parseInt(br.readLine());
                System.out.println("pname");
                String pname = br.readLine();
                System.out.println("model");
                String model = br.readLine();
                System.out.println("price");
                int price = Integer.parseInt(br.readLine());
                System.out.println("count");
                int count = Integer.parseInt(br.readLine());

                ProductVO vo = new ProductVO();
                vo.setNum(num);
                vo.setPname(pname);
                vo.setModel(model);
                vo.setPrice(price);
                vo.setCount(count);

                int result2 = productDAO.update(vo);
                System.out.println("result2"+result2);
                if (result2 == 2) {
                    System.out.println("update성공");
                    System.out.println("===============================");
                }
                else {
                    System.out.println("update실패");
                    System.out.println("===============================");
                }
                System.out.println("===============================");
            } else if (menu.equals("3")) {
                //삭제
                System.out.println("삭제할번호를 선택하시오");
                int num = Integer.parseInt(br.readLine());

                ProductVO vo = new ProductVO();
                vo.setNum(num);

                int result3 = productDAO.delete(vo);
                System.out.println("result3:"+result3);

                if (result3 == 3){
                    System.out.println("delete successed");
                }
                else {
                    System.out.println("delete failed");
                }
                System.out.println("===========================");
            } else if (menu.equals("4")) {
                //번호단일검색
                System.out.println("번호를 선택하세요 num");
                int num = Integer.parseInt(br.readLine());

                ProductVO vo = new ProductVO();
                vo.setNum(num);

                ProductVO vo2 = productDAO.selectOne(vo);
                System.out.println(vo2);

                if (vo2 != null) {
                    System.out.println("selectOne 성공");
                }else {
                    System.out.println("select 실패");
                }
                System.out.println("=============");
            } else if (menu.equals("5")) {
                //전체검색
                List<ProductVO> list = productDAO.selectAll();
                for (int i = 0; i < list.size(); i++) {
                    ProductVO x = list.get(i);
                    System.out.println(x);
                }


            } else if (menu.equals("6")) {
                //6.searchKeyword
                System.out.println("키워드를 생각하고 검색하시오[pname or model]");
                String searchKey = br.readLine();

                System.out.println("Search Key: " + searchKey);

                System.out.println("searchWord:");
                String searchWord = br.readLine();

                System.out.println("Search Word: " + searchWord);

                List<ProductVO>list = productDAO.searchList(searchKey,searchWord);
                for (int i = 0; i < list.size(); i++) {
                    ProductVO x = list.get(i);
                    System.out.println(x);
                }
                System.out.println("============");
            }

            if (menu.equals("x"))break;

        }

        System.out.println("프로그램 종료");

    }
}
