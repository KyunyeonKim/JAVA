package multi.substring;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        // 스캐너 객체를 생성하여 사용자로부터 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 문자열을 입력받습니다.
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        // 특정 알파벳 'c'가 처음 등장하는 위치를 찾습니다.
        int index = input.indexOf('c');

        // 만약 'c'가 문자열에 존재하면 해당 위치부터 끝까지 출력합니다.
        // 그렇지 않으면, 해당 문자가 없다는 메시지를 출력합니다.
        if (index != -1) {
            System.out.println("결과: " + input.substring(index));
        } else {
            System.out.println("'c' 문자가 입력 문자열에 없습니다.");
        }

        // 스캐너 객체를 닫습니다.
        scanner.close();
    }
}
