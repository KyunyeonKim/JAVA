package multi.argolithminflearntest02;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
//		String str = "StuDY";
		
		System.out.println(solution(str));

		
	}//end main

	private static String solution(String str) {
//		System.out.printf("%s\n",str);
		String answer = "";
		
		//2.스트림
		answer =  Arrays.asList(str.split("")).stream()
					.map(x->{
						if(Character.isUpperCase(x.charAt(0))) {
							return x.toLowerCase();
						}else {
							return  x.toUpperCase();
						}
					}).collect(Collectors.joining());//String.join("",arr)
		return answer;
	}

}//end class