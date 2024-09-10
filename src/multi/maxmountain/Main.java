package multi.maxmountain;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 5;
		
		String[] strs = new String[len];
//		for (int i = 0; i < len; i++) {
//			strs[i] = s.nextLine();
//		}
		strs[0] = "5 3 7 2 3";
		strs[1] = "3 7 1 6 1";
		strs[2] = "7 2 5 3 4";
		strs[3] = "4 3 6 4 1";
		strs[4] = "8 7 3 5 2";

		System.out.println(solution(strs));

	}// end main

	private static String solution(String[] strs) {
		System.out.println(strs.length);
		System.out.println(Arrays.toString(strs));
		String answer = "";
		
		//1.문자열배열 >> 2차원 정수배열 변환 >> 테두리 0으로 채우기
		int[][] grid = new int[strs.length+2][strs.length+2];
		for (int i = 0; i < strs.length; i++) {
			//문자열배열
			strs[i] = "0 "+strs[i] + " 0";//0 5 3 7 2 3 0
			String[] arr = strs[i].split(" ");//["0", "5", "3", "7", "2", "3", "0"]
//			System.out.println(Arrays.toString(arr));	
			grid[i+1] = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		}
		for (int[] is : grid) {
			System.out.println(Arrays.toString(is));
		}
		
		//2. 2차원정수배열을 반복문으로 값비교하는 로직 처리
		//첫행과 끝행 제외,첫열과 끝열 제외
		int count = 0;
		for (int x = 1; x < grid.length-1; x++) {
			for (int i = 1; i < grid[x].length-1; i++) {
				//해당값([x][i])상하좌우 값들보다 비교해서 제일크면 봉우리이다 이때 카운팅
				if(grid[x][i] > grid[x-1][i] 
						&& grid[x][i] > grid[x+1][i]
						&& grid[x][i] > grid[x][i-1] 
						&& grid[x][i] > grid[x][i+1]) {
					System.out.println(grid[x][i]);
					count++;
				}
			}
		}
		answer += count;
		
		return answer;
	}
}// end class