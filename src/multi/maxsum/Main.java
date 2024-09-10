package multi.maxsum;

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
        strs[0] = "10 13 10 12 15";
        strs[1] = "12 39 30 23 11";
        strs[2] = "11 25 50 53 15";
        strs[3] = "19 27 29 37 27";
        strs[4] = "19 13 30 13 19";

        System.out.println(solution(strs));

    }// end main

    private static String solution(String[] strs) {
        System.out.println(strs.length);
        System.out.println(Arrays.toString(strs));
        String answer = "";

        //1. 각행+각열+좌대각+우대각 : 개수만큼의 합계배열
        int[] sums = new int[strs.length*2 + 2];

        //2.문자열 배열 >> 2차원의 정수배열 변환
        int[][] grid = new int[strs.length][strs.length];
        for (int i = 0; i < grid.length; i++) {
            String[] arr = strs[i].split(" ");
            int[] score = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
            grid[i] = score;
        }
        for (int[] is : grid) {
            System.out.println(Arrays.toString(is));
        }

        //3.반복문 각줄의 합계를 합계배열에 할당.
        //sums : 0,0,0,0,0,0,0,0,0,0,0,0
        //3-1. 행,열 반복문 10개 합계결과
        for (int x = 0; x < grid.length; x++) {
            //행합
            sums[x] = Arrays.stream(grid[x]).sum();

            //열합
            int[] cols =  new int[grid[x].length];
            for (int i = 0; i < grid[x].length; i++) {
                System.out.print(grid[i][x] + " ");
                cols[i] = grid[i][x];
            }
            System.out.println();
            sums[x+grid.length] = Arrays.stream(cols).sum();
        }
        System.out.println(Arrays.toString(sums));
        System.out.println("=====");
        //3-1. 좌대각 반복문 1개 합계결과 >> sums배열 끝에서 두번째에 할당
        int[] cross1 = new int[grid.length];
        for (int i = 0; i < cross1.length; i++) {
//			System.out.println(grid[i][cross1.length-1-i]);
            cross1[i] = grid[i][cross1.length-1-i];
        }
        sums[sums.length-2] = Arrays.stream(cross1).sum();
        System.out.println(Arrays.toString(sums));

        //3-2. 우대각 반복문 1개 합계결과 >> sums배열 끝에 할당
        int[] cross2 = new int[grid.length];
        for (int i = 0; i < cross1.length; i++) {
//			System.out.println(grid[i][i]);
            cross2[i] = grid[i][i];
        }
        sums[sums.length-1] = Arrays.stream(cross2).sum();
        System.out.println(Arrays.toString(sums));

        //4. 합계배열에서 최대값을 얻어내서 리턴
        answer += Arrays.stream(sums).max().getAsInt();

        return answer;
    }
}// end class
