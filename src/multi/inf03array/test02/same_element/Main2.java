package multi.inf03array.test02.same_element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    /*
     * **********앞선 문제와 유사하다************ 공통원소 구하기 : 투 포인터스 알고리즘(O(n)) - 오름차순이
     * 선행되어져야한다.
     *
     * A,B 두개의 집합이 주어지면 두 집합의 공통 원소(교집합)를 추출하여 오름차순으로 출력하는 프로그램 5 1 3 9 5 2 5 3 2 5
     * 7 8
     *
     * 출력예시 2 3 5
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int[] sus1 = new int[n];
//		for (int i = 0; i < sus1.length; i++) {
//			sus1[i] = s.nextInt();
//		}
//		int m = s.nextInt();
//		int[] sus2 = new int[m];
//		for (int i = 0; i < sus2.length; i++) {
//			sus2[i] = s.nextInt();
//		}
        // 테스트용
        int n = 5;
        int m = 5;
        Integer[] sus1 = new Integer[] { 1, 3, 9, 5, 2 };
        Integer[] sus2 = new Integer[] { 3, 2, 5, 7, 8 };
        System.out.println(solution(n, sus1, m, sus2));
    }

    private static String solution(int n, Integer[] a, int m, Integer[] b) {
        String answer = "";
        //1.a배열의 모든 요소를 리스트에 등록
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));

        //2.공통된 요소들만 모아놓을 리스트
        ArrayList<Integer> result = new ArrayList<>();

        //3.b배열을 반복하면서 공통요소를 찾고 result에 추가
        for (int i = 0; i < b.length; i++) {
//			System.out.println(list.contains(b[i]));
            if(list.contains(b[i])) {
                System.out.println(b[i]);
                result.add(b[i]);
            }
        }
        Collections.sort(result);

        for (Integer x : result) {
            answer += x + " ";
        }

        return answer;
    }
}