package multi.LIFOFIFO;

import java.util.Stack;

public class Main02 {

    public static void main(String[] args) {
        //스택에 코인객체를 쌓아보자
        Stack<Coin> st = new Stack<>();
        st.push(new Coin(1000));
        st.push(new Coin(10000));
        st.push(new Coin(100000));
        st.push(new Coin(1000000));

        System.out.println(st);
        System.out.println(st.size());

        System.out.println(st.pop());

        System.out.println(st.peek());

        //데이터 클래스 적용해야 검색됨
        System.out.println(st.contains(new Coin(1000)));

        System.out.println(st.empty());
    }



}
