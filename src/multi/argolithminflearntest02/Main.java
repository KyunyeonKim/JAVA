package multi.argolithminflearntest02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
//		String str = "StuDY";
		
		System.out.println(solution(str));

		
	}//end main

	private static String solution(String str) {
//		System.out.printf("%s\n",str);
		String answer = "";
		
		String[] arr = str.split("");
//		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Character.isUpperCase(arr[i].charAt(0)));
			if(Character.isUpperCase(arr[i].charAt(0))) {
				arr[i] = arr[i].toLowerCase();
			}else {
				arr[i] = arr[i].toUpperCase();
			}
		}
//		System.out.println(Arrays.toString(arr));
		answer = String.join("", arr);
		return answer;
	}

}//end class