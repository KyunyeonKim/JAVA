package multi.test.com;

public class StudentDAO {

    int insert(StudentVO vo){
        System.out.println(vo);
        System.out.println("int insert");
        return 1;
    }

    int update(StudentVO vo){
        System.out.println("int update");
        System.out.println(vo);
        return 1;
    }

    int delete(StudentVO vo){
        System.out.println(vo);
        System.out.println("int delelte");
        return 1;
    }

    int SelectOne(StudentVO vo){
        System.out.println(vo);
        System.out.println("int selectone");
        return 1;
    }

    public StudentVO[] selectAll() {

        System.out.println("studentvo");
        StudentVO[] students = new StudentVO[10]; // 예: 최대 10명의 학생을 가져오는 배열

        return students;
    }


    public StudentVO[] searchList(String fieldName, String value) {

        StudentVO[] students = new StudentVO[5]; // 예: 최대 5명의 학생을 가져오는 배열


        return students;
    }


}
