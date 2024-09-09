package multi.algoritm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test19 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// 다음은 달력에 관한 몇 가지 일반적인 정보입니다 
		//(필요한 경우 좀 더 연구를 해 보셔도 좋습니다).
		//
		// 1900년 1월 1일은 월요일이다.
		// 4월, 6월, 9월, 11월은 30일까지 있고, 1월, 3월, 5월, 7월, 8월, 10월, 12월은 31일까지 있다.
		// 2월은 28일이지만, 윤년에는 29일까지 있다.
		// 윤년은 연도를 4로 나누어 떨어지는 해를 말한다. 하지만 400으로 나누어 떨어지지 않는
		// 매 100년째는 윤년이 아니며, 400으로 나누어 떨어지면 윤년이다
		// 20세기 (1901년 1월 1일 ~ 2000년 12월 31일) 에서, 매월 1일이 일요일인 경우는 총 몇 번입니까?

		GregorianCalendar gcal = null;
		int count = 0;
		for (int x = 1901; x < 2001; x++) {
			for (int i = 0; i < 12; i++) {
				gcal = new GregorianCalendar(x, i, 1);
				System.out.println(gcal.get(Calendar.DAY_OF_WEEK));
				if (gcal.get(Calendar.DAY_OF_WEEK) == 7) {
					count++;
				}
			}
		}
		System.out.println("count:" + count);

		System.out.println("Time:" + (System.currentTimeMillis() - startTime));
	}

}