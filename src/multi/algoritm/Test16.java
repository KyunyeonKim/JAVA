package multi.algoritm;

import java.math.BigInteger;

public class Test16 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// 2의15제곱 = 32768 의
		// 각 자리수를 더하면 3 + 2 + 7 + 6 + 8 = 26 입니다.

		// 2의1000제곱 = ? 의 각 자리수를 모두 더하면 얼마입니까?
		// double 타입일경우 뒷자리가 모두표기되지않는다.
//		System.out.println(Math.pow(2, 1000));//1.0715086071862673E301

		// 큰수다루는 객체로 처리하면되겠죠?
		System.out.println(new BigInteger("2").pow(1000));// 모두 출력됨.
		char[] cs = new BigInteger("2").pow(1000).toString().toCharArray();
		System.out.println("cs.length:"+cs.length);
		
		int sum = 0;
		for (int i = 0; i < cs.length; i++) {
			sum += Integer.parseInt(String.valueOf(cs[i]));
		}
		System.out.println("sum:" + sum);

		System.out.println("Time:" + (System.currentTimeMillis() - startTime));
	}

}