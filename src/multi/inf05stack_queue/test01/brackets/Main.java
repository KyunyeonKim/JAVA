package multi.inf05stack_queue.test01.brackets;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	/*
	 * 스택
	 * 올바른 괄호

	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		
		// 테스트용
		String str = "(()(())(()";//NO
//		String str = "(())()";//YES
		
		//풀이 요령
		//스텍에 여는괄호부터 쌓기 시작하여 닿는 괄호가 올때마다 
		//닿는 괄호는 스텍이 쌓지않고 여는괄호를 스텍에서 1:1로 제거해준다.
		//딱맞아떨어져서 더이상 지울께없을때는 ,YES
		//그이외에는 NO처리하면된다.
		
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "YES";
		
		Stack<Character> st = new Stack<>();
		for (char x : str.toCharArray()) {
			//1.스텍에 여는 괄호를 쌓는다.
			if(x=='(') {//여는 괄호일때 스텍에 푸쉬
				st.push(x);
			}else {//닿는 괄호일때
				if(st.isEmpty()) {
					return "NO";//닿는 괄호가 왔는데 스텍에 쌓인게 없다면 NO
				}
				st.pop();//쌓아놓은 마지막 여는 괄호를 1:1로 제거
			}
		}
		//반복문을 수행하고 나왔는데도 괄호가 남는게 있다면 NO처리
		if(!st.isEmpty()) {
			return "NO";
		}
		//그이외에는 짝이 다 맞는 것이므로 YES 처리
		return answer;
	}
}