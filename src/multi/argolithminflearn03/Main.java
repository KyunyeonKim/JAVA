package multi.argolithminflearn03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
//		String str = "it is time to study";
		
		System.out.println(solution(str));

		
	}//end main

	private static String solution(String str) {
//		System.out.printf("%s\n",str);
		String answer = "";
		int temp = 0;//문자열의 길이를 임시로 저장할 변수
		//1.배열로 변환해서 반복으로 구현
		for (String  x  : str.split(" ")) {
			//2.아이템의 길이를 임시저장할 변수에 대입 임시저장된값보다 크면
			if(temp < x.length()) {
				temp = x.length();
//				System.out.println(x);
				answer = x; //계속해서 x값 재할당
			}
		}
		
		return answer;
	}

}//end class