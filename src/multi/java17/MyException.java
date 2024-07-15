package multi.java17;

public class MyException extends Exception {

    int age;

    public MyException(){

    }

    public MyException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "age=" + age +
                '}';
    }
}
