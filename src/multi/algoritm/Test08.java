package multi.algoritm;

public class Test08 {

	public static void main(String[] args) {
		System.out.println("Test08");

		// 다음은 연속된 1000자리 숫자입니다 (읽기 좋게 50자리씩 잘라놓음).

		// 73167176531330624919225119674426574742355349194934
		// 96983520312774506326239578318016984801869478851843
		// 85861560789112949495459501737958331952853208805511
		// 12540698747158523863050715693290963295227443043557
		// 66896648950445244523161731856403098711121722383113
		// 62229893423380308135336276614282806444486645238749
		// 30358907296290491560440772390713810515859307960866
		// 70172427121883998797908792274921901699720888093776
		// 65727333001053367881220235421809751254540594752243
		// 52584907711670556013604839586446706324415722155397
		// 53697817977846174064955149290862569321978468622482
		// 83972241375657056057490261407972968652414535100474
		// 82166370484403199890008895243450658541227588666881
		// 16427171479924442928230863465674813919123162824586
		// 17866458359124566529476545682848912883142607690042
		// 24219022671055626321111109370544217506941658960408
		// 07198403850962455444362981230987879927244284909188
		// 84580156166097919133875499200524063689912560717606
		// 05886116467109405077541002256983155200055935729725
		// 71636269561882670428252483600823257530420752963450
		//
		// 여기서 붉게 표시된 71112의 경우 7, 1, 1, 1, 2 각 숫자를 모두 곱하면 14가 됩니다.
		//
		// 이런 식으로 맨 처음 (7 × 3 × 1 × 6 × 7 = 882) 부터 맨 끝 (6 × 3 × 4 × 5 × 0 = 0)
		// 까지 5자리 숫자들의 곱을 구할 수 있습니다.
		//이렇게 구할 수 있는 연속한 5개 숫자의 곱 중에서 가장 큰 값은 40824 입니다.
		
		// 이렇게 구할 수 있는 13자리 숫자의 곱 중에서 가장 큰 값은 얼마입니까? 
		// 참고 : 슬라이딩 윈도우 알고리즘으로 해석가능하다.

		String strSu = "73167176531330624919225119674426574742355349194934"
				+ "96983520312774506326239578318016984801869478851843"
				+ "85861560789112949495459501737958331952853208805511"
				+ "12540698747158523863050715693290963295227443043557"
				+ "66896648950445244523161731856403098711121722383113"
				+ "62229893423380308135336276614282806444486645238749"
				+ "30358907296290491560440772390713810515859307960866"
				+ "70172427121883998797908792274921901699720888093776"
				+ "65727333001053367881220235421809751254540594752243"
				+ "52584907711670556013604839586446706324415722155397"
				+ "53697817977846174064955149290862569321978468622482"
				+ "83972241375657056057490261407972968652414535100474"
				+ "82166370484403199890008895243450658541227588666881"
				+ "16427171479924442928230863465674813919123162824586"
				+ "17866458359124566529476545682848912883142607690042"
				+ "24219022671055626321111109370544217506941658960408"
				+ "07198403850962455444362981230987879927244284909188"
				+ "84580156166097919133875499200524063689912560717606"
				+ "05886116467109405077541002256983155200055935729725"
				+ "71636269561882670428252483600823257530420752963450";

		System.out.println("strSu.length():"+strSu.length());
		
		//1.5자릿수 자르기
//		int limit_su = 5;
		int limit_su = 13;//자릿수만 늘려주면 끝
		//반복문은 문자열의길이 - (자릿수-1)까지 반복
//		for (int x = 0; x < strSu.length()-(limit_su-1); x++) {
//			String fiveSu = strSu.substring(x, x+limit_su);//리밋트만큼잘라야겠죠?
//			System.out.println("fiveSu:"+fiveSu);
//		}
		
		
//		for (int x = 0; x < strSu.length()-(limit_su-1); x++) {
//			String fiveSu = strSu.substring(x, x+limit_su);
//			if(fiveSu.contains("0"))continue;//0제외
//			System.out.println("fiveSu:"+fiveSu);
//			
//			//2. 5자릿수 곱하기
//			int su = 1;//0은 걸렀으니 1
//			int multi = 1; //0부터 곱할일은 없으니 1
//			for (int i = 0; i < limit_su; i++) {
//				//문자열한개씩 정수로변환
//				su = Integer.parseInt(String.valueOf(fiveSu.charAt(i)));
//				multi *= su;//각 su를 곱한값을 multi변수에 누적
//			}
//			System.out.println("multi:"+multi);
//		}
		
		//3. 큰값으로 재할당할 변수선언
		long max = 0; //21억 넘을수 있으니 8byte로 설정
		for (int x = 0; x < strSu.length()-(limit_su-1); x++) {
			String fiveSu = strSu.substring(x, x+limit_su);
			if(fiveSu.contains("0"))continue;//0제외
			System.out.println("fiveSu:"+fiveSu);

			//2. 5자리수 곱하기
			int su = 1;//0은 걸렀으니 1
			long multi = 1; //0부터 곱할일은 없으니 1
			for (int i = 0; i < limit_su; i++) {
				su = Integer.parseInt(String.valueOf(fiveSu.charAt(i)));
				multi *= su;
				
				//3. 큰값으로 재할당
				if(max < multi) max = multi;
			}
			System.out.println();
			System.out.println("max:"+max);//40824,23514624000
		}
	}

}