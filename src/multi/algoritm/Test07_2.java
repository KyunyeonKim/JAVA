package multi.algoritm;

public class Test07_2 {

	public static void main(String[] args) {
		// 소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과
		// 같이 됩니다.
		//
		// 이 때 10,001번째의 소수를 구하세요.
		
		// 1. 소수
		// 1보다 큰 자연수 중에서 1과 그 수 자신만을 약수로 가지는 수
		// (1) 모든 소수의 약수의 개수는 2개이다.
		// (2) 소수 중 짝수는 2뿐이다.
		System.out.println("Test07");//104743
		int n = 10001;
		int count = 1;
        long result = 1;

        while (count < n) {
        	result++;
//        	System.out.println("result:"+result);
            if (CheckIfPrime(result)) {
                count++;
                System.out.println("count:"+count);
            }
        }

        System.out.println("result:"+result);
		
	}//end main
	
	private static boolean CheckIfPrime(long value) {
		long sqrt = (long) Math.sqrt(value);
		long high = (long) Math.floor(sqrt) + 1;
		//value로 넘어온값을 제곱근 처리후 소숫점 버림처리
//		System.out.println(value+","+sqrt+","+high);
		for ( long div = 2; div <= high; div++) {
//			System.out.println(value+"%"+div+">>"+(value%div));
			if (value % div == 0) {
				//배열의 값이 div~high 사이 값으로 나누어떨어지면 배열에서 제외
//				System.out.println(value+">> 제외됨.");
				return false;
			}
		}
		return true;
	}

}