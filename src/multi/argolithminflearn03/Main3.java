package multi.argolithminflearn03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "a#b!GE*T@S";
		
		System.out.println(solution(str));

		
	}//end main

	private static String solution(String str) {
//		System.out.println(str);
		String answer = "";
		
		//0.리스트에 할당
		List<String> list = Arrays.asList(str.split(""));
		System.out.println(list);
		
		//1.리스트의 뒷쪽에서부터 영문만 Stack에 추가
		Stack<String> stack = new Stack<String>();
		for (int i = list.size()-1; i >= 0; i--) {
			if(list.get(i).matches("[a-zA-Z]")) {
				stack.push(list.get(i));
			}
		}
		System.out.println(stack);
		
		//2.알파벳인 것들만 스텍에서 뽑아서 리스트를 변경
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).matches("[a-zA-Z]"));
			if(list.get(i).matches("[a-zA-Z]")) {
				list.set(i, stack.remove(0));
			}
		}
//		System.out.println(list);
		
		//3.문자열로 변환해서 할당
//		answer = String.join("", list);
//		answer = list.stream().collect(Collectors.joining());
		answer = list.stream().reduce("", String::concat);
		
		return answer;
	}

}//end class