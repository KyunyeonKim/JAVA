package multi.bak;

import java.util.Scanner; // Scanner 클래스를 임포트하여 사용자 입력을 받을 수 있게 함
import java.util.Stack; // Stack 클래스를 임포트하여 스택을 사용할 수 있게 함

public class Bak1874 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체 생성
        int N = sc.nextInt(); // 사용자로부터 정수 N을 입력받음 (스택에 들어갈 숫자의 개수)
        int[] A = new int[N]; // 입력받은 숫자들을 저장할 배열 A 선언
        for(int i=0; i < N; i++){
            A[i] = sc.nextInt(); // 배열 A에 숫자들을 차례대로 입력받음
        }
        Stack<Integer> stack = new Stack<>(); // 정수를 저장할 스택 생성
        StringBuffer bf = new StringBuffer(); // 스택 작업의 결과를 저장할 StringBuffer 객체 생성
        int num=1; // 스택에 넣을 첫 번째 숫자를 1로 초기화

        boolean result = true; // 결과값이 유효한지를 확인하는 플래그

        for(int i = 0; i < A.length; i++){ // 배열 A의 각 요소에 대해 반복
            int su= A[i]; // 현재 처리할 숫자 su를 배열 A에서 가져옴
            if (su >= num) { // su가 현재 스택에 들어갈 숫자 num보다 크거나 같은 경우
                while (su >= num) { // su가 num보다 크거나 같을 때까지 반복
                    stack.push(num++); // 스택에 num을 넣고, num을 1 증가
                    bf.append("+\n"); // bf에 '+' 기호와 줄바꿈을 추가 (스택에 숫자를 넣는 동작을 나타냄)
                }
                stack.pop(); // 스택의 맨 위 숫자를 제거
                bf.append("-\n"); // bf에 '-' 기호와 줄바꿈을 추가 (스택에서 숫자를 빼는 동작을 나타냄)
            }
            else { // su가 num보다 작은 경우
                int n = stack.pop(); // 스택의 맨 위 숫자를 제거하고 n에 저장

                if(n > su){ // n이 su보다 크면 목표 시퀀스를 만들 수 없음
                    System.out.println("NO"); // "NO"를 출력
                    result = false; // 결과 플래그를 false로 설정
                    break; // 반복문 종료
                }
                else{
                    bf.append("-\n"); // bf에 '-' 기호와 줄바꿈을 추가 (스택에서 숫자를 빼는 동작을 나타냄)
                }
            }
        }
        if(result) System.out.println(bf.toString()); // 최종 결과가 유효하면 bf에 저장된 스택 작업 결과를 출력


    }
}
