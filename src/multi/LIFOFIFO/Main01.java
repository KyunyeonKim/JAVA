package multi.LIFOFIFO;

import java.util.Stack;

public class Main01 {
    public static void main(String[] args) {

        //LIFO - Last in first out

        //1.stack
        Stack<Integer>st = new Stack<>();
        st.push(5001);
        st.push(5002);
        st.push(5003);
        st.push(5004);

        //데이터가 요소에 있는지 검증
        System.out.println(st);
        System.out.println(st.size());

        System.out.println(st.pop());
        System.out.println(st.size());

        System.out.println(st.pop());
        System.out.println(st.size());

        System.out.println(st.empty());

        if(!st.empty()){
            System.out.println();
        }



        System.out.println(st.pop());
        System.out.println(st.size());


        Stack<String>kim = new Stack<>();
        kim.push("kim1");
        kim.push("kim2");
        kim.push("kim3");
        kim.push("kim4");

        System.out.println(kim);
        System.out.println(kim.size());



    }
}
