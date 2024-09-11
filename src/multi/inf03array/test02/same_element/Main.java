package multi.inf03array.test02.same_element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*  **********앞선 문제와 유사하다************
	 * 공통원소 구하기 : 투 포인터스 알고리즘(O(n)) - 오름차순이 선행되어져야한다.
	 * 
	 * A,B 두개의 집합이 주어지면 두 집합의 공통 원소(교집합)를 
	 * 추출하여 오름차순으로 출력하는 프로그램 
	 * 5 
	 * 1 3 9 5 2 
	 * 5 
	 * 3 2 5 7 8
	 * 
	 * 출력예시 2 3 5
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int[] sus1 = new int[n];
//		for (int i = 0; i < sus1.length; i++) {
//			sus1[i] = s.nextInt();
//		}
//		int m = s.nextInt();
//		int[] sus2 = new int[m];
//		for (int i = 0; i < sus2.length; i++) {
//			sus2[i] = s.nextInt();
//		}
		// 테스트용
		int n = 5;
		int m = 5;
		int[] sus1 = new int[] { 1, 3, 9, 5, 2 };
		int[] sus2 = new int[] { 3, 2, 5, 7, 8 };
		System.out.println(solution(n, m, sus1, sus2));
	}

	private static String solution(
			int n, int m, int[] a, int[] b) {
		String answer = "";
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		// 오름차순이 선행되어져야한다. 이미되어있으니 안해도되지만~
		Arrays.sort(a);
		Arrays.sort(b);

		// 포인터 변수 2개 필요하다.
		int p1 = 0, p2 = 0;
		
		while (p1 < n && p2 < m) {// p1,p2둘중 아무거나 증가하다 n,m값이되면 반복문 종료
			if (a[p1] == b[p2]) {// [이번은 같은때] 리스트에 p1추가(같은값이니 p2를 추가해도됨)하고 p1과p2모두증가
				list.add(a[p1++]);// add선행,p1++
				p2++;
			}else if(a[p1]< b[p2]) { //p1이 작을때
				p1++;
			} else {  //p2가 작을때
				p2++;
			}
		}

		
		for (Integer x : list) {
			answer += x+" ";
		}
		
		return answer;
	}
}