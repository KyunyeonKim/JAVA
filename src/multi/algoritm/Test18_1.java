package multi.algoritm;

import java.util.Arrays;

public class Test18_1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// 다음과 같이 삼각형 모양으로 숫자를 배열했습니다.
		// 3
		// 7 4
		// 2 4 6
		// 8 5 9 3
		// 삼각형의 꼭대기부터 아래쪽으로 인접한 숫자를 찾아 내려가면서
		// 합을 구하면, 위의 그림처럼 3 + 7 + 4 + 9 = 23 이
		// 가장 큰 합을 갖는 경로가 됩니다.
		// 다음 삼각형에서 합이 최대가 되는 경로를 찾아서 그 합을 구하세요.

		// 75
		// 95 64
		// 17 47 82
		// 18 35 87 10
		// 20 04 82 47 65
		// 19 01 23 75 03 34
		// 88 02 77 73 07 63 67
		// 99 65 04 28 06 16 70 92
		// 41 41 26 56 83 40 80 70 33
		// 41 48 72 33 47 32 37 16 94 29
		// 53 71 44 65 25 43 91 52 97 51 14
		// 70 11 33 28 77 73 17 78 39 68 17 57
		// 91 71 52 38 17 14 91 43 58 50 27 29 48
		// 63 66 04 68 89 53 67 30 73 16 69 87 40 31
		// 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

		// 참고: 여기서는 경로가 16384개밖에 안되기 때문에,
		// 모든 경로의 합을 일일이 계산해서 답을 구하는 것이 가능합니다.
		// 하지만 67번 문제에는 100층짜리 삼각형 배열이 나옵니다.
		// 그런 경우에는 좀 더 현명한 풀이 방법을 찾아야겠지요.

		// 1.작은 삼각 샘플 처리(총경우의 수는 2의 (층수-1)제곱 : 8)
//		 System.out.println("1.총경우의 수:"+Math.pow(2, 4-1));
//		 test01();

		// 2.큰 삼각 실제문제 처리(총경우의 수는 2의 (층수-1)제곱 : 8)
		System.out.println("2.총경우의 수:" + Math.pow(2, 15 - 1));
		test02();

		System.out.println("Time:" + (System.currentTimeMillis() - startTime));
	}

	private static void test02() {
		System.out.println("==========");

		String[] arr1 = "75 ".split(" ");
		String[] arr2 = "95 64".split(" ");
		String[] arr3 = "17 47 82".split(" ");
		String[] arr4 = "18 35 87 10".split(" ");
		String[] arr5 = "20 04 82 47 65".split(" ");
		String[] arr6 = "19 01 23 75 03 34".split(" ");
		String[] arr7 = "88 02 77 73 07 63 67".split(" ");
		String[] arr8 = "99 65 04 28 06 16 70 92".split(" ");
		String[] arr9 = "41 41 26 56 83 40 80 70 33".split(" ");
		String[] arr10 = "41 48 72 33 47 32 37 16 94 29".split(" ");
		String[] arr11 = "53 71 44 65 25 43 91 52 97 51 14".split(" ");
		String[] arr12 = "70 11 33 28 77 73 17 78 39 68 17 57".split(" ");
		String[] arr13 = "91 71 52 38 17 14 91 43 58 50 27 29 48".split(" ");
		String[] arr14 = "63 66 04 68 89 53 67 30 73 16 69 87 40 31".split(" ");
		String[] arr15 = "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23".split(" ");
		String[][] arrs = new String[][] { arr1, arr2, arr3, arr4, arr5, arr6, arr7, arr8, arr9, arr10, arr11, arr12,
				arr13, arr14, arr15 };

		int[][] triangle = new int[arrs.length][];
		for (int x = 0; x < triangle.length; x++) {
			triangle[x] = Arrays.stream(arrs[x]).mapToInt(Integer::parseInt).toArray();
		}

		System.out.println("==========");
		for (int x = triangle.length - 1; x > 0; x--) {
			int[] sus = triangle[x];
			int[] sus_1 = triangle[x - 1];
			for (int i = 0; i < triangle[x - 1].length; i++) {
				if (sus[i] > sus[i + 1]) {
					sus_1[i] += sus[i];
				} else {
					sus_1[i] += sus[i + 1];
				}
				System.out.println(sus_1[i]);
			}
		}
		System.out.println("maxSum:" + triangle[0][0]);
	}

	private static void test01() {
		System.out.println("==========");

		String[] arr1 = "3 ".split(" ");
		String[] arr2 = "7 4".split(" ");
		String[] arr3 = "2 4 6".split(" ");
		String[] arr4 = "8 5 9 3".split(" ");
		String[][] arrs = new String[][] { arr1, arr2, arr3, arr4 };

		int[][] triangle = new int[arrs.length][];
		for (int x = 0; x < triangle.length; x++) {
			triangle[x] = Arrays.stream(arrs[x]).mapToInt(Integer::parseInt).toArray();
		}

		System.out.println("==========");
		// 0.모든 경우의 수를 출력하는문제가 아니고 합산결과 중에서 가장큰값을 출력하는것이 목적
		// 1.항상 밑줄에 있는 큰수와 윗줄에 있는 수가 합산되어진다.
		// 2.윗줄과 합산가능한 밑줄 정수는 두개뿐이다.
		// 3.밑줄과 합산된 윗줄 정수는 합산된 정수로 대체시킨다.
		for (int x = triangle.length - 1; x > 0; x--) {// 밑줄부터 체크하기위해 배열을 역으로 돌린다.
			int[] sus = triangle[x];// 긴배열
			int[] sus_1 = triangle[x - 1];// 긴배열-1번째 배열
			for (int i = 0; i < triangle[x - 1].length; i++) {
				if (sus[i] > sus[i + 1]) {
					sus_1[i] += sus[i];
				} else {
					sus_1[i] += sus[i + 1];
				}
				System.out.println(sus_1[i]);
			}

		}
		System.out.println("maxSum:" + triangle[0][0]);
	}

}