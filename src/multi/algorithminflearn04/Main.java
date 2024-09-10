package multi.algorithminflearn04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "gooG";
		
		System.out.println(solution(str));

		
	}//end main

	private static String solution(String str) {
		System.out.println(str);
		String answer = "NO";
		
		//주어진 문자열과 뒤집은 문자열을 비교(대소문자 구분없이)
//		System.out.println(str.equalsIgnoreCase(
//				new StringBuffer(str).reverse().toString()));
		
		if(str.equalsIgnoreCase(
				new StringBuffer(str).reverse().toString())) {
			answer = "YES";
		}
		
		return answer;
	}

}//end class