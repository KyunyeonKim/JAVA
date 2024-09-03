package multi.LIFOFIFO;

import java.util.LinkedList;
import java.util.Queue;

public class Main03 {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(5001);
        q.offer(5002);
        q.offer(5003);
        q.offer(5004);

        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.contains(5003));//있으면 참
        System.out.println(q.poll());//처음들어간것부터 뽑기
        System.out.println(q);

        while (!q.isEmpty()){
            System.out.println(q.poll());
            System.out.println(q);
        }
    }
}
