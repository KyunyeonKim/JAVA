package multi.algorithm;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "g0en2T0s8eSoft";
		
		System.out.println(solution(str));

		
	}//end main

	private static String solution(String str) {
		System.out.println(str);
		String answer = "";
		
		//char[]을 이용하는 방법
		for (char x : str.toCharArray()) {
			//숫자검증메소드 
			if(Character.isDigit(x)) {
				System.out.println(x);
				answer += x;
			}
		}
		
		answer = String.valueOf(Integer.parseInt(answer));
		
		return answer;
	}

}//end class