package multi.algoritm;

public class Test10 {

	public static void main(String[] args) {
		System.out.println("Test10");

		// 10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.
		// 이백만(2,000,000) 이하 소수의 합은 얼마입니까?
		long startTime = System.currentTimeMillis();
		long sum = 0;
		for (long x = 2; x <= 2000000; x++) {
			if (checkIfPrime(x)) {
//				System.out.println(x);
				sum += x;
			}
		}
		System.out.println("sum:" + sum);//142913828922
		System.out.println("처리시간(ms):" + (System.currentTimeMillis() - startTime));
	}

	private static boolean checkIfPrime(long value) {
		if (value == 2)
			return true;
		long sqrt = (long) Math.sqrt(value);
		long high = (long) Math.floor(sqrt) + 1;
		for (long div = 2; div <= high; div++) {
			if (value % div == 0) {
				return false;
			}
		}
		return true;
	}
}