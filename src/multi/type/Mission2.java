package multi.type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission2{
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //1.io - Input/Output : 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //변수 - 이름,국,영,수,총점,평균,등급
        //name,kor,eng,math,total,avg,grade
        //이름을 입력하세요 라고 출력하기
        System.out.println("이름을 입력하세요");
        //변수처리
        String name = br.readLine();
        //국어점수를 입력하세요 라고 출력하기
        System.out.println("국어점수를 입력하세요");
        //변수처리
        int kor = Integer.parseInt(br.readLine());
        //영어점수를 입력하세요 라고 출력하기
        System.out.println("영어점수를 입력하세요");
        //변수처리
        int eng = Integer.parseInt(br.readLine());
        //수학점수를 입력하세요 라고 출력하기
        System.out.println("수학점수를 입력하세요");
        //변수처리
        int math = Integer.parseInt(br.readLine());

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
        System.out.printf("%s, 국어(%d),영어(%d),수학(%d),총점(%d),평균(%.1f),등급(%s)",
                name,kor,eng,math,total,avg,grade);


        br.close();//입출력 사용이 끝났다면 닫아준다.
        System.out.println("end main....");
    }//end main
}//end class