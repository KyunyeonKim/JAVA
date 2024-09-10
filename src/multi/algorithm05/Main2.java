package multi.algorithm05;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 6;

//		String str = s.nextLine();
		String str = "7 3 9 5 6 12";
		
		System.out.println(solution(str));

	}// end main

	private static String solution(String str) {
		System.out.println(str);
		String answer = "";

		String[] arr = str.split(" ");
		//***숫자로된 문자열 배열을 정수배열로 변환하기 1 - 반복문사용
//		int[] nums = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			nums[i] = Integer.parseInt(arr[i]);
//		}
		//***숫자로된 문자열 배열을 정수배열로 변환하기 2 - 스트림 사용
		int[] nums = Arrays.stream(arr)
							.mapToInt(Integer::parseInt).toArray();
		
		// 1.첫수는 무조건 할당
		answer += nums[0];

		// 2.i,i+1 비교하면서 증가하는 반복문(끝수 바로 앞까지만 : -1)
		for (int i = 0; i < nums.length - 1; i++) {
//			System.out.println(nums[i]+":"+nums[i+1]);
			if(nums[i] < nums[i+1]) {
				answer += " " + nums[i+1];
			}
		}

		return answer;
	}
}// end class