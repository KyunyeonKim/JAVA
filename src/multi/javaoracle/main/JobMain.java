package multi.javaoracle.main;


import multi.javaoracle.job.JobDAO;
import multi.javaoracle.job.JobDAOImpl;
import multi.javaoracle.job.JobVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class JobMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        JobDAO dao = new JobDAOImpl();

        while(true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력, 2.수정, 3.삭제, 4.번호검색, 5.모두검색, x. 종료");
            String menu = br.readLine();
            System.out.println("==========================");

            if(menu.equals("1")){
                System.out.println("job_id:");
                String jobId = br.readLine();
                System.out.println("job_title:");
                String jobTitle = br.readLine();
                System.out.println("min_salary:");
                int minSalary = Integer.parseInt(br.readLine());
                System.out.println("max_salary:");
                int maxSalary = Integer.parseInt(br.readLine());

                JobVO vo = new JobVO();
                vo.setJobId(jobId);
                vo.setJobTitle(jobTitle);
                vo.setMinSalary(minSalary);
                vo.setMaxSalary(maxSalary);

                int result = dao.insert(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("insert succeeded...");
                } else {
                    System.out.println("insert failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("2")){
                System.out.println("job_id:");
                String jobId = br.readLine();
                System.out.println("job_title:");
                String jobTitle = br.readLine();
                System.out.println("min_salary:");
                int minSalary = Integer.parseInt(br.readLine());
                System.out.println("max_salary:");
                int maxSalary = Integer.parseInt(br.readLine());

                JobVO vo = new JobVO();
                vo.setJobId(jobId);
                vo.setJobTitle(jobTitle);
                vo.setMinSalary(minSalary);
                vo.setMaxSalary(maxSalary);

                int result = dao.update(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("update succeeded...");
                } else {
                    System.out.println("update failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("3")){
                System.out.println("job_id:");
                String jobId = br.readLine();

                JobVO vo = new JobVO();
                vo.setJobId(jobId);

                int result = dao.delete(vo);
                System.out.println("result: " + result);
                if(result == 1){
                    System.out.println("delete succeeded...");
                } else {
                    System.out.println("delete failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("4")){
                System.out.println("job_id:");
                String jobId = br.readLine();

                JobVO vo = dao.selectOne(jobId);
                if(vo != null){
                    System.out.println("Job ID: " + vo.getJobId());
                    System.out.println("Job Title: " + vo.getJobTitle());
                    System.out.println("Min Salary: " + vo.getMinSalary());
                    System.out.println("Max Salary: " + vo.getMaxSalary());
                    System.out.println("selectOne succeeded...");
                } else {
                    System.out.println("selectOne failed...");
                }
                System.out.println("=================");

            } else if(menu.equals("5")){
                List<JobVO> list = dao.selectAll();
                System.out.println("Job List:");
                for(JobVO x : list){
                    System.out.println("Job ID: " + x.getJobId() +
                                       ", Job Title: " + x.getJobTitle() +
                                       ", Min Salary: " + x.getMinSalary() +
                                       ", Max Salary: " + x.getMaxSalary());
                }
                System.out.println("=================");

            } else if(menu.equals("x")){
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
