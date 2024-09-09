package multi.algoritm;

public class Test12_2 {

	public static void main(String[] args) {
		// 1부터 n까지의 자연수를 차례로 더하여 구해진 값을 삼각수라고 합니다.
		// 예를 들어 7번째 삼각수는 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28이 됩니다.
		// 이런 식으로 삼각수를 구해 나가면 다음과 같습니다.
		//
		// 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
		// 이 삼각수들의 약수를 구해봅시다.

		// 1: 1
		// 3: 1, 3
		// 6: 1, 2, 3, 6
		// 10: 1, 2, 5, 10
		// 15: 1, 3, 5, 15
		// 21: 1, 3, 7, 21
		// 28: 1, 2, 4, 7, 14, 28
		// 위에서 보듯이, 5개 이상의 약수를 갖는 첫번째 삼각수는 28입니다.

		// 그러면 500개 이상의 약수를 갖는 가장 작은 삼각수는 얼마입니까?

		long startTime = System.currentTimeMillis();
		test();// 제곱근 활용 빠르게 처리
		System.out.println("RunTime : " + (System.currentTimeMillis() - startTime));
	}

	private static void test() {
		int i = 1;// 자연수 변수 초기화

		while (true) {
			// 1.해당 삼각수를 획득
			int su = getSu(i);

			// 2.삼각수를 이용 약수카운트를 획득
			int count = getCount(su);

			// 3.약수카운트가 500개가되면 출력 후 반복문 탈출
			if (count >= 500) {
				System.out.println("정답: " + su);
				break;
			}

			i++;// 1씩 증가
		}
	}

	// 1.삼각수 계산 공식 적용
	private static int getSu(int n) {
		return n * (n + 1) / 2;
	}

	// 2.약수갯수 카운팅
	private static int getCount(int su) {
		int count = 0;

		for (int i = 1; i <= Math.sqrt(su); i++) {
			if (su % i == 0) {
				count += 2; // 제곱근사용시 두 개씩 증가
			}
		}

		// 제곱근 사용시 약수 중복시 이를 배제하기위해 감소시켜줌
		if (Math.sqrt(su) * Math.sqrt(su) == su) {
			count--;
		}

		return count;
	}

}