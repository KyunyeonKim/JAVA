package multi.primnumber;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = s.nextInt();
		int len = 20;
//		int len = 200000;// Main소수보다 성능이 뛰어나다.

		System.out.println(solution(len));

	}// end main

	private static String solution(int len) {
//		System.out.println(len);
		String answer = "";

		// 1.소수검증용 정수배열 : 모든 요소는 0으로 자동 초기화
		int[] sus = new int[len + 1];// 0~20 : 21
//		for (int i : sus) {
//			System.out.println(i);
//		}

		// 2. 2중반복문 : 소수면 0, 소수가 아니면 1
		int count = 0;
		for (int x = 2; x <= len; x++) {
//			System.out.println(x + ":" + sus[x]);
			if (sus[x] == 0) {
				count++;
				// 배수들은 소수에서 제외
				for (int i = x*x; i <= len; i += x) {
//					System.out.print(i + " ");
					sus[i] = 1;
				}
//				System.out.println();
			}
		}
//		System.out.println("====");
		answer += count;

		return answer;
	}
}// end class