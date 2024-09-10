package multi.algorithm05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int[] nums = new int[len];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt();
		}

		//테스트용
//		int[] nums = new int[] { 7, 3, 9, 5, 6, 12 };

		System.out.println(solution(nums));

	}// end main

	private static String solution(int[] nums) {
//		System.out.println("nums.length:" + nums.length);
		String answer = "";

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