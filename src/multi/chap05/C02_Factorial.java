package multi.chap05;
// 팩토리얼 값을 재귀적으로 구함

import java.util.Scanner;

class C02_Factorial {
	// --- 음이 아닌 정수 n의 팩토리얼 값을 반환 ---//
	static int factorial(int n) {
		System.out.println("n:" + n);
		if (n > 0)
			return n * factorial(n - 1);
		else
			return 1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
//		int x = stdIn.nextInt();
		int x = 5;

		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}
}