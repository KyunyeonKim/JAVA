package multi.fibonachi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = s.nextInt();
		int len = 10;

		System.out.println(solution(len));

	}// end main

	private static String solution(int len) {
		System.out.println(len);
		String answer = "";
		
		//1.첫번째1,두번째2 변수할당
		long a = 1,b=1;
		answer += a+" "+b+" ";
		
		//2.나머지는 2~len만큼 반복
		for (int i = 2; i < len; i++) {
			long temp = a+b;
			a = b;
			b = temp;
//			System.out.println(temp);
			answer += temp +" ";
		}
		return answer;
	}
}// end class