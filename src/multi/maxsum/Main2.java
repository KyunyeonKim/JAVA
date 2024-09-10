package multi.maxsum;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 5;
//		String str = s.nextLine();
        String[] strs = new String[len];
		strs[0] = "10 13 10 12 15";
		strs[1] = "12 39 30 23 11";
		strs[2] = "11 25 50 53 15";
		strs[3] = "19 27 29 37 27";
		strs[4] = "19 13 30 13 19";

        System.out.println(solution(strs));
    }

    private static String solution(String[] strs) {
    	String answer = "";
    	
    	int maxSum = 0;
        
    	//문자열 배열 >> 2차원의 정수배열 변환
        int[][] grid = new int[strs.length][strs.length];
        for (int i = 0; i < strs.length; i++) {
			String[] arr = strs[i].split(" ");
			int[] score = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
			grid[i] = score;
		}
        for (int[] is : grid) {
			System.out.println(Arrays.toString(is));
		}

        // 5개 행의 합 계산 및 최대값 찾기
        for (int i = 0; i <= grid.length - 5; i++) {
            int rowSum = calculateRowSum(grid, i);
            maxSum = Math.max(maxSum, rowSum);
        }

        // 5개 열의 합 계산 및 최대값 찾기
        for (int j = 0; j <= grid[0].length - 5; j++) {
            int colSum = calculateColSum(grid, j);
            maxSum = Math.max(maxSum, colSum);
        }

        // 두 대각선의 합 계산 및 최대값 찾기
        int diagonalSum1 = calculateDiagonalSum1(grid);
        int diagonalSum2 = calculateDiagonalSum2(grid);

        
        // 대각의합을 최대값에 재할당하기
        maxSum = Math.max(maxSum, diagonalSum1);
        maxSum = Math.max(maxSum, diagonalSum2);

        answer += maxSum;
        
        return answer;
    }

    private static int calculateRowSum(int[][] grid, int row) {
        int sum = 0;
        for (int j = 0; j < grid[row].length; j++) {
            sum += grid[row][j];
        }
        return sum;
    }

    private static int calculateColSum(int[][] grid, int col) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += grid[i][col];
        }
        return sum;
    }

    private static int calculateDiagonalSum1(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length && i < 5; i++) {
            sum += grid[i][i];
        }
        return sum;
    }

    private static int calculateDiagonalSum2(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length && i < 5; i++) {
            sum += grid[i][grid[i].length - 1 - i];
        }
        return sum;
    }
}