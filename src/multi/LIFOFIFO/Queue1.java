package multi.LIFOFIFO;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

        Queue<Message>q = new LinkedList<>();
        q.offer(new Message("mesaage","int"));
        System.out.println(q.size());


    }

}
