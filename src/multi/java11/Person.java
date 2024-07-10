package multi.java11;

public class Person {

    String name;
    int age;


    public Person() {
        this.name = "홍길동";
        this.age = 1;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void sleep(){
        System.out.println("Person sleep.");
    }
}
