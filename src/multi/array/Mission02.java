package multi.array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission02 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("이름을 입력하세요");
        String name = br.readLine();
        System.out.println("국어을 입력하세요");
        String kor = br.readLine();
        System.out.println("영어을 입력하세요");
        String eng = br.readLine();
        System.out.println("수학을 입력하세요");
        String math = br.readLine();

        int korScore = Integer.parseInt(kor);
        int engScore = Integer.parseInt(eng);
        int mathScore = Integer.parseInt(math);

        // 총점 계산
        int total = korScore + engScore + mathScore;

        // 평균 계산 (소수점 계산을 위해 double로 변환)
        double avg = total / 3.0;

        // 배열에 값 저장
        String[] score = new String[]{
                name,
                kor,
                eng,
                math,
                Integer.toString(total),
                Double.toString(avg)
        };

        for (int i = 0; i <score.length; i++) {
            System.out.println(score[i]);
        }





     //score : 이름,국,영,수,총점,평균,등급
        //new String[][]{
        //
        // new String[]{"이순신1","99","88","77","","",""}
        // new String[]{"이순신2","99","88","77","","",""}
        // new String[]{"이순신3","99","88","77","","",""}
        //
        //
        //
        //
        // }



    }
    }










