package multi.score;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 10;
		
//		String str = s.nextLine();
		String str = "1 0 1 1 1 0 0 1 1 0";
		

		System.out.println(solution(len, str));

	}// end main

	private static String solution(int len,String str) {
		System.out.println(len);
		System.out.println(str);
		String answer = "";
		
		//1.공백을 제거해서 캐릭터 하나씩 검증하는 방법
		str = str.replace(" ", "");
		System.out.println(str);
		
		//2.점수를 할당할 배열생성
		int[] score = new int[len];//0,0,0,....
		
		//3.1번문제가 맞는 경우는 1점계산
		if(str.charAt(0) == '1') score[0] = 1;
		
		//4.나머지는 반복문으로 연속득점시 카운트 증가
		int count = 1; //맞으면 1점
		for (int i = 1; i < score.length; i++) {
			//맞았을때 : 연속득점 >> 가산점
			if(str.charAt(i) ==  str.charAt(i-1)) {
				count++;
				score[i] = count;
			}else {//연속득점 아님
				count = 1;
				score[i] = count;
			}
			
			//틀렸을때 : 0 >> 0점
			if(str.charAt(i)=='0') {
				score[i] = 0;
			}
		}
		System.out.println(Arrays.toString(score));
		
		//5.점수합산 방법 1 : 반복문
//		int sum = 0;
//		for (int i : score) {
//			sum += i;
//		}
//		answer += sum;
		
//		//참고 : 평균구하기1
//		System.out.println((double)sum/len);
		
		//5.점수합산 방법 2 : 스트림
		answer += Arrays.stream(score).sum();
		//참고 : 평균구하기2
//		System.out.println(Arrays.stream(score).average().orElse(0));

		
		return answer;
	}
}// end class