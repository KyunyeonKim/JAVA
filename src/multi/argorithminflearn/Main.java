package multi.argorithminflearn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
//		String str1 = "Computercooler";
//		String str2 = "c";
		
		System.out.println(solution(str1,str2));

		
	}//end main

	private static String solution(String str1,String str2) {
//		System.out.printf("%s\n%s\n",str1,str2);
		String answer = "";
		int count = 0;
		
		//1.첫번째 문자열을 반복문으로 처리
		for (int i = 0; i < str1.length(); i++) {
			//2.첫번째 문자열을 대소문자 구분없이 하기위해 소문자로 변경
			//3.한자한자 잘라서 두번째문자열과 비교, 참일때 카운팅
//			System.out.println(str1.toLowerCase().charAt(i)==str2.charAt(0));
			if(str1.toLowerCase().charAt(i)==str2.charAt(0)) {
				count++;
			}
		}
		
		return answer+count;
	}

}//end class