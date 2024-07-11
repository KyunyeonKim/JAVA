package multi.java13innerclass;

public class Main05 {
    public static void main(String[] args) {
        //3.멤버 내부 클래스(가장 보편적인 내부 클래스)
        MemberOuther outer = new MemberOuther();
        MemberOuther.Inner inner = outer.new Inner();
        inner.test();
    }

}
