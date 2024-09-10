package multi.fibonachi;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = s.nextInt();
		int len = 10;

		System.out.println(solution(len));

	}// end main

	private static String solution(int len) {
		System.out.println(len);
		String answer = "";
		
		long cur = 1, sum = 0, temp;

		while (len+1 > 1) {
			temp = cur;
			cur = cur + sum;
			sum = temp;
//			System.out.print(sum+" ");
			answer += sum+" ";
			len--;
		}
		return answer;
	}
}// end class