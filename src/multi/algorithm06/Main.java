package multi.algorithm06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();//8
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

//		//테스트용 130 135 148 140 145 150 150 153
//		int[] nums = new int[] { 130, 135, 148, 140, 145, 150, 150, 153 };

        System.out.println(solution(nums));

    }// end main

    private static String solution(int[] nums) {
//		System.out.println("nums.length:" + nums.length);
        String answer = "";

        //1.첫번째학생은 무조건 보임
        String temp = "";
        temp += nums[0];

        //2.키비교 반복문
        for (int i = 0; i < nums.length -1; i++) {
//			System.out.println(nums[i+1]);
            //뒷학생이 앞학생보다 크면 카운팅
            if(nums[i] < nums[i+1]) {
                temp += " " + nums[i+1];
            }
            //앞학생이 뒷학생보다 크거나 같은 같은 학생인 경우는 큰키로 바꿔치기
            if(nums[i] >= nums[i+1]) {
                nums[i+1] = nums[i];
            }
        }
//		System.out.println(temp);
        answer += temp.split(" ").length;

        return answer;
    }
}// end class