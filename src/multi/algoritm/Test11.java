package multi.algoritm;

import java.util.ArrayList;

public class Test11 {

	public static void main(String[] args) {
		// 아래와 같은 20×20 격자가 있습니다.

		// 위에서 대각선 방향으로 연속된 []안에 숫자
		// 네 개의 곱은 26 × 63 × 78 × 14 = 1788696 입니다.
		// 그러면 수평, 수직, 또는 좌우대각선 방향으로
		// 연속된 숫자 네 개의 곱 중 최대값은 얼마입니까?

		String strData = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 "
				+ "49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 "
				+ "81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 "
				+ "52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 "
				+ "22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 "
				+ "24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 "
				+ "32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 "
				+ "67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 "
				+ "24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 "
				+ "21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 "
				+ "78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 "
				+ "16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 "
				+ "86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 "
				+ "19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 "
				+ "04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 "
				+ "88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 "
				+ "04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 "
				+ "20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 "
				+ "20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 "
				+ "01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";

		int[][] intArrays = parseIntArrays(strData);
		int h = getHorizontalMax(intArrays);
		int v = getVerticalMax(intArrays);
		int dRight = getDiagonalRightMax(intArrays);
		int dLeft = getDiagonalLeftMax(intArrays);
		System.out.println("getHorizontalMax(intArrays):" + h);
		System.out.println("getVerticalMax(intArrays):"+v);
		System.out.println("getDiagonalMax(intArrays):"+dRight);
		System.out.println("getDiagonalMax(intArrays):"+dLeft);
		System.out.println(Math.max(Math.max(h, v), Math.max(dRight, dLeft)));
	}

	private static int[][] parseIntArrays(String strData) {
		String[] datas = strData.split(" ");

		//1.정수 2차원배열 생성
		int[][] intArrays = new int[20][20];
		

		
		//2.정수 2차원배열에 할당
		for (int x = 0; x < intArrays.length; x++) {
			for (int i = 0; i < intArrays.length; i++) {
				// 20개씩 잘라서 각행에 할당(x * 20)
				intArrays[x][i] = Integer.parseInt(datas[x * 20 + i]);
			}
		}


		return intArrays;
	}

	private static int getVerticalMax(int[][] intArrays) {
		int verticalMax = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int x = 0; x < intArrays.length - 3; x++) {
			for (int i = 0; i < intArrays[x].length; i++) {
				verticalMax = intArrays[x][i] * intArrays[x + 1][i] * intArrays[x + 2][i] * intArrays[x + 3][i];
				list.add(verticalMax);
			}
		}

		list.sort((o1, o2) -> o2 - o1);

		int VerticalMax = list.get(0);
		System.out.println("VerticalMax:"+VerticalMax);

		return list.get(0);
	}

	private static int getHorizontalMax(int[][] intArrays) {
		int horizontal = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int x = 0; x < intArrays.length; x++) {
			for (int i = 0; i < intArrays[x].length - 3; i++) {
				horizontal = intArrays[x][i] * intArrays[x][i + 1] * intArrays[x][i + 2] * intArrays[x][i + 3];
				list.add(horizontal);
			}
		}

		int HorizontalMax = list.get(0);
		System.out.println("HorizontalMax:"+HorizontalMax);

		return list.get(0);
	}

	private static int getDiagonalRightMax(int[][] intArrays) {
		int diagonal = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int x = 0; x < intArrays.length - 3; x++) {
			for (int i = 0; i < intArrays[x].length - 3; i++) {
				diagonal = intArrays[x][i] * intArrays[x + 1][i + 1] * intArrays[x + 2][i + 2]
						* intArrays[x + 3][i + 3];
//				System.out.println(intArrays[x][i] + "*" + intArrays[x + 1][i + 1] + "*" + intArrays[x + 2][i + 2] + "*"
//						+ intArrays[x + 3][i + 3]);
				list.add(diagonal);
			}
		}

		list.sort((o1, o2) -> o2 - o1);

		int DiagonalRightMax = list.get(0);
		System.out.println("DiagonalRightMax:"+DiagonalRightMax);

		return list.get(0);
	}

	private static int getDiagonalLeftMax(int[][] intArrays) {
		int diagonal = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int x = 0; x < intArrays.length - 3; x++) {
			for (int i = 3; i < intArrays[x].length; i++) {
				diagonal = intArrays[x][i] * intArrays[x + 1][i - 1] * intArrays[x + 2][i - 2]
						* intArrays[x + 3][i - 3];

				list.add(diagonal);
			}
		}

		list.sort((o1, o2) -> o2 - o1);

		
		int DiagonalLeftMax = list.get(0);
		System.out.println("DiagonalLeftMax:"+DiagonalLeftMax);


		return list.get(0);
	}
}