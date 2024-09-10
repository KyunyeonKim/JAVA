package multi.argolithminflearntest02;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
//		String str = "StuDY";
		
		System.out.println(solution(str));

		
	}//end main

	private static String solution(String str) {
//		System.out.printf("%s\n",str);
		String answer = "";
//		for (int i = 65; i < 123; i++) {
//			System.out.println(i+":"+(char)i);
//		}
		//3.97~122소문자, 65~90대문자 를 이용해서분기.
		//A + 32 = a,   a -32 = A
		for (char x : str.toCharArray()) {
//			System.out.println(x >= 65 && x<=90);//대문자구분
			if(x >= 65 && x<=90) {
				answer += (char)(x+32);//대 -> 소
			}else {
				answer += (char)(x-32);//소 -> 대
			}
		}
		return answer;
	}

}//end class