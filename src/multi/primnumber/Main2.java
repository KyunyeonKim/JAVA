package multi.primnumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = s.nextInt();
		int len = 20;
//		int len = 200000;// Main소수보다 성능이 뛰어나다.

		System.out.println(solution(len));

	}// end main

	private static String solution(int len) {
//		System.out.println(len);
		String answer = "";
		
		//소수면 true, 아니면 false를 등록
		ArrayList<Boolean> prime = new ArrayList<Boolean>();

		prime.add(false);//0
		prime.add(false);//1
		
		//나머지는 true로 설정
		for (int i = 2; i <= len; i++) {
			prime.add(true);
		}
//		System.out.println(prime);
		
		//2중 반복문으로 검증
		for (int x = 2; x*x <= len; x++) {
//			System.out.println(x);
			if(prime.get(x)) {
				for (int i = x*x; i <= len; i+=x) {
//					System.out.print(i+" ");
					prime.set(i, false);
				}
//				System.out.println();
			}
		}
//		System.out.println(prime);
		
//		int counter = 0;     
//		for (int i = 0; i < prime.size(); i++) {
//			if(prime.get(i)) {
//				counter++; 
//			}
//		}
//		answer += counter;
		
		long count = prime.stream().filter(x->x).count();
		answer += count;
		return answer;
	}
}// end class