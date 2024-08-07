package multi.java14;

public class PersonVO {

    private int num;
    private String name;
    private int age;

    public PersonVO(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public PersonVO() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonVO{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
