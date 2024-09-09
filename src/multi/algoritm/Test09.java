package multi.algoritm;

public class Test09 {
//이클립스에서 문자열에 제곱표기 : 윈도우키 + 키보드 꺽쇠 크다(>) 동시에 눌러서 팝업에서 선택
	public static void main(String[] args) {
		System.out.println("Test09");

		// 세 자연수 a, b, c 가 피타고라스 정리 a2 + b2 = c2 를
		// 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ).
		// 예를 들면 3² + 4² = 5²이므로
		// 3, 4, 5는 피타고라스 수입니다.

		// a + b + c = 1000 인 피타고라스 수 a, b, c는
		// 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?

		for (int a = 1; a < 1000; a++) {
			for (int b = 2; b < 1000; b++) {
				for (int c = 3; c < 1000; c++) {
					// (여기서 a < b < c )
					if (a < b && b < c) {
						// 3² + 4² = 5²
						if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
//							System.out.printf("%d+%d+%d=%d\n",a,b,c,a+b+c);
							if (a + b + c == 1000) {
								System.out.printf("%d+%d+%d=%d\n", a, b, c, a + b + c);
								System.out.printf("%d*%d*%d=%d\n", a, b, c, a * b * c);
							}
						}
					}

				}
			}
		}

	}

}