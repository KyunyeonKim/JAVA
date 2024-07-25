package multi.javaoracle.main;


import multi.javaoracle.dept.DeptDAO;
import multi.javaoracle.dept.DeptDAOImpl;
import multi.javaoracle.dept.DeptVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class DeptMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DeptDAO dao = new DeptDAOImpl();

        while(true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, x. 종료");
            String menu = br.readLine();
            System.out.println("==========================");

            if(menu.equals("1")){
                System.out.println("dep_num:");
                int depNum = Integer.parseInt(br.readLine());
                System.out.println("sch_num:");
                int schNum = Integer.parseInt(br.readLine());
                System.out.println("dep_name:");
                String depName = br.readLine();
                System.out.println("dep_phonenumber:");
                long depPhoneNumber = Long.parseLong(br.readLine());
                System.out.println("dep_date (yyyy-mm-dd):");
                java.sql.Date depDate = java.sql.Date.valueOf(br.readLine());

                DeptVO vo = new DeptVO();
                vo.setDepNum(depNum);
                vo.setSchNum(schNum);
                vo.setDepName(depName);
                vo.setDepPhoneNumber((int) depPhoneNumber);
                vo.setDepDate(depDate);

                int result = dao.insert(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("insert succeeded...");
                } else {
                    System.out.println("insert failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("2")){
                System.out.println("dep_num:");
                int depNum = Integer.parseInt(br.readLine());
                System.out.println("sch_num:");
                int schNum = Integer.parseInt(br.readLine());
                System.out.println("dep_name:");
                String depName = br.readLine();
                System.out.println("dep_phonenumber:");
                long depPhoneNumber = Long.parseLong(br.readLine());
                System.out.println("dep_date (yyyy-mm-dd):");
                java.sql.Date depDate = java.sql.Date.valueOf(br.readLine());

                DeptVO vo = new DeptVO();
                vo.setDepNum(depNum);
                vo.setSchNum(schNum);
                vo.setDepName(depName);
                vo.setDepPhoneNumber((int) depPhoneNumber);
                vo.setDepDate(depDate);

                int result = dao.update(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("update succeeded...");
                } else {
                    System.out.println("update failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("3")){
                System.out.println("dep_num:");
                int depNum = Integer.parseInt(br.readLine());

                DeptVO vo = new DeptVO();
                vo.setDepNum(depNum);

                int result = dao.delete(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("delete succeeded...");
                } else {
                    System.out.println("delete failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("4")){
                System.out.println("dep_num:");
                int depNum = Integer.parseInt(br.readLine());

                DeptVO vo = dao.selectOne(depNum);
                if(vo != null){
                    System.out.println("부서번호: " + vo.getDepNum());
                    System.out.println("학교번호: " + vo.getSchNum());
                    System.out.println("부서명: " + vo.getDepName());
                    System.out.println("전화번호: " + vo.getDepPhoneNumber());
                    System.out.println("생성일: " + vo.getDepDate());
                    System.out.println("selectOne succeeded...");
                } else {
                    System.out.println("selectOne failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("5")){
                List<DeptVO> list = dao.selectAll();
                System.out.println("부서 목록:");
                for(DeptVO x : list){
                    System.out.println("부서번호: " + x.getDepNum() +
                                       ", 학교번호: " + x.getSchNum() +
                                       ", 부서명: " + x.getDepName() +
                                       ", 전화번호: " + x.getDepPhoneNumber() +
                                       ", 생성일: " + x.getDepDate());
                }
                System.out.println("=================");

            } else if(menu.equals("x")){
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
