package multi.alpabrackets;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	/*
	 * 스택 소괄호()사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하기
	 * 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();

		// 테스트용
		String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";// EFLM

		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";

		Stack<Character> st = new Stack<>();
		for (char x : str.toCharArray()) {
			System.out.println(x);
			// 1.스텍에 여는 괄호를 쌓는다.
			if (x == '(' || x != ')' ) {// 여는 괄호와 영어를 스텍에 푸쉬
				st.push(x);
				
			} else {// 닿는 괄호일때 while반복문수행
				System.out.println(st);
				// 제거해야될 대상들을 예:(AB)를 제거
				char target;
				do{
					target = st.pop();
					System.out.println(target+" : 제거함...");
				}while ( target != '(');//여는 괄호 만나면 탈출
				System.out.println("---------end while----");
			}
		}
		System.out.println("===완료====");
		System.out.println(st);

		for (Character x : st) {
			answer += x+" ";
		}
		
		return answer;
	}
}