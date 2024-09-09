package multi.algoritm;

import java.math.BigInteger;

public class Test20 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// n! 이라는 표기법은 n × (n − 1) × ... × 3 × 2 × 1을 뜻합니다.
		//
		// 예를 들자면 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800 이 되는데,
		// 여기서 10!의 각 자리수를 더해 보면 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27 입니다.
		//
		// 100! 의 자리수를 모두 더하면 얼마입니까?

		//방법1.
		getSum(100);
		
		//방법2.
//		BigInteger factorial = calculateFactorial(BigInteger.valueOf(100));
//        int digitSum = calculateDigitSum(factorial);
//        System.out.println("100!의 자리수 합: " + digitSum);

		System.out.println("Time:" + (System.currentTimeMillis() - startTime));
	}

	//방법1.
	private static void getSum(int max) {
		BigInteger sum = BigInteger.ONE;
		for (int i = max; i > 0; i--) {
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		System.out.println("sum:" + sum);

		String str = String.valueOf(sum);
		char[] cs = str.toCharArray();
		int strLength = 0;
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
			strLength += Integer.parseInt(String.valueOf(cs[i]));
		}
		System.out.println("strLength:" + strLength);
	}
	
	
	//방법2.
	private static BigInteger calculateFactorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(calculateFactorial(n.subtract(BigInteger.ONE)));
        }
    }

	//방법2.
    private static int calculateDigitSum(BigInteger number) {
        String digits = number.toString();
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            sum += Character.getNumericValue(digits.charAt(i));
        }
        return sum;
    }

	

}