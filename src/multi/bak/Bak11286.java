package multi.bak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Bak11286 {
    public static void main(String[] args)throws IOException{
        // 버퍼를 이용해 입력을 받습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 첫 번째 입력, 연산의 개수
        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1); // 첫 번째 숫자의 절대값
            int second_abs = Math.abs(o2); // 두 번째 숫자의 절대값
            if(first_abs == second_abs) // 절대값이 같을 경우
                return o1 > o2 ? 1 : -1; // 원래 수의 크기로 비교
            else
                return first_abs - second_abs; // 절대값이 다르면 절대값으로 비교
        });

        for (int i=0; i < N; i++){
            int request = Integer.parseInt(br.readLine()); // 연산에 사용될 숫자 입력
            if (request == 0){ // 0이 입력되면
                if(MyQueue.isEmpty()) // 큐가 비어있으면
                    System.out.println("0"); // 0 출력
                else
                    System.out.println(MyQueue.poll()); // 큐에서 하나를 꺼내 출력
            }else{
                MyQueue.add(request); // 0이 아닌 수가 입력되면 큐에 추가
            }
        }
    }
}