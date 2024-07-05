package multi.test.com;

public class Student {

    public int member;

    public String name;

    public int kor;

    public int eng;

    public int math;


    public Student(int member,String name,int kor,int eng,int math){
        this.member = member;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;


    }

    public Student() {
         member = 0;
         name =null;
         kor = 0;
         eng = 0;
         math = 0;
    }
}


