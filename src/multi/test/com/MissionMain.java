package multi.test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissionMain {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        String[][] student = new String[3][8];
        Student sd = new Student();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int x = 0; x < 3; x++) {


            System.out.println("멤버 번호");
            sd.member = Integer.parseInt(br.readLine());
            System.out.println("이름");
            sd.name = br.readLine();
            System.out.println("국어 점수");
            sd.kor = Integer.parseInt(br.readLine());
            System.out.println("영어 점수");
            sd.eng = Integer.parseInt(br.readLine());
            System.out.println("수학 점수");
            sd.math = Integer.parseInt(br.readLine());



            int total = sd.eng + sd.math + sd.kor;

            int avg = total / 3;

            String grade = null;



            if (avg >= 90) {
                grade ="A";
            } else if (avg >= 80) {
                grade = "B";
            } else if (avg>=70) {
                grade ="C";
            }
            else {
                grade="D";
            }


            student[x][0] = String.valueOf(sd.member);
            student[x][1] = String.valueOf(sd.name);
            student[x][2] = String.valueOf(sd.kor);
            student[x][3] = String.valueOf(sd.eng);
            student[x][4] = String.valueOf(sd.math);
            student[x][5] = String.valueOf(total);
            student[x][6] = String.valueOf(avg);
            student[x][7] = grade;





            for (int i = 0; i < student.length; i++) {
                System.out.printf("번호: %s, 이름: %s, 국어: %s, 영어: %s, 수학: %s, 총점: %s, 평균: %s, 등급: %s%n",
                        student[i][0], student[i][1], student[i][2], student[i][3],
                        student[i][4], student[i][5], student[i][6], student[i][7]);
            }

        }









    }
}
