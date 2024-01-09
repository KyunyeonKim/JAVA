import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bak2164 {
    public static void main(String[] args){
        // 사용자의 입력을 읽기 위해 Scanner 객체를 생성합니다.
        Scanner sc = new Scanner(System.in);

        // 정수형 Queue를 LinkedList 구현체를 사용하여 생성합니다.
        Queue<Integer> myQueue = new LinkedList<>();

        // 사용자로부터 정수 'N'을 입력받습니다.
        int N = sc.nextInt();

        // 큐에 1부터 N까지의 숫자를 채웁니다.
        for(int i = 1; i <= N; i++){
            myQueue.add(i);
        }

        // 큐에 하나의 원소만 남을 때까지 계속 과정을 수행합니다.
        while (myQueue.size() > 1){
            // 큐의 맨 앞에 있는 원소를 제거합니다.
            myQueue.poll();

            // 다음 원소를 큐의 뒤로 이동합니다.
            myQueue.add(myQueue.poll());
        }

        // 큐에 남아 있는 마지막 원소를 출력합니다.
        System.out.println(myQueue.poll());
    }
}