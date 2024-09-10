package multi.primnumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = s.nextInt();
		int len = 20;
//		int len = 200000;//4초정도 소요된다

		System.out.println(solution(len));

	}// end main

	private static String solution(int len) {
//		System.out.println(len);
		String answer = "";
		
		int counter = 0;        // 소수의 갯수

        for (int n = 2; n <= len; n++) {
            int i;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                	// 나누어떨어지면 소수가 아님
                	break; // 반복은 더 이상 불필요
                }
            }
            if (n == i) {
            	counter++;
            	// 마지막까지 나누어떨어지지 않음<<소수
//            	System.out.println(n);
            }
        }

//        System.out.println("소수의 갯수 : " + counter);
		answer += counter;
		return answer;
	}
}// end class