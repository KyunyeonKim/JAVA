package multi.javaoracle.main;


import multi.javaoracle.emp.EmpDAO;
import multi.javaoracle.emp.EmpDAOImpl;
import multi.javaoracle.emp.EmpVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        EmpDAO dao = new EmpDAOImpl();

        while(true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, x. 종료");
            String menu = br.readLine();
            System.out.println("==========================");

            if(menu.equals("1")){
                System.out.println("employee_id:");
                int employeeId = Integer.parseInt(br.readLine());
                System.out.println("first_name:");
                String firstName = br.readLine();
                System.out.println("last_name:");
                String lastName = br.readLine();
                System.out.println("email:");
                String email = br.readLine();
                System.out.println("phone_number:");
                String phoneNumber = br.readLine();
                System.out.println("hire_date (yyyy-mm-dd):");
                java.sql.Date hireDate = java.sql.Date.valueOf(br.readLine());
                System.out.println("job_id:");
                String jobId = br.readLine();
                System.out.println("salary:");
                double salary = Double.parseDouble(br.readLine());
                System.out.println("commission_pct:");
                double commissionPct = Double.parseDouble(br.readLine());
                System.out.println("manager_id:");
                int managerId = Integer.parseInt(br.readLine());
                System.out.println("department_id:");
                int departmentId = Integer.parseInt(br.readLine());

                EmpVO vo = new EmpVO();
                vo.setEmployeeId(employeeId);
                vo.setFirstName(firstName);
                vo.setLastName(lastName);
                vo.setEmail(email);
                vo.setPhoneNumber(phoneNumber);
                vo.setHireDate(hireDate);
                vo.setJobId(jobId);
                vo.setSalary(salary);
                vo.setCommissionPct(commissionPct);
                vo.setManagerId(managerId);
                vo.setDepartmentId(departmentId);

                int result = dao.insert(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("insert succeeded...");
                } else {
                    System.out.println("insert failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("2")){
                System.out.println("employee_id:");
                int employeeId = Integer.parseInt(br.readLine());
                System.out.println("first_name:");
                String firstName = br.readLine();
                System.out.println("last_name:");
                String lastName = br.readLine();
                System.out.println("email:");
                String email = br.readLine();
                System.out.println("phone_number:");
                String phoneNumber = br.readLine();
                System.out.println("hire_date (yyyy-mm-dd):");
                java.sql.Date hireDate = java.sql.Date.valueOf(br.readLine());
                System.out.println("job_id:");
                String jobId = br.readLine();
                System.out.println("salary:");
                double salary = Double.parseDouble(br.readLine());
                System.out.println("commission_pct:");
                double commissionPct = Double.parseDouble(br.readLine());
                System.out.println("manager_id:");
                int managerId = Integer.parseInt(br.readLine());
                System.out.println("department_id:");
                int departmentId = Integer.parseInt(br.readLine());

                EmpVO vo = new EmpVO();
                vo.setEmployeeId(employeeId);
                vo.setFirstName(firstName);
                vo.setLastName(lastName);
                vo.setEmail(email);
                vo.setPhoneNumber(phoneNumber);
                vo.setHireDate(hireDate);
                vo.setJobId(jobId);
                vo.setSalary(salary);
                vo.setCommissionPct(commissionPct);
                vo.setManagerId(managerId);
                vo.setDepartmentId(departmentId);

                int result = dao.update(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("update succeeded...");
                } else {
                    System.out.println("update failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("3")){
                System.out.println("employee_id:");
                int employeeId = Integer.parseInt(br.readLine());

                EmpVO vo = new EmpVO();
                vo.setEmployeeId(employeeId);

                int result = dao.delete(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("delete succeeded...");
                } else {
                    System.out.println("delete failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("4")){
                System.out.println("employee_id:");
                int employeeId = Integer.parseInt(br.readLine());

                EmpVO vo = dao.selectOne(employeeId);
                if(vo != null){
                    System.out.println("Employee ID: " + vo.getEmployeeId());
                    System.out.println("First Name: " + vo.getFirstName());
                    System.out.println("Last Name: " + vo.getLastName());
                    System.out.println("Email: " + vo.getEmail());
                    System.out.println("Phone Number: " + vo.getPhoneNumber());
                    System.out.println("Hire Date: " + vo.getHireDate());
                    System.out.println("Job ID: " + vo.getJobId());
                    System.out.println("Salary: " + vo.getSalary());
                    System.out.println("Commission Pct: " + vo.getCommissionPct());
                    System.out.println("Manager ID: " + vo.getManagerId());
                    System.out.println("Department ID: " + vo.getDepartmentId());
                    System.out.println("selectOne succeeded...");
                } else {
                    System.out.println("selectOne failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("5")){
                List<EmpVO> list = dao.selectAll();
                System.out.println("Employee List:");
                for(EmpVO x : list){
                    System.out.println("Employee ID: " + x.getEmployeeId() +
                                       ", First Name: " + x.getFirstName() +
                                       ", Last Name: " + x.getLastName() +
                                       ", Email: " + x.getEmail() +
                                       ", Phone Number: " + x.getPhoneNumber() +
                                       ", Hire Date: " + x.getHireDate() +
                                       ", Job ID: " + x.getJobId() +
                                       ", Salary: " + x.getSalary() +
                                       ", Commission Pct: " + x.getCommissionPct() +
                                       ", Manager ID: " + x.getManagerId() +
                                       ", Department ID: " + x.getDepartmentId());
                }
                System.out.println("=================");

            } else if(menu.equals("x")){
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
