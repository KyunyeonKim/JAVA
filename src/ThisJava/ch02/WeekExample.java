package ThisJava.ch02;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {

        //Week 열거 타입 변수 선언
        Week today = null;

        //Calendar 얻기
        Calendar cal = Calendar.getInstance();

        //오늘의 요일 얻기(1~7)
        int week = cal.get(Calendar.DAY_OF_WEEK);

        //숫자를 열거 상수로 변호나해서 변수에 대입
        switch (week){
            case 1 : today = Week.Sunday; break;
            case 2: today = Week.Monday; break;
            case 3: today = Week.Monday; break;
            case 4: today = Week.Monday; break;
            case 5: today = Week.Monday; break;
            case 6: today = Week.Monday; break;
            case 7: today = Week.Monday; break;
        }

        //열거 타입 변수를 사용
        if (today == Week.Sunday) {
            System.out.println("일요일에는 축구를 합니다");
        }else {
            System.out.println("열심히 자바를 공부합니다");
        }
    }
}
