package multi.type;

import java.util.Scanner;

public class Main04_for3_mission {
    public static void main(String[] args)  {
        System.out.println("hello");

        //2.Scanner 입출력
        Scanner s = new Scanner(System.in);

        //방금전 for반복문 미션처럼 3번 반복하도록 프로그램을 완성하세요
        String result = "";
        for (int i = 0; i < 3; i++) {

            //변수 - 이름,국,영,수,총점,평균,등급
            //name,kor,eng,math,total,avg,grade
            //이름을 입력하세요 라고 출력하기
            System.out.println("이름을 입력하세요");
            //변수처리
            String name = s.nextLine();
            //국어점수를 입력하세요 라고 출력하기
            System.out.println("국어점수를 입력하세요");
            //변수처리
            int kor = Integer.parseInt(s.nextLine());
            //영어점수를 입력하세요 라고 출력하기
            System.out.println("영어점수를 입력하세요");
            //변수처리
            int eng = Integer.parseInt(s.nextLine());
            //수학점수를 입력하세요 라고 출력하기
            System.out.println("수학점수를 입력하세요");
            //변수처리
            int math = Integer.parseInt(s.nextLine());

            //총점변수처리
            int total = kor+eng+math;
            //평균변수처리
            double avg = total/3.0;
            //등급변수처리
            String grade = null;
            if(avg<=100 && avg>=90){
                grade = "A";
            }else if(avg>=80){
                grade = "B";
            }else if(avg>=70){
                grade = "C";
            }else{
                grade = "D";
            }

            //최종출력문
            //홍길동, 국어(99),영어(88),수학(77),총점(264),평균(88.0),등급(B)
            System.out.printf("%s, 국어(%d),영어(%d),수학(%d),총점(%d),평균(%.1f),등급(%s)\n",
                    name,kor,eng,math,total,avg,grade);

            result += String.format("%s, 국어(%d),영어(%d),수학(%d),총점(%d),평균(%.1f),등급(%s)\n",
                    name,kor,eng,math,total,avg,grade);
        }//end for
        System.out.println("=======");
        System.out.println(result);



        s.close();//스캐너 사용이 끝났다면 닫아준다.
        System.out.println("end main....");
    }//end main
}//end class
