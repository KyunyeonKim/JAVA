package multi.type;

import java.util.Scanner;

public class Mission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //변수 - 국어,영어,수학, 총점, 평균, 등급

        System.out.println("이름을 입력하시오:"); // 이름
        String name = sc.nextLine();

        System.out.println("국어점수를 입력하시오:"); //국어
        int kor = sc.nextInt();

        System.out.println("영어점수를 입력하시오:");//영어
        int eng = sc.nextInt();

        System.out.println("수학점수를 입력하시오:");//수학
        int math = sc.nextInt();



        int total = kor + eng + math; //총합

        double avg = total/3; //평균


        String grade;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else {
            grade = "C";
        } //등급산정


        System.out.printf("이름:%s\n 국어점수: %d\n 영어점수:%d\n 수학점수: %d\n 총점점수: %d\n 평균점수: %f\n 등급: %s\n",
                name,kor,eng,math,total,avg,grade);

    }
}
