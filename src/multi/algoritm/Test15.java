package multi.algoritm;

import java.math.BigInteger;

public class Test15 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// 아래()와 같은 2 × 2 격자의 왼쪽 위 모서리에서 출발하여
		// new Test15();
		// 오른쪽 아래 모서리까지 도달하는 길은
		// 모두 6가지가 있습니다 (거슬러 가지는 않기로 합니다).
		//
		// 그러면 20 × 20 격자에는 모두 몇 개의 경로가 있습니까?
		// 공식 20+20팩토리얼/20팩토리얼*20팩토리얼

		int h = 20;
		int v = 20;
		int su = v + h;

		//격자 공식(!는팩토리얼) : su!/(h!*v!) = 4*3*2*1/2*1 * 2*1 = 6
		
		//방법1.double 타입으로 처리
//		double totalCount = getFactorialDouble(su) / (getFactorialDouble(h) * (getFactorialDouble(v)));
//		System.out.println("totalCount:" + totalCount);// 1.3784652882E11
//		System.out.println("totalCount:" + (long) totalCount);// 137846528820

		
		//방법2.BigInteger타입으로 처리
		BigInteger totalCount = getFactorialBigInteger(su).divide(getFactorialBigInteger(h).multiply(getFactorialBigInteger(v)));
		System.out.println("totalCount:" + totalCount);//137846528820

		System.out.println("Time:" + (System.currentTimeMillis() - startTime));
	}

	//방법1.double 타입으로 처리
	private static double getFactorialDouble(int su) {
		double factorial = 1;

		for (int i = 1; i <= su; i++) {
			factorial *= i;
		}
		System.out.println("factorial:" + factorial);
		return factorial;
	}

	//방법2.BigInteger타입으로 처리
	private static BigInteger getFactorialBigInteger(int su) {
		BigInteger factorial = BigInteger.ONE;

		for (int i = 1; i <= su; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.println("factorial:" + factorial);
		return factorial;
	}

}