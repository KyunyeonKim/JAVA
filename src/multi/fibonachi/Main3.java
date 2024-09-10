package multi.fibonachi;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = s.nextInt();
		int len = 10;
		
		long[] memo = new long[len+2];//[0],[1]비워놓기 +2
		solution(len,memo);
		System.out.println(answer);

	}// end main

	static String answer = "";
	private static long solution(int n, long[] memo) {
		
		if(memo[n]!=0) return memo[n];
		if (n <= 1)
			return n;
		memo[n] = solution(n - 1,memo) + solution(n - 2,memo);
//		System.out.print(memo[n]+" ");
		answer += memo[n]+" ";
		return memo[n];
	}
}// end class