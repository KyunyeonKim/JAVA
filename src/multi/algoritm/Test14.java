package multi.algoritm;

public class Test14 {

	public static void main(String[] args) {
		// 양의 정수 n에 대하여, 다음과 같은 계산 과정을 반복하기로 합니다.
		//
		// n → n / 2 (n이 짝수일 때)
		// n → 3 n + 1 (n이 홀수일 때)
		//
		// 13에 대하여 위의 규칙을 적용해보면 아래처럼 10번의 과정을
		// 통해 1이 됩니다.
		//
		// 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
		// 아직 증명은 되지 않았지만, 이런 과정을 거치면
		// 어떤 수로 시작해도 마지막에는 1로 끝나리라 생각됩니다.
		// (역주: 이것은 콜라츠 추측 Collatz Conjecture이라고 하며,
		// 이런 수들을 우박수 hailstone sequence라 부르기도 합니다)
		//
		// 그러면, 백만(1,000,000) 이하의 수로 시작했을 때
		// 1까지 도달하는데 가장 긴 과정을 거치는 숫자는 얼마입니까?
		//
		// 참고: 계산 과정 도중에는 숫자가 백만을 넘어가도 괜찮습니다.
		long startTime = System.currentTimeMillis();
		
		long bigCount = 0;
		long bigSu = 0;
		
		for (long x = 1; x <= 1000000; x++) {
			long count = 0;
			long n = x;
			while (true) {
//				System.out.print(n+" ");
				if (n % 2 != 0) {
					n = 3 * n + 1;//홀수일때
				} else {
					n = n / 2;//짝수일때
				}
				count++;

				if (n == 1) {
//					if(count%10==0)System.out.println(count);
					if (bigCount <= count) {
						bigCount = count;
						bigSu = x;
					}
					break;
				}
			}
//			System.out.print(n);
//			System.out.println();

		}
		System.out.println("[" + bigSu + "]bigCount:" + (bigCount + 1));
		System.out.println("Time:" + (System.currentTimeMillis() - startTime));
	}//end main

}//end class