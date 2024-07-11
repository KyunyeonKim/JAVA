package multi.java13innerclass;

public  abstract class Father {
    public abstract void work();


    //final클래스는 상속금지
    //final메소드는 오버라이딩 금지시킴
    public final void sleep(){
        System.out.println("sleep()...");
    }


}
